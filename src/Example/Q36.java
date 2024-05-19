package Example;

import java.awt.*;
import java.util.Scanner;

class PencilCase {
    ColorPen cp1;
    ColorPen cp2;
    Eraser36 e1;
    Pen36 p1;
    Pen36 p2;
}

class Student {
    String name = "";
    PencilCase p;

    public Student(String name) {
        this.name = name;
        p = new PencilCase();
    }
    boolean checkCP() {
        if (p.cp1 == null || p.cp2 == null) {
            return true;
        } else {
            return false;
        }
    }
    boolean checkE() {
        if (p.e1 == null) {
            return true;
        } else {
            return false;
        }
    }
    boolean checkP() {
        if (p.p1 == null || p.p2 == null) {
            return true;
        } else {
            return false;
        }
    }
    void pencilCasePrint() {
        System.out.println(name + "이 구매한 목록");
        System.out.println(p.cp1 + " 색연필");
        System.out.println(p.cp2 + " 색연필");
        System.out.println(p.e1 + " 지우개");
        System.out.println(p.p1 + " 펜");
        System.out.println(p.p2 + " 펜");
    }
}

class ColorPen {
    String color = "";

    public ColorPen(String color) {
        this.color = color;
    }
}

class Eraser36 {
    String color = "";

    public Eraser36(String color) {
        this.color = color;
    }
}

class Pen36 {
    String color = "";

    public Pen36(String color) {
        this.color = color;
    }
}

class Stationery {
    ColorPen[] cp = new ColorPen[4];
    Eraser36[] e = new Eraser36[2];
    Pen36[] p = new Pen36[4];

    public Stationery() {
        String[] color1 = {"주황색", "초록색", "노란색", "파란색"};
        String[] color2 = {"회색", "빨간색"};

        for (int i = 0; i < cp.length; i++) {
            cp[i] = new ColorPen(color1[i]);
            p[i] = new Pen36(color1[i]);
        }
        for (int i = 0; i < e.length; i++) {
            e[i] = new Eraser36(color2[i]);
        }
    }
}

class Controller {
    void buyColorPencil(Stationery st, Student s, String color) {
        int i = 0;
        for (i = 0; i < st.cp.length; i++) {
            if (st.cp[i] != null) {
                if (st.cp[i].color.equals(color)) {
                    if (s.p.cp1 == null) {
                        s.p.cp1 = st.cp[i];
                    } else {
                        s.p.cp2 = st.cp[i];
                    }
                    st.cp[i] = null;
                    System.out.println(s.name + "이 구매했습니다.");
                    break;
                }
            }
        }
        if (i == st.cp.length) {
            System.out.println("품절입니다.");
        }
    }
    void buyEraser(Stationery st, Student s, String color) {
        int i;
        for (i = 0; i < st.e.length; i++) {
            if (st.e[i] != null) {
                if (st.e[i].color.equals(color)) {
                    if (s.p.e1 == null) {
                        s.p.e1 = st.e[i];
                    }
                    st.e[i] = null;
                    System.out.println(s.name + "이 구매했습니다");
                }
            }
        }
        if (i == st.e.length) {
            System.out.println("품절입니다.");
        }
    }

    void buyPen(Stationery st, Student s, String color) {
        int i;
        for (i = 0; i < st.p.length; i++) {
            if (st.p[i] != null) {
                if (st.p[i].color.equals(color)) {
                    if (s.p.p1 == null) {
                        s.p.p1 = st.p[i];
                    } else {
                        s.p.p2 = st.p[i];
                    }st.p[i] = null;
                    System.out.println(s.name + "이 구매했습니다");
                }
            }
        }
        if (i == st.p.length) {
            System.out.println("품절입니다.");
        }

    }
}

public class Q36 {
    public static void main(String[] args) {
        Stationery stationery = new Stationery();
        Student s1 = new Student("A학생");
        Student s2 = new Student("B학생");
        Scanner sc = new Scanner(System.in);
        Controller c = new Controller();

        while (s1.checkCP()) {
            System.out.println(s1.name+"의 색연필 색을 골라주세요.");
            String color = sc.next();
            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
                c.buyColorPencil(stationery, s1, color);
            }else{
            System.out.println("잘못된 입력");
            }
        }
        while (s2.checkCP()) {
            System.out.println(s2.name+"의 색연필 색을 골라주세요.");
            String color = sc.next();
            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
                c.buyColorPencil(stationery, s2, color);
            } else {
                System.out.println("잘못된 입력");
            }
        }
        while (s1.checkE()) {
            System.out.println(s1.name + "의 지우개 색을 골라주세요");
            String color = sc.next();
            if (color.equals("회색") || color.equals("빨간색")) {
                c.buyEraser(stationery, s1, color);
            } else {
                System.out.println("잘못된 입력");
            }
        }
        while (s2.checkE()) {
            System.out.println(s2.name + "의 지우개 색을 골라주세요.");
            String color = sc.next();
            if (color.equals("회색") || color.equals("빨간색")) {
                c.buyEraser(stationery, s2, color);
            } else {
                System.out.println("잘못된 입력");
            }
        }
        while (s1.checkP()) {
            System.out.println(s1.name + "의 펜 색을 골라주세요");
            String color = sc.next();
            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
                c.buyPen(stationery, s1, color);
            } else {
                System.out.println("잘못된 입력");
            }
        }
        while (s2.checkP()) {
            System.out.println(s2.name + "의 펜 색을 골라주세요");
            String color = sc.next();
            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
                c.buyPen(stationery, s2, color);
            } else {
                System.out.println("잘못된 입력");
            }
        }
        s1.pencilCasePrint();
        s2.pencilCasePrint();
    }

}
