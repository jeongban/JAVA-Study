package Example;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = sc.nextInt();
        //약수
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", " );
            }
        }
        System.out.println(num);
    }
}
