package Example;
class Car{
    String color = "";
    String made = "";
    int max = 0;

    public Car(String color, String made, int max) {
        this.color = color;
        this.made = made;
        this.max = max;
    }
    void drive() {
        System.out.println(color + "색" + made + "자동차를 " + max + "으로 운전합니다.");
    }
}

class Bicycle {
    String made = "";
    String type = "";

    public Bicycle(String made, String type) {
        this.made = made;
        this.type = type;
    }
    void ride() {
        System.out.println(type + " " + made + "자전거를 탑니다");
    }
}
class Bike{
    String color = "";
    String made = "";
    int max = 0;


    public Bike(String color, String made, int max) {
        this.color = color;
        this.made = made;
        this.max = max;
    }
    void ride() {
        System.out.println(color + "색"+made+"오토바이를 "+max+"으로 탑니다.");
    }
}

class Person1 {
    Car c1;
    Car c2;

    public Person1(Car c1, Car c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
}
class Person2{
    Bicycle b;
    Bike bi;

    public Person2(Bicycle b, Bike bi) {
        this.b = b;
        this.bi = bi;
    }
}
public class Q32 {
    public static void main(String[] args) {

        Car c1 = new Car("은", "ford", 220);
        Car c2 = new Car("검정", "BMW", 240);
        Car c3 = new Car("하얀", "삼성", 200);
        Car c4 = new Car("형광", "현대", 180);
        Bicycle b1 = new Bicycle("삼천리", "산악용");
        Bicycle b2 = new Bicycle("자이언트", "접이식");
        Bike bi = new Bike("빨간", "대림", 180);

        Person1 p1 = new Person1(c2, c4);
        c2 = null;
        c4 = null;
        Person2 p2 = new Person2(b1, bi);
        b1 = null;
        bi = null;
        p1.c1.drive();
        p1.c2.drive();
        p2.b.ride();
        p2.bi.ride();

    }
}
