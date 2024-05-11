package Example;

import java.util.Scanner;

public class Q23r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] a = new int[num][num];

        int r = 0; //행
        int h = -1; // 열
        int k = num;//반복할 횟수
        int sw = 1;//증감시킬 스위치
        int v = 1;//값

        while (k <= num && k >= 0) {
            for (int i = 0; i < k; i++) {//행
                h = h + sw;
                a[r][h] = v++;
            }
            k--;//반복 횟수 감소

            for (int i = 0; i < k; i++) {//열
                r = r + sw;
                a[r][h] = v++;
            }
            sw = sw * -1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

