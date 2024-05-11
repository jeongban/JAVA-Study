package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //int ran1, ran2, ran3;
        int ran1 = r.nextInt(9)+1;
        int ran2 = r.nextInt(9)+1;
        int ran3 = r.nextInt(9)+1;

        while(ran1 == ran2 || ran2 == ran3 || ran1 == ran3) {
            ran1 = r.nextInt(9) + 1;
            ran2 = r.nextInt(9) + 1;
            ran3 = r.nextInt(9) + 1;
        }
        System.out.println(ran1+","+ran2+","+ran3);

        /////////////////////////////////////////////////////

        int strike = 0;//스트라이크 변수 선언
        int ball = 0;//볼 변수 선언
        while(strike < 3){//스트라이크가 3개가 되면 반복문 종료
            System.out.print("첫째자리 : ");
            int user1 = sc.nextInt();
            System.out.print("둘째자리 : ");
            int user2 = sc.nextInt();
            System.out.print("셋째자리 : ");
            int user3 = sc.nextInt();

            //잘못된 입력
            //1. 같은수 입력
            //2. 1~9이외의 숫자를 입력

            if(user1 == user2 || user2 == user3 || user1 == user3
                    || user1 < 1 || user1 >9 || user2 < 1 || user2 >9
                    || user3 < 1 || user3 >9
            ){//잘못된 입력
                System.out.println("잘못된 입력 입니다. 올바르게 입력하세요.");
            }
            else{//올바른 입력
                strike = 0;//스트라이크를 0으로 초기화
                ball = 0;//볼을 0으로 초기화
                if(user1 == ran1){//유저1값과 랜덤1값이 같으면 스트라이크+
                    strike++;
                }
                if(user2 == ran2){//유저 2 값과 랜덤 2 값이 같으면 스트라이크 +
                    strike++;
                }
                if(user3 == ran3){//유저 3 값과 랜덤 3 값이 같으면 스트라이크 +
                    strike++;
                }

                if(user1 == ran2 || user1 == ran3){//유저 1값과 랜덤2 값이 같거나 유저1 값과 유저 3 값이 같으면 볼+
                    ball++;
                }
                if(user2 == ran1 || user2 == ran3){//유저 2값과 랜덤 1 값이 같거나 유저 2 값과 랜덤 3 값이 같으면 볼+
                    ball++;
                }
                if(user3 == ran1 || user3 == ran2){//유저3 값과 랜덤 1 값이 같거나 유저 3 값과 랜덤 2 값이 같으며 볼+
                    ball++;
                }
                if(strike == 0 && ball == 0){//일치하는것이 하나도 없어 스트라이크나 볼이 +가 되지 않으면 out
                    System.out.println("Out 입니다.");
                }
                else if(strike == 3){//스트라이크가 3개이면 홈런
                    System.out.println("홈런입니다. 축하합니다.");
                }
                else{//스트라이크와 볼이 +가 있으면 출력
                    System.out.println("strike : "+strike+", ball : "+ball);
                }
            }
        }
    }
}
