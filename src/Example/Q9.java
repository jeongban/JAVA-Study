package Example;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        //반복문
        while (true) {
            System.out.print("1. 원하는 구구단 출력 2. 전체 구구단 출력 3. 종료");
            int select = sc.nextInt();
            //옮은 입력
            if (select == 1) {
                System.out.println("원하는 구구단 : ");
                int gugudan = sc.nextInt();
                System.out.println(gugudan + "단");
                for (int i = 1; i <= 9; i++) {
                    System.out.println(gugudan + "X" + i + "=" + (gugudan*i));
                }
            } else if (select == 2) {
                for (int i = 2; i <= 9; i++) {
                    System.out.println(i + " 단");
                    for (int j = 1; j <= 9; j++) {
                        System.out.println(i + "X" + j + "=" + (i * j));
                    }
                }
            } else if (select == 3) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못된 입력");
            }
        }


    }
}
