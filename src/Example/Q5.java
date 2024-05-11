package Example;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 : ");
        String oper = sc.next();
        //잘못된 연산자
        if (!(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/"))) {
            System.out.println("잘못된 입력");
        }//옳은 연산
        else {
            //더하기
            if (oper.equals("+")) {
                System.out.printf("결과값 : %d", num1 + num2);
            }
            //곱하기
            else if (oper.equals("*")) {
                System.out.printf("결과값 : %d", num1 * num2);
            }
            //빼기
            else if (oper.equals("-")) {
                System.out.printf("결과값 : %d", num1 - num2);
            }
            //나누기 소숫점 첫째
            else {
                System.out.printf("결과값 : %.1f", (double) num1/num2);
            }
        }


    }
}
