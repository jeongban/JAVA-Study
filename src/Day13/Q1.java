package Day13;

import java.util.Random;
import java.util.Scanner;

//낚시게임
//물고기 필요 X
class Fish{}
//호수
class Hosu {
/*
1. 물고기 5 X 5 배열 물고기 객체 3마리 있고 나머지는 모두 null
2. 호수 생성시 -> 물고기 3마리 랜덤하게 배치 (생성자)
3. 물고기를 주는 기능을 하는 메소드
4. 물고기 넘어가면 -> null로 변경해주는 기능을 하는 메소드
5. 호수에 물고기 5x5 배열을 출력해주는 메소드 -> 캐스팅 하기 전 출력 / 캐스팅 하고 난 후 출력
5-1 메소드 오버로딩을 사용해서 출력 만들겠습니다.
 */
    //1번
    Fish[][] fList = new Fish[5][5];//물고기 넣을 자리 배열 생성
    //2.
    Hosu(){
        Random r = new Random();
        for(int i = 0;i<3;i++){//물고기 3마리 잡힐때 까지
            int y = r.nextInt(5);//물고기 랜덤 배치 y좌표
            int x = r.nextInt(5);//물고기 랜덤 배치 x좌표

            if(fList[y][x] != null){//물고기 배치된 곳이 null이 아니면
                i--;//한 번더 반복
            }
            else{
                fList[y][x] = new Fish();//null이면 물고기 객체 생성
            }
        }
    }
    //3.
    Fish giveFish(int[] position){//물고기를  주는 메소드(선택한 좌표를 배열로 받음)
        return fList[position[0]][position[1]];//물고기 배열에서 선택한 좌표의 물고기를 준다
    }
    //4.
    void nullChange(int[] postion){//null전환 메소드
        fList[postion[0]][postion[1]] = null;//물고기 배열에서 선택한 좌표를 null로 바꾼다
    }
    //5-1 캐스팅 없는 프린트
    void printHosu(){// 호수 출력
        for(int i = 0;i<fList.length;i++){
            for(int j = 0;j<fList[i].length;j++){
                if(fList[i][j] == null){ //물고기가 배치된 좌표가 null일 때
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }
    //5-2. 캐스팅된 프린트 호수
    void printHosu(int[] postion){
        for(int i = 0;i<fList.length;i++){
            for(int j = 0;j<fList[i].length;j++){
                if(postion[0] == i && postion[1] == j){//물고기가 배치된 좌표가 선택한 좌표일 때
                    System.out.print("X");
                }
                else if(fList[i][j] == null){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }
}
class Fisher {
    //낚시꾼
/*
1. 캐스팅 좌표 값 변수 가지고 있어야 합니다. y,x => 배열로 사용 가능
2. 물고기를 담을 어항 3개 -> 배열 Fish[]
3. 캐스팅 -> 생성자
4. 물고기 받는 기능을 하는 메소드 -> 호수 물고기를 주면 받아서 어항에 넣는 기능 구현
5. 낚시대 이동을 하는 기능을 구현 하는 메소드 -> y 1증가 또는 1감소 x 1증가 또는 1감소
   범위 벗어나면 이동을 못하는 기능도 추가
6. 프로그램 종료를 위한 어항 검사 기능을 구현
 */
    //1.
    int[] position = new int[2];//선택한 좌표를 담을 x,y배열 두개
    //2.
    Fish[] bowl = new Fish[3];//물고기를 담을 배열 3개
    Scanner sc = new Scanner(System.in);
    //3. 캐스팅 생성자
    Fisher(){
        while (true){
            System.out.print("행 입력 : ");
            position[0] = sc.nextInt();// 입력값 행 좌표를 배열에 삽입
            System.out.print("열 입력 : ");
            position[1] = sc.nextInt();//입력값 열 좌표를 배열에 삽입

            if(position[0] > -1 && position[0] < 5
                    && position[1] > -1 && position[1] < 5){
                break;//옳은 입력일 때 무한루프 탈출
            }
        }
    }
    //4.
    void reciveFish(Fish f){
        if(f != null){//좌표에 물고기가 null이 아니면
            System.out.println("물고기 잡았습니다.");
        }

        for(int i = 0;i< bowl.length;i++){
            if(bowl[i] == null){//물고기 담은 배열의 인덱스가 null이면
                bowl[i] = f;//물고기 객체 삽입
                break;
            }
        }
    }
    //5.
    void fishMove(){//움직임 메소드
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
        int num = sc.nextInt();
        if(num == 1){
            position[0]--;//행 좌표-
            if(position[0] < 0){//행 좌표가 0보다 작으면
                System.out.println("더이상 위로 움직일 수 없습니다.");
                position[0] = 0;//원래자리 0으로 지정
            }
        }
        else if(num == 2){
            position[0]++;//행 좌표+
            if(position[0] > 4){//행 좌표가 4보다 크면
                System.out.println("더이상 아래로 움직일 수 없습니다.");
                position[0] = 4;//원래자리 4로 이동
            }
        }
        else if(num == 3){
            position[1]--;//열 좌표-
            if(position[1] < 0){//열 좌표가 0보다 작으면
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                position[1] = 0;//원래자리 0으로 이동
            }
        }
        else if(num == 4){
            position[1]++;//열 좌표+
            if(position[1] > 4){//열 좌표가 4보다 크면
                System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                position[1] = 4;//원래자리 4로 이동
            }
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }
    //6.
    boolean checkFish(){//잡은 물고기 확인
        for(int i =0;i< bowl.length;i++){
            if(bowl[i] == null){//bowl에 null이 존재하면 반복
                return true;
            }
        }
        return false;//아닐시 반복 탈출
    }
}

public class Q1  {
    public static void main(String[] args) {
        Hosu h = new Hosu(); // 물고기 3마리 배치
        h.printHosu();
        Fisher f = new Fisher(); //캐스팅
        h.printHosu(f.position);
        /*바로 잡을 경우
        Fish fish =h.giveFish(f.position);// 좌표를 받아 잡은 물고기를 준다
        f.reciveFish(fish);//물고기를 받고
        h.nullChange(f.position);//null로 바꾼다
         */
        f.reciveFish(h.giveFish(f.position));
        h.nullChange(f.position);
        while(f.checkFish()){
            f.fishMove();
            f.reciveFish(h.giveFish(f.position));
            h.nullChange(f.position);
            h.printHosu(f.position);
        }
        System.out.println("물고기를 모두 잡았습니다.");
    }
}
