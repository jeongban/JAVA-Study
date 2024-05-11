package Example;
//숫자 2개를 입력 받아서
//        더하기 빼기 결과 값을
//        출력을 하는 프로그램을
//        만드세요.


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("연산자 입력 : ");
        String oper = sc.next();
        System.out.print("숫자 입력 : ");
        int num2 = sc.nextInt();
        if (oper.equals("+")) {
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 - num2);
        }


    }
}
