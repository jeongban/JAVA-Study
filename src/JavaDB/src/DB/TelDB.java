package DB;

import java.sql.*;
import java.util.Scanner;
class SQLConnect{
    /*
    SQL 연결을 위한 Connection을 생성 하는 class
     */
    private Connection connection; // SQL Java랑 연결을 해주는 class

    SQLConnect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseprogramming",
                "root","1234");
    }
    public Connection getConnection() {
        return connection;
    }
}


public class TelDB {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        SQLConnect sqlConnect = new SQLConnect();
        while(true){
            System.out.print("1.추가 2.삭제 3.전체출력 4.이름검색 5.종료 : ");
            int num = sc.nextInt();
            if(num == 1){ // 추가
                System.out.print("이름 : ");
                String name = sc.next();
                System.out.print("전화번호 : ");
                String telNumber = sc.next();
                System.out.print("주소 : ");
                String address = sc.next();
                // 쿼리문을 미리준비 해서 ?에 값을 Set하고 실행
                PreparedStatement pstmt = sqlConnect.getConnection()
                        .prepareStatement("INSERT INTO 전화번호부 VALUES(?,?,?);");
                pstmt.setString(1,name);
                pstmt.setString(2,telNumber);
                pstmt.setString(3,address);
                pstmt.executeUpdate(); // 업데이만 한다.
            }
            else if(num == 2){ // 삭제
                System.out.print("이름 : ");
                String name = sc.next();
                PreparedStatement pstmt = sqlConnect.getConnection()
                        .prepareStatement("DELETE FROM 전화번호부 WHERE 이름 = ?;");
                pstmt.setString(1,name);
                int result =pstmt.executeUpdate();
                if(result == 0){
                    System.out.println("삭제할 이름이 없습니다.");
                }
                else{
                    System.out.println(name+"이 삭제 되었습니다.");
                }
            }
            else if(num == 3){ // 전체출력
                //Statement 준비 X 쿼리문 바로 실행 -> 쿼리문이 완성이 되어 있어야 합니다.
                Statement stmt = sqlConnect.getConnection().createStatement();
                //executeQuery -> 쿼리문 실행 후 결과물을 받습니다. ResultSet
                ResultSet rs = stmt.executeQuery("select * from 전화번호부;");

                // 5. ResultSet에 저장된 데이터 얻기 - 결과가 2개 이상
                System.out.println("\t전화번호부");
                System.out.println("이름" + " " + "전화번호" + " " + "주소");
                while (rs.next()) {
                    String name = rs.getString("이름");
                    String telNumber = rs.getString("전화번호");
                    String address = rs.getString("주소");
                    System.out.println(name + " " + telNumber + " " + address);
                }
            }
            else if(num == 4){ // 이름검색
                System.out.print("이름 : ");
                String name = sc.next();
                PreparedStatement pstmt = sqlConnect.getConnection()
                        .prepareStatement("select * from 전화번호부 WHERE 이름 = ?;");
                pstmt.setString(1,name);
                ResultSet rs = pstmt.executeQuery(); // 결과물 받는다. executeQuery
                boolean check = true;
                while (rs.next()) {
                      check = false;
                      String rname = rs.getString("이름");
                      String rtelNumber = rs.getString("전화번호");
                      String raddress = rs.getString("주소");
                      System.out.println(rname + " " + rtelNumber + " " + raddress);
                }
                if(check){
                    System.out.println("검색 결과가 없습니다.");
                }
            }
            else if(num == 5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력 입니다.");
            }
        }
    }
}
