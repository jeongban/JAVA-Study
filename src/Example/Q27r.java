package Example;

import java.util.Random;

public class Q27r {
    static int rNumMake() {
        Random r = new Random();
        return r.nextInt(26);
    }

    static int add(int ran) {
        return 65 + ran;
    }
    static char makeChar(int ran) {
        char result = (char) ran;
        return result;
    }
    static void cycle(){
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += makeChar(add(rNumMake()));
        }
        print(result);
    }
    static String charAdd(char a) {
        return "" + a;
    }
    static void print(String charAdd) {
        System.out.println(charAdd);
    }

    public static void main(String[] args) {
        cycle();
    }
}
