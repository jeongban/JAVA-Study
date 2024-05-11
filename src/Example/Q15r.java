package Example;

import java.util.Random;
import java.util.Scanner;

public class Q15r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] com = new int[3];
        for (int i = 0; i < com.length; i++) {
            com[i] = r.nextInt(9) + 1;
        }
        while (com[0] == com[1] || com[1] == com[2] || com[0] == com [2]) {
            com[0] = r.nextInt(9)+1;
            com[1] = r.nextInt(9)+1;
            com[2] = r.nextInt(9)+1;
        }
        int strike = 0;
        int ball = 0;
        while (strike < 3) {
            System.out.print("첫번째입력 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째입력 : ");
            int num2 = sc.nextInt();
            System.out.print("세번째입력 : ");
            int num3 = sc.nextInt();
            if (num1 == num2 || num2 == num3 || num1 == num3 || num1 < 0 || num1 > 9 || num2 < 0 || num2 > 9 || num3 < 0 || num3 > 9) {
                System.out.println("잘못된 입력");
            } else {
                strike = 0;
                ball = 0;
                if (num1 == com[0]) {
                    strike++;
                }
                if (num2 == com[1]) {
                    strike++;
                }
                if (num3 == com[2]) {
                    strike++;
                }
                if (num1 == com[1] || num1 == com[2]) {
                    ball++;
                }
                if (num2 == com[0] || num2 == com[2]) {
                    ball++;
                }
                if (num3 == com[0] || num3 == com[1]) {
                    ball++;
                }
                if (strike == 3) {
                    System.out.println("홈런");
                } else if (strike == 0 && ball == 0) {
                    System.out.println("아웃");
                } else {
                    System.out.println(strike + "스트라이크" + ball + "볼");
                }
            }

        }
    }
}
