package Example;

import java.util.Scanner;

public class Q28 {
    static void play() {
        while (true) {
            int a = inputNum();
            if (a == 1) {
                int b = gugudan();
                if (b == 1) {
                    gugudan1();
                } else {
                    gugudan2();
                }
            } else {
               int c = star();
                if (c == 1) {
                    star1();
                } else if (c == 2) {

                } else if (c == 3) {

                } else if (c == 4) {

                } else {
                }
            }
        }
    }
    static int inputNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.구구단 출력 2.별찍기 출력 3.종료");
        int num = sc.nextInt();
        return num;
    }
    static int gugudan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.원하는 구구단 출력 2.전체 구구단 출력");
        int input = sc.nextInt();
        return input;
    }
    static void gugudan1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 구구단을 입력하세요.");
        int input = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(input + "X" + i + "=" + input * i);
        }
    }
    static void gugudan2() {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i+" 단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
    static int star() {
        System.out.println("1.네모 2.직삼각형 정방향  3.직삼각형 역방향 4. 피라미드 5.다이아몬드");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
    static void star1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void star2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; i < j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void star3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    static void star4() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {

            }
        }
    }
    public static void main(String[] args) {

    }
}
