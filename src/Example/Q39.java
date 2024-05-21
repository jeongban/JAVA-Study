package Example;

import java.util.Random;
import java.util.Scanner;

class Citizen{
    boolean check = false; //true 마피아 false시민
    void print() {
        if (check) {
            System.out.println("마피아입니다.");
        } else {
            System.out.println("마피아가 아닙니다.");
        }
    }
}
class Police{
    Scanner sc = new Scanner(System.in);
    int input() {
        System.out.print("마피아는? ");
        return sc.nextInt();
    }
}



public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Citizen[] clist = new Citizen[5];
        Police p = new Police();
        Random r = new Random();
        int num = r.nextInt(5);

        for (int i = 0; i < clist.length; i++) {
            clist[i] = new Citizen();
            if (num == i) {
                clist[i].check = true;
            }
        }

        while (true) {
            int pNum = p.input();
            if (pNum > 0 || pNum < 5) {
                clist[pNum-1].print();
                if (clist[pNum - 1].check) {
                    break;
                }
            } else {
                System.out.println("잘못된 입력");
            }
        }



    }
}
