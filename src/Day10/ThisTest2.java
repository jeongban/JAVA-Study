package Day10;

class BirthDay{
    int day;
    int month;
    int year;
    public void setYear(int year){
        this.year = year;// this 사용
    }
    public void printThis(){
        System.out.println(this);
    }
}
public class ThisTest2 {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();
        bDay.setYear(2000);
        System.out.println(bDay);
        bDay.printThis();
    }
}
