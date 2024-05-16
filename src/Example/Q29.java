package Example;

import java.util.Random;
import java.util.Scanner;

public class Q29 {
    static void makeRandom(int[] com, Random r){//배열 변수 com 과 랜덤 변수 r을 받는 메소드
        for(int i = 0;i<com.length;i++){//입력값 배열만큼 반복문을 반복한다
            com[i] = r.nextInt(9)+1;//com 배열에 랜덤값 1~9를 대입한다
            for(int j = 0; j<i;j++){
                if(com[i] == com[j]){//com[i] 인덱스 값과 com[j]인덱스 값이 같을 경우
                    i--;//i를 한번 더 반복한다
                    break;
                }
            }
        }
    }
    static void randomPrint(int[] com){//배열 변수 com을 받는 메소드
        System.out.println("com[0] :" + com[0]+", com[1] : "+com[1]+", com[2] : "+com[2]);//출력
    }

    static int[] inputUser(Scanner sc){//scanner 변수 sc를 받는 메소드
        int[] user = new int[3];//user 3배열 생성
        for(int i = 0;i<user.length;i++){//user 배열 크기만큼 반복
            System.out.print("숫자 "+(i+1)+" : ");//출력
            user[i] = sc.nextInt();//user 배열에 sc 정수 입력값 대입
            //1~9 올바른지
            if(user[i]<1 || user[i]>9){//user 배열의 값이 1~9사이에 없으면
                i--;//i를 다시 반복
                continue;//위에 반복문으로 돌아감
            }
            //중복이 없는지
            for(int j = 0; j<i;j++){//j가 i만큼 반복하면서
                if(user[i] == user[j]){//user[i]의 값이 user[j]의 값과 같으면
                    i--;//i를 감소시키고 반복한다
                    break;//현재 반복문을 빠져나온다
                }
            }
        }
        return user;//return값으로 user배열을 준다
    }

    static int[] checkSB(int[] user, int[] com){
        int[] result = new int[2];
        for(int i = 0;i<user.length;i++){
            for(int j = 0;j<com.length;j++){
                if(user[i] == com[j]){ //strike or ball
                    if(i == j){
                        result[0]++;
                    }
                    else{
                        result[1]++;
                    }
                }
            }
        }
        return result;
    }

    static boolean resultPrint(int[] result){
        if(result[0] == 3){
            System.out.println("홈런입니다.");
            return false;
        }
        else if(result[0] == 0 && result[1] == 0){
            System.out.println("Out입니다.");
        }
        else{
            System.out.println("strike : "+result[0] +", ball : "+result[1]);
        }
        return true;
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //1. 랜덤값 중복되지 않게 1~9 3개 받기
        int[] com = new int[3];
        //int[] result = new int[2];
        boolean check = true;
        makeRandom(com,r); // Call by reference 때문에 리턴을 할 필요 X
        randomPrint(com);
        //=============================================================

        //3. Com 숫자와 User 숫자를 비교해서 Strike Ball을 알려줍니다.
        // -> out(아무것도 맞는게 없을 때, 홈런은 자리와 숫자 모두 맞추는 경우)
        //while(result[0] < 3)
        while(check){
            //2. 사용자 3개의 숫자 입력 -> 1~9사이에 값과 중복되지 않는 숫자 입력
            int[] user = inputUser(sc);
            // strike ball 체크
            //result = checkSB(user,com);
            int[] result = checkSB(user,com);
            // 출력
            //resultPrint(result);
            check=resultPrint(result);
        }
    }
}
