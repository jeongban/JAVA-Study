package Example;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int math = sc.nextInt();
        //잘못된 입력
        if (kor < 0 || kor > 100) {
            System.out.println("국어점수가 잘못되었습니다.");
        }
        if (math < 0 || math > 100) {
            System.out.println("수학점수가 잘못되었습니다.");
        }
        if (eng < 0 || eng > 100) {
            System.out.println("영어점수가 잘못되었습니다.");
        } else {
            //옳은 입력
            //평균계산 소수점 첫째
            double avg = (double) (kor + eng + math) / 3;
            System.out.println("국어 : " + kor + " 영어 : " + eng + " 수학 : " + math);
            //A+
            if (avg >= 95) {
                System.out.printf("평균은 %.1f점 이고, 학점은 A+입니다.", avg);
            }
            //A
            else if (avg >= 90) {
                System.out.printf("평균은 %.1f점 이고, 학점은 A입니다.", avg);
            }
            //B+
            else if (avg >= 85) {
                System.out.printf("평균은 %.1f점 이고, 학점은 B+입니다.",avg);
            }
            //B
            else if (avg >= 80) {
                System.out.printf("평균은 %.1f점 이고, 학점은 B입니다.",avg);
            }
            //C+
            else if (avg >= 75) {
                System.out.printf("평균은 %.1f점 이고, 학점은 C+입니다.",avg);
            }
            //C
            else if (avg >= 70) {
                System.out.printf("평균은 %.1f점 이고, 학점은 C입니다.",avg);
            }
            //D
            else if (avg >= 60) {
                System.out.printf("평균은 %.1f점 이고, 학점은 D입니다.", avg);
            }
            //F
            else {
                System.out.printf("평균은 %.1f점 이고, 학점은 F입니다.",avg);
            }
        }
    }
}
