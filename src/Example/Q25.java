package Example;

import java.util.Scanner;

public class Q25 {
    static int[] subjectScore() {
        int[] subject = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        subject[0] = sc.nextInt();
        System.out.print("영어 : ");
        subject[1] = sc.nextInt();
        System.out.print("수학 : ");
        subject[2] = sc.nextInt();
        return subject;
    }
    static double average(int[] subjectscore) {
       double avg = subjectscore[0] + subjectscore[1] + subjectscore[2] / 3.0;
       return avg;
    }
    static String grade(double average) {
        String grade;
        if (average >= 95) {
            grade = "A+";
        } else if (average >= 90) {
            grade = "A";
        } else if (average >= 85) {
            grade = "B+";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    static void worngCheck(int[] subjectScore) {
       if (subjectScore[0] < 0 || subjectScore[0] )
    }
    static void worngPrint() {
        System.out.println("잘못된 입력입니다.");
    }
    static void avgPrint(double averge) {
        System.out.println(averge);
    }
    public static void main(String[] args) {
        worngCheck(subjectScore());
    }
}
