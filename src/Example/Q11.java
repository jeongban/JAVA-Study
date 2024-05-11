package Example;

import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        //랜덤
        Random r = new Random();

        //반복문
        //문자열 변경
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(26) + 65;
            System.out.print((char) num);
        }
    }
}
