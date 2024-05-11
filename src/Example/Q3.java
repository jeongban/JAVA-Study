package Example;
//String id = “korea”
//        String passwd = “1234”
//
//
//        Id 입력 : XXXX
//        패스워드 입력 : XXXXX
//
//        Id와 패스워드가 맞으면  -> “환영합니다. Korea님”
//
//        Id와 또는 패스워드가 틀리면
//        id가 틀린경우 패스워드 맞고 -> id가 올바르지 않습니다.
//        id가 맞고 패스워드가 틀린경우 -> 패스워드가 올바르지 않습니다.
//        id 패스워드 모두 틀린경우 -> id와 패스워드가 올바르지 않습니다.


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("id 입력 : ");
        String id = sc.next();
        System.out.print("패스워드 입력 : ");
        String pass = sc.next();
        //id와 패스워드가 맞으면
        if (id.equals("korea") && pass.equals("1234")) {
            System.out.println("환영합니다." + id + "님");
        }
        //id가 틀리고 패스워드가 맞고
        else if (!id.equals("korea") && pass.equals("1234")) {
            System.out.println("id가 올바르지 않습니다.");
        }
        //id맞고 패스워드 틀리고
        else if (id.equals("korea") && !pass.equals("1234")) {
            System.out.println("패스워드가 올바르지 않습니다.");
        }
        //둘다 틀리고
        else {
            System.out.println("id와 패스워드가 올바르지 않습니다.");
        }
    }
}
