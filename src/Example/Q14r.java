package Example;

import java.util.Random;

public class Q14r {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(9) + 1;
        }
        while (num[0] == num[1] || num[1] == num[2] || num[0] == num [2]) {
            num[0] = r.nextInt(9)+1;
            num[1] = r.nextInt(9)+1;
            num[2] = r.nextInt(9)+1;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }

    }
}
