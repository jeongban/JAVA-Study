package Day15;

public class Customer {
    protected int customerID;
    private String customerName;
    protected  String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
         initCustomer();
        //System.out.println("Customer 객체생성");
    }
    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
    }
    private void initCustomer(){
        customerGrade = "SILVER"; //기본 등급
        bonusRatio = 0.01;//보너스 포인트 기본 적립 비율
    }
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo(){
        return customerName+" 님의 등급은 "+ customerGrade +
                "이며, 보너스 포인트는 "+bonusPoint+" 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
