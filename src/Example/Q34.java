package Example;

class Animal {
    String type = "";
    String food = "";

    public Animal(String type, String food) {
        this.type = type;
        this.food = food;
    }



    void print() {
        System.out.println(type + " - " + food);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
public class Q34 {
    public static void main(String[] args) {
        String[] at = {"원숭이", "개", "닭", "돼지"};
        String[] af = {"바나나", "뼈다귀", "모이", "여물"};
        Animal[] animals = new Animal[4];
        for (int i = 0; i < at.length; i++) {
            animals[i] = new Animal(at[i], af[i]);
            animals[i].print();
        }
        String temp = animals[3].food;
        for (int i = 3; i > 0; i--) {
            animals[i].food = animals[i - 1].food;
        }animals[0].food = temp;

        for (int i = 0; i < animals.length; i++) {
            animals[i].print();
        }

    }
}
