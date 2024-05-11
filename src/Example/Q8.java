package Example;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        //숫자입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        //짝수
        System.out.print("짝수 : ");
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }//홀수
        System.out.print("홀수 : ");
        for (int i = 1; i < num; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }

        }


    }
}
