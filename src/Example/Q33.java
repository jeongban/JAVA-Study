package Example;

import java.util.Random;

class Player{
    int line = 0;
    String country = "";
    int go = 0;
    Random r = new Random();
    int gom = r.nextInt(10) + 1;
    void unexpected(int ran) {
        if (line == ran) {
            go = go + gom;
            System.out.println("이동거리 " + gom);
        } else {
            System.out.println("돌발상황 : " + line);
        }
    }

    public Player(int line, String country) {
        this.line = line;
        this.country = country;
    }
}


public class Q33 {
    public static void main(String[] args) {
        Random r = new Random();
        Player kor = new Player(1, "korea");
        Player cha = new Player(2, "china");
        Player usa = new Player(3, "U.S.A.");
        Player rus = new Player(4, "russia");
        int count = 1;
        while (true) {
            int ran = r.nextInt(4)+1;
            kor.unexpected(ran);
            cha.unexpected(ran);
            usa.unexpected(ran);
            rus.unexpected(ran);
            System.out.println("=================" + count++ +"턴");
            System.out.println(kor.country + "의 이동거리" + kor.go +"m");
            System.out.println(cha.country + "의 이동거리" + cha.go +"m");
            System.out.println(usa.country + "의 이동거리" + usa.go +"m");
            System.out.println(rus.country + "의 이동거리" + rus.go +"m");
            System.out.println("=====================================");

            if (kor.go > 100 || cha.go > 100 || usa.go > 100 || rus.go > 100) {
                break;
            }
        }
        if(kor.go > cha.go && kor.go > usa.go && kor.go > rus.go){
            System.out.println("우승국은 한국입니다.");
        }
        if(cha.go > kor.go && cha.go > usa.go && cha.go > rus.go){
            System.out.println("우승국은 중국입니다.");
        }
        if(usa.go > kor.go && usa.go > cha.go && usa.go > rus.go){
            System.out.println("우승국은 미국입니다.");
        }
        if(rus.go > kor.go && rus.go > cha.go && rus.go > usa.go){
            System.out.println("우승국은 러시아입니다.");
        }
    }
}