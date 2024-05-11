package Day03;

import java.util.Scanner;

public class Q1_2 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int month = sc.nextInt();
        System.out.print("온도 입력 : ");
        int temp = sc.nextInt();
        //2. 출력

        //2-3 잘못된 입력
        if(temp <-15 || temp > 37){
            System.out.println("잘못된 입력입니다.");
        }
        //2-1, 2-2 올바른 입력 범위 안 잘못된 입력
        else{
            switch (month){
                case 3:
                case 4:
                case 5:
                    if(temp >=3 && temp <=15){
                        System.out.println("계절을 봄입니다. 온도는 "+temp+"도 입니다.");
                    }
                    else{
                        System.out.println("계절과 온도가 맞지 않습니다.");
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    if(temp >=3 && temp <=15){
                        System.out.println("계절을 가을입니다. 온도는 "+temp+"도 입니다.");
                    }
                    else{
                        System.out.println("계절과 온도가 맞지 않습니다.");
                    }
                    break;
                case 9:
                case 10:
                case 11:
                    if(temp >=3 && temp <=15){
                        System.out.println("계절을 가을입니다. 온도는 "+temp+"도 입니다.");
                    }
                    else{
                        System.out.println("계절과 온도가 맞지 않습니다.");
                    }
                    break;
                case 1:
                case 2:
                case 12:
                    if(temp >=-15 && temp <=2){
                        System.out.println("계절을 겨울입니다. 온도는 "+temp+"도 입니다.");
                    }
                    else{
                        System.out.println("계절과 온도가 맞지 않습니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");

            }
        }
    }
}
