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
    int index = -1;

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
    Computer sendComputer(String made) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] != null) {
                if (c[i].made.equals(made)) {
                    index = i;
                    return c[i];
                }
            }
        }
        return null;
    }
    Aircondition sendAircondition(String made) {
        for (int i = 0; i < air.length; i++) {
            if (air[i] != null) {
                if (air[i].made.equals(made)) {
                    index = i;
                    return air[i];
                }
            }
        }
        return null;
    }
    Refrigerator sendRefrigerator(String made) {
        for (int i = 0; i < r.length; i++) {
            if (r[i] != null) {
                if (r[i].made.equals(made)) {
                    index = i;
                    return r[i];
                }
            }
        }
        return null;
    }
    Aircleaner sendAirCleaner(String made) {
        for (int i = 0; i < ac.length; i++) {
            if (ac[i] != null) {
                if (ac[i].made.equals(made)) {
                    index = i;
                    return ac[i];
                }
            }
        }
        return null;
    }
    void nullChangeComputer() {
        c[index] = null;
    }
    void nullChangeAircondirion() {
        air[index] = null;
    }
    void nullChangeRefrigerator() {
        r[index] = null;
    }
    void nullChangeAircleaner() {
        ac[index] = null;
    }
}

class Consumer {
    Computer[] c = new Computer[10];
    Aircondition[] air = new Aircondition[10];
    Refrigerator[] r = new Refrigerator[10];
    Aircleaner[] ac = new Aircleaner[10];
    int money = 0;

    void receiveComputer(Computer com) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = com;
                break;
            }
        }
    }
    void receiveAircondition(Aircondition a) {
        for (int i = 0; i < air.length; i++) {
            if (air[i] == null) {
                air[i] = a;
                break;
            }
        }
    }
    void receiveRefrigerator(Refrigerator ref) {
        for (int i = 0; i < r.length; i++) {
            if (r[i] == null) {
                r[i] = ref;
                break;
            }
        }
    }
    void receiveAirCleaner(Aircleaner acl) {
        for (int i = 0; i < ac.length; i++) {
            if (ac[i] == null) {
                ac[i] = acl;
                break;
            }
        }
    }
    void allPrint() {;
        for (int i = 0; i < 10; i++) {
            if (c[i] != null) {
                c[i].print();
            }
            if (air[i] != null) {
                air[i].print();
            }
            if (r[i] != null) {
                r[i].print();
            }
            if (ac[i] != null) {
                ac[i].print();
            }
        }
    }
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
                                Computer c = m.sendComputer("삼성");
                                if (c == null) {
                                    System.out.println("품절입니다.");
                                } else {
                                    con[i].money -= c.price;
                                    con[i].receiveComputer(c);
                                    m.nullChangeComputer();
                                }
                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else if (choose2 == 2) {//150
                            if (con[i].money >= 150) {
                                Computer c = m.sendComputer("LG");
                                if (c == null) {
                                    System.out.println("품절입니다.");
                                } else {
                                    con[i].money -= c.price;
                                    con[i].receiveComputer(c);
                                    m.nullChangeComputer();
                                }
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
                                Aircondition a = m.sendAircondition("삼성");
                                if (a == null) {
                                    System.out.println("품절입니다.");
                                } else {
                                    con[i].money = -a.price;
                                    con[i].receiveAircondition(a);
                                    m.nullChangeAircondirion();
                                }
                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else if (choose2 == 2) {//250
                            if (con[i].money >= 250) {
                                Aircondition a = m.sendAircondition("LG");
                                if (a == null) {
                                    System.out.println("품절입니다.");
                                } else {
                                    con[i].money -= a.price;
                                    con[i].receiveAircondition(a);
                                    m.nullChangeAircondirion();
                                }

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
                                Refrigerator r = m.sendRefrigerator("삼성");
                                if (r == null) {
                                    System.out.println("품절입니다.");
                                } else {
                                    con[i].money -= r.price;
                                    con[i].receiveRefrigerator(r);
                                    m.nullChangeRefrigerator();
                                }
                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else if (choose2 == 2) {//350
                            if (con[i].money >= 350) {
                                Refrigerator r = m.sendRefrigerator("LG");
                                if (r == null) {
                                    System.out.println("품절입니다.");
                                } else {
                                    con[i].money -= r.price;
                                    con[i].receiveRefrigerator(r);
                                    m.nullChangeRefrigerator();
                                }
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
                                Aircleaner a = m.sendAirCleaner("LG");
                                if (a == null) {
                                    System.out.println("품절입니다.");
                                } else {
                                    con[i].money -= a.price;
                                    con[i].receiveAirCleaner(a);
                                    m.nullChangeAircleaner();
                                }
                            } else {
                                System.out.println("금액이 부족합니다.");
                            }
                        } else if (choose2 == 2) {//60
                            if (con[i].money >= 60) {
                                Aircleaner a = m.sendAirCleaner("다이슨");
                                if (a == null) {
                                    System.out.println("품절입니다.");
                                } else {
                                    con[i].money -= a.price;
                                    con[i].receiveAirCleaner(a);
                                    m.nullChangeAircleaner();
                                }
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
        for (int i = 0; i < con.length; i++) {
            con[i].allPrint();
        }
    }
}
