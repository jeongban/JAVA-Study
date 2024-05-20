package Example;

import java.util.Random;
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int num = r.nextInt(31)+1;

        while (true) {
            System.out.print("숫자 입력 : ");
            int input = sc.nextInt();
            if (input < 0 || input > 31) {
                System.out.println("잘못된 입력");
            } else {
                if (input > num) {
                    System.out.println("다운");
                } else if (input < num) {
                    System.out.println("업");
                } else {
                    System.out.println("정답 : " + num);
                    break;
                }
            }
        }

    }
}
