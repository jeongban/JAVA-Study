package Example;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //1.월과 온도 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int month = sc.nextInt();
        System.out.print("온도 : ");
        int tem = sc.nextInt();
        if (month >= 1 && month <= 12 && tem >= -15 && tem <= 37) {
            //3월 ~ 5월 봄
            if (month >= 3 && month <= 5) {
                //봄 3~15도
                if (tem >= 3 && tem <= 15) {
                    System.out.println("계절은 봄입니다. 온도는 " + tem + "입니다.");
                }else {
                    System.out.println("계절과 온도가 맞지 않습니다.");
                }
            }
            //6월 ~ 8월 여름
            else if (month >= 6 && month <= 8) {
                //여름 18~37도
                if (tem >= 18 && tem <= 37) {
                    System.out.println("계절은 여름입니다. 온도는 " + tem + "입니다.");
                }else {
                    System.out.println("계절과 온도가 맞지 않습니다.");
                }
            }
            //9월 ~ 11월 가을
            else if (month >= 9 && month <= 11) {
                //가을 3~15도
                if (tem >=3 && tem <=15) {
                    System.out.println("계절은 가을입니다. 온도는 " + tem + "입니다.");
                }else {
                    System.out.println("계절과 온도가 맞지 않습니다.");
                }
            }
            //12월 ~ 2월 겨울
            else {
                //겨울 2~-15도
                if (tem >= -15 && tem <=2) {
                    System.out.println("계절은 겨울입니다. 온도는 " + tem + "입니다.");
                }else {
                    System.out.println("계절과 온도가 맞지 않습니다.");
                }
            }

        } else {
            System.out.println("잘못된 입력.");
        }

    }
}
