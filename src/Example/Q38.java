package Example;

import java.util.Scanner;

public class Q38 {
    static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        return sc.next();
    }
    static String makeResult(String str) {
        //11 22 33 5 * # 66
        int count = 0;
        String result = "";
        char ch = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;

            } else {
                //System.out.print(count + " ");
                result += makeChar(count, ch);
                ch = str.charAt(i);
                count = 1;
            }
        }//System.out.println(count);
        result += makeChar(count, ch);
        return result;
    }
    static char makeChar(int count, char ch){
        char result;
        char[][] key = {
                {'A', 'B', 'C'}, // 1
                {'D', 'E', 'F'}, // 2
                {'G', 'H', 'I'}, // 3
                {'J', 'K', 'L'}, // 4
                {'M', 'N', 'O'}, // 5
                {'P', 'Q', 'R'}, // 6
                {'S', 'T', 'U'}, // 7
                {'V', 'W', 'X'}, // 8
                {'Y'}, // 9
                {'*'},
                {'Z'}, // 0
                {'#'}
        };
        if (ch == '9') {
            result = key[8][0];
        } else if (ch == '*') {
            result = key[9][0];
        } else if (ch == '0') {
            result = key[10][0];
        } else if (ch == '#') {
            result = key[11][0];
        } else {
            count = (count - 1) % 3;
            result = key[(ch - '0')-1][count];
        }

        return result;
    }
    public static void main(String[] args) {
        String a = makeResult(input());
        System.out.print(a);
    }
}
