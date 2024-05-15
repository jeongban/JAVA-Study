package Example;

import java.util.Scanner;

public class Q26 {
    static int[] input() {
        int[] nums = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 : ");
        nums[0] = sc.nextInt();
        System.out.print("세로 : ");
        nums[1] = sc.nextInt();
        return nums;
    }
    static int sArea(int[] nums) {
        int result = nums[0] * nums[1];
        return result;
    }

    static void tArea(int[] nums) {
        double result = (nums[0] * nums[1]);
        System.out.printf("삼각형의 넓이 : %.1f",result/2.0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.사각형 넓이 2.삼각형 넓이");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("사각형의 넓이" + sArea(input()));
                break;
            } else if (input == 2) {
                tArea(input());
                break;
            } else {
                System.out.println("잘못된 입력");
            }
        }
    }
}
