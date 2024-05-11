package Example;

import java.util.Random;

public class Q16 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
