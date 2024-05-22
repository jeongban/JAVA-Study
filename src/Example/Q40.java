package Example;

import java.util.Scanner;

class Computer{
    String made = "";
    String cpu = "";
    int price = 0;

    public Computer(String made, String cpu, int price) {
        this.made = made;
        this.cpu = cpu;
        this.price = price;
    }

    void print() {
         System.out.println("제조사가 " + made + "인 " + cpu + "컴퓨터를 사용한다.");
    }
}

class Aircondition {
    String made = "";
    String type = "";
    int price = 0;
    void print() {
        System.out.println("제조사가 " + made + "인 " + type + " 에어컨을 사용한다.");
    }

    public Aircondition(String made, String type, int price) {
        this.made = made;
        this.type = type;
        this.price = price;
    }
}

class Refrigerator {
    String made = "";
    String type = "";
    String size = "";
    int price = 0;
    void print() {
        System.out.println("제조사가 " + made + "인 " + type + size + "냉장고가 식품을 관리한다.");
    }

    public Refrigerator(String made, String type, String size, int price) {
        this.made = made;
        this.type = type;
        this.size = size;
        this.price = price;
    }
}

class Aircleaner {
    String made = "";
    int price = 0;
    void print () {
        System.out.println("제조사가 " + made + "인 공기청정기가 깨끗하게 한다");
    }

    public Aircleaner(String made, int price) {
        this.made = made;
        this.price = price;
    }
}

class Mart {
    Computer[] c = new Computer[10];
    Aircondition[] air = new Aircondition[10];
    Refrigerator[] r = new Refrigerator[10];
    Aircleaner[] ac = new Aircleaner[10];

    Mart() {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                this.c[i] = new Computer("삼성", "i7", 200);
                this.air[i] = new Aircondition("삼성", "벽걸이", 100);
                this.r[i] = new Refrigerator("삼성", "양문형", "600L", 200);
                this.ac[i] = new Aircleaner("LG", 80);
            } else {
                this.c[i] = new Computer("LG", "i5", 150);
                this.air[i] = new Aircondition("LG", "스탠드", 250);
                this.r[i] = new Refrigerator("LG", "4도어형", "800L", 350);
                this.ac[i] = new Aircleaner("다이슨", 60);
            }
        }
    }
}

class Consumer {
    Computer[] c = new Computer[10];
    Aircondition[] air = new Aircondition[10];
    Refrigerator[] r = new Refrigerator[10];
    Aircleaner[] ac = new Aircleaner[10];
    int money = 0;
}

public class Q40 {
    public static void main(String[] args) {
        Mart m = new Mart();
        Consumer[] con = new Consumer[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < con.length; i++) {
            con[i] = new Consumer();
            System.out.println(i + 1 + " 번 째 소비자 : ");
            con[i].money = sc.nextInt();
        }
        while (con[0].money >= 60 || con[1].money >= 60 || con[2].money >= 60) {
            for (int i = 0; i < con.length; i++) {
                System.out.println((i+1) + "번 째 소비자 남은 금액 : " + con[i].money);
                if (con[i].money >= 60) {
                    System.out.println("소비자 상품을 선택 해주세요. 1.컴퓨터 2.에어컨 3.냉장고 4. 공기청정기");
                    int choose1 = sc.nextInt();
                    if (choose1 == 1) {//컴퓨터
                        System.out.println("제조사 및 사양을 선택 해주세요. 1.삼성(i7) 2.LG(i5)");
                        int choose2 = sc.nextInt();
                        if (choose2 == 1) {//200
                            if (con[i].money >= 200) {

                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else if (choose2 == 2) {//150
                            if (con[i].money >= 150) {

                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력");
                        }
                    } else if (choose1 == 2) {//에어컨
                        System.out.println("제조사 및 사양을 선택 해주세요. 1.삼성(벽걸이) 2.LG(스탠드)");
                        int choose2 = sc.nextInt();
                        if (choose2 == 1) {//100
                            if (con[i].money >= 100) {

                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else if (choose2 == 2) {//250
                            if (con[i].money >= 250) {

                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력");
                        }
                    } else if (choose1 == 3) {//냉장고
                        System.out.println("제조사 및 사양을 선택 해주세요. 1.삼성(양문) 2.LG(4도어)");
                        int choose2 = sc.nextInt();
                        if (choose2 == 1) {//200
                            if (con[i].money >= 200) {

                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else if (choose2 == 2) {//350
                            if (con[i].money >= 350) {

                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력");
                        }
                    } else if (choose1 == 4) {//공기청정기
                        System.out.println("제조사 및 사양을 선택 해주세요. 1.LG 2.다이슨");
                        int choose2 = sc.nextInt();
                        if (choose2 == 1) {//80
                            if (con[i].money >= 80) {

                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else if (choose2 == 2) {//60
                            if (con[i].money >= 60) {

                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력");
                        }
                    } else {
                        System.out.println("잘못된 입력");
                    }
                }
            }
        }
    }
}
