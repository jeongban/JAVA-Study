package Day02;

// 쓰지마세요
public class TypeInference {
    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        //str = 3; 선언시 문자열이면 문자열만 가능함
    }
}
