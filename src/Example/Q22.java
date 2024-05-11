package Example;


import java.util.Scanner;

public class Q22 {
    static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    static int mul() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 입력 : ");
        int num2 = sc.nextInt();
        int result = num1 * num2;
        return result;
    }

    static void min(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    static void div() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 입력 : ");
        int num2 = sc.nextInt();
        System.out.println(num1 / num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산자 입력 : ");
        String oper = sc.next();

        if (!(oper.equals("+") || oper.equals("-") || oper.equals("/") || oper.equals("*"))) {
            System.out.println("잘못된 입력");
        } else {
            if (oper.equals("+")) {
                System.out.print("숫자 입력 : ");
                int num1 = sc.nextInt();
                System.out.print("숫자입력 : ");
                int num2 = sc.nextInt();
                System.out.println("결과 : " + add(num1, num2));
            } else if (oper.equals("*")) {
                System.out.println(mul());
            } else if (oper.equals("-")) {
                System.out.print("숫자 입력 : ");
                int num1 = sc.nextInt();
                System.out.print("숫자입력 : ");
                int num2 = sc.nextInt();
                min(num1, num2);
            } else {
                div();
            }
        }

    }
}
