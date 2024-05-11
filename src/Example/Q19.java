package Example;

import java.util.Random;

public class Q19 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(11);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.print(max + " ");
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                System.out.println(i);
            }
        }
    }
}
