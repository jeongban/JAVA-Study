package Example;

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

public class Q36 {
    public static void main(String[] args) {


    }
}
