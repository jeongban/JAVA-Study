package Example;

import java.util.Random;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력 : ");

        while (true) {
            int input = sc.nextInt();
            if (num < input) {
                System.out.println("다운");
            } else if (num > input) {
                System.out.println("업");
            }
            else  {
                System.out.println(num + " 정답");
                
            }
        }

    }
}
