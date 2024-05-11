package Example;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        int r = 1;

        while (r>0) {
            r = a % b;
            a = b;
            b= r;
        }
        System.out.println("최대공약수 " + a );
        System.out.println("최소공배수" + num1*num2/a);
    }
}
