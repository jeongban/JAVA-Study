package Example;
class Pencil{
    String color = "";
    void pencilPrint() {
        System.out.println("쓰는 기능은 " + color + " 연필로 적습니다.");
    }
}

class Eraser {
    String made = "";
    void eraserPrint() {
        System.out.println("지우개를 " + made +" 제품으로 지웁니다.");
    }
}

class Pen {
    String color = "";
    String made = "";
    void penPrint() {
        System.out.println(made + " 제품의 " + color +"색으로 씁니다.");
    }
}
public class Q31 {
    public static void main(String[] args) {
        Pencil red = new Pencil();
        Pencil blue = new Pencil();
        Pencil orange = new Pencil();
        Pencil yellow = new Pencil();
        red.color = "빨간색";
        blue.color = "파란색";
        orange.color = "주황색";
        yellow.color = "노란색";
        red.pencilPrint();
        blue.pencilPrint();
        orange.pencilPrint();
        yellow.pencilPrint();

        Eraser e1 = new Eraser();
        Eraser e2 = new Eraser();
        e1.made = "잠자리";
        e2.made = "모닝글로리";
        e1.eraserPrint();
        e2.eraserPrint();

        Pen p1 = new Pen();
        Pen p2 = new Pen();
        Pen p3 = new Pen();
        p1.color = "검정색";
        p2.color = "초록색";
        p3.color = "베이비블루";
        p1.made = "모나미";
        p2.made = "제트스트림";
        p3.made = "워터맨";
        p1.penPrint();
        p2.penPrint();
        p3.penPrint();


    }
}
