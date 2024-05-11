package Example;

import javax.swing.*;

public class Q20 {
    public static void main(String[] args) {


        int[][] a = new int[5][5];
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = count;
                    count++;
                }
            } else {
                for (int j = a.length-1; j >= 0; j--) {
                    a[i][j] = count;
                    count++;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
        }
    }
}