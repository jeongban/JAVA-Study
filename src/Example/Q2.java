package Example;
//문제 1
//        숫자를 2개 입력 받습니다.
//        2개 입력 받은 숫자를 더하기, 빼기, 곱하기 나누기, 나머지 연산자(%
//        )로 연산한 결과 값을 출력해 주세요.
//        예)
//        숫자1 : 10(엔터)
//        숫자2 : 5(엔터)
//        10 + 5 = 15
//        10 – 5 = 5
//        10 * 5 = 50
//        10 / 5 = 2
//        10 % 5 = 0


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자2  입력 : ");
        int num2 = sc.nextInt();
        //더하기 결과
        System.out.println("더하기 결과 : " + (num1 + num2));
        //빼기 결과
        System.out.println("빼기 결과 : " + (num1 - num2));
        //곱하기 결과
        System.out.println("곱하기 결과 : " + (num1 * num2));
        //나누기 결과
        System.out.println("나누기 결과 : " + ((double) num1 / num2));
        //나머지 결과
        System.out.println("나머지 결과 : " + (num1 % num2));
    }
}
