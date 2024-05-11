package Example;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        int[][] seat = new int[9][2];
        Scanner sc = new Scanner(System.in);
        int count = 18;
        while (count >0) {
            System.out.println("예약하실 좌석을 입력해주세요. 총 " + count + "석");
            System.out.print("행 : ");
            int r = sc.nextInt();
            System.out.print("열 : ");
            int h = sc.nextInt();
            if (r < 0 || r > 9 || h < 0 || h > 1) {
                System.out.println("잘못된 입력입니다.");
            } else {
                if (seat[r][h] == 1) {
                    System.out.println("비어있는 좌석");
                    for (int i = 0; i < seat.length; i++) {
                        for (int j = 0; j < seat[i].length; j++) {
                            if (seat[i][j] != 1) {
                                System.out.println(i + "," + j);
                            }
                        }
                    }
                } else {
                    System.out.println("예약이 완료되었습니다.");
                    seat[r][h] = 1;
                    count--;
                }
                }
            }
        System.out.println("예약이 끝났습니다");
        }
    }

