package Day12;

class Student{
    int studentID;
    private String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
public class PrivateTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        //studentLee.studentName = "이상원"; //에러
        studentLee.setStudentName("이상원");
        System.out.println(studentLee.getStudentName());
    }
}
