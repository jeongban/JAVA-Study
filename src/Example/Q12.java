package Example;

import java.util.Random;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //랜덤
        Random r = new Random();
        //입력
        Scanner sc = new Scanner(System.in);
        //com 가위바위보

        //유저 가위바위보
        while (true) {
            System.out.println("1.게임시작 2. 종료");
            int game = sc.nextInt();
            if (game == 1) {
                int com = r.nextInt(3)+1;
                //유저 입력
                System.out.println("1. 가위 2. 바위 3.보");
                int user = sc.nextInt();
                //com이 가위
                if (user == 1) {
                    if (com == 1) {
                        System.out.println(com + " 비김");
                    } else if (com == 2) {
                        System.out.println(com + " 이김");
                    } else if (com == 3) {
                        System.out.println(com + "짐");
                    } else {
                        System.out.println("잘못된 입력");
                    }
                }
                //com이 바위
                if (user == 2) {
                    if (com == 1) {
                        System.out.println(com + " 짐");
                    } else if (com == 2) {
                        System.out.println(com + " 비김");
                    } else if (com == 3) {
                        System.out.println(com + "이김");
                    } else {
                        System.out.println("잘못된 입력");
                    }
                }
                //com이 보
                if (user == 3) {
                    if (com == 1) {
                        System.out.println(com + " 이김");
                    } else if (com == 2) {
                        System.out.println(com + " 짐");
                    } else if (com == 3) {
                        System.out.println(com + "비김");
                    } else {
                        System.out.println("잘못된 입력");
                    }
                }
            } else {
                System.out.println("종료");
                break;
            }
    }

}
}
