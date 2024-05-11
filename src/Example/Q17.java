package Example;

import java.util.Random;

public class Q17 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(9)+1;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {//0,1,2,3
            for (int j = i + 1; j < 5; j++) {//1,2,3,4
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
