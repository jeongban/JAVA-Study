package Example;

public class Q10 {
    public static void main(String[] args) {
        System.out.print("1.---------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
        }
        System.out.print("2.----------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
        System.out.print("3.----------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
        System.out.print("4.-----------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2 -1); j++) {
                System.out.print("*");
            }
        }
        System.out.print("5.------------------------");
        for (int i = 1; i <= 3; i++) {
            System.out.println();
            for (int j = 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2 -1); j++) {
                System.out.print("*");
            }
        }
        for (int i = 1; i <= 2; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j >= (i * 2 - 1); j--) {
                System.out.print("*");
            }
        }
    }
}
