package Example;

import java.util.Random;
import java.util.Scanner;

public class Q24r {
    public static void main(String[] args) {
        int[][] lake = new int[5][5];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int x = 0;
        int y = 0;
        //호수에 물고기 뿌리기
        int catchFish = 0;
        for (int i = 0; i < 3; i++) {
            int row = r.nextInt(5);
            int hei = r.nextInt(5);
            if (lake[row][hei] == 1) {
                i--;
            } else {
                lake [row][hei] = 1;
                catchFish++;
            }
        }
        //호수출력
        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                if (lake[i][j] == 0) {
                    System.out.print("○");
                } else {
                    System.out.print("●");
                }
            }
            System.out.println();
        }

        //캐스팅
        while (true) {
            System.out.print("행 입력 : ");
            y = sc.nextInt();
            System.out.print("열 입력");
            x = sc.nextInt();
            if (x >= 0 && x <= 4 && y >= 0 && y <= 4) {
                break;
            } else {
                System.out.println("잘못된 입력");
            }
        } System.out.println("y = " + y + " x = " + x);
        //잡은 물고기 확인
        if (lake[y][x] == 1) {
            System.out.println("물고기를 잡았습니다.");
            lake[y][x] = 0;
            catchFish--;
        }
        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                if (i == y && j == x) {
                    System.out.print("x");
                } else if (lake[i][j] == 0) {
                    System.out.print("○");
                } else {
                    System.out.print("●");
                }
            }
            System.out.println();
        }

        while (catchFish> 0) {
            System.out.println("1. 위 2. 아래 3. 왼쪽 4. 오른쪽");
            int input = sc.nextInt();
            if (input == 1) {
                y--;
                if (y < 0) {
                    System.out.println("이동할 수 없습니다.");
                    y = 0;
                }

            } else if (input == 2) {
                y++;
                if (y > 4) {
                    System.out.println("이동할 수 없습니다.");
                    y = 4;
                }
            } else if (input == 3) {
                x--;
                if (x < 0) {
                    System.out.println("이동할 수 없습니다.");
                    x = 0;
                }
            } else if (input == 4) {
                x++;
                if (x > 4) {
                    System.out.println("이동할 수 없습니다");
                    x = 4;
                }
            } else {
                System.out.println("잘못된입력");
            }
            if (lake[y][x] == 1) {
                System.out.println("물고기를 잡았습니다.");
                lake[y][x] = 0;
                catchFish--;
            }
            for (int i = 0; i < lake.length; i++) {
                for (int j = 0; j < lake[i].length; j++) {
                    if (i == y && j == x) {
                        System.out.print("x");
                    } else if (lake[i][j] == 0) {
                        System.out.print("○");
                    } else {
                        System.out.print("●");
                    }
                }
                System.out.println();
            }

        }
        System.out.println("물고기를 다 잡았습니다.");


            }
        }
