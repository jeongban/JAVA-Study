package Example;

import java.util.Random;

class Dice {
    String color = "";
    int add = 0;
    Random r = new Random();

    public Dice(String color) {
        this.color = color;
    }

    void addControl() {
        int num = r.nextInt(6) + 1;
        add = add + num;
    }

    void print(String color) {
        System.out.println(color+" "+ add);
    }


}

public class Q35 {
    public static void main(String[] args) {
        Dice blue = new Dice("파란색");
        Dice red = new Dice("빨간색");
        int count = 1;
        while (blue.add < 50 && red.add < 50) {
            System.out.println("----------" + count++ + " 턴");
            blue.addControl();
            red.addControl();
            blue.print(blue.color);
            red.print(red.color);
        }
        if (blue.add > red.add) {
            System.out.println("파란 승");
        } else {
            System.out.println("빨간 승");
        }
    }
}
