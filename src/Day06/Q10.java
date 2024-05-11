package Day06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        //입력
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int num1 = scan.nextInt();
        System.out.print("숫자 2 : ");
        int num2 = scan.nextInt();
        int a = num1;
        int b = num2;
        int r = 1;
        //최소공배수
        while (r > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);

        //최대공약수
        System.out.println(num1*num2/a);
    }
}
