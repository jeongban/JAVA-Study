package Day16;

public class SuperLevel extends Day16.PlayerLevel {
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 Jump합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 돕니다.");
    }

    @Override
    public void showLevleMessage() {
        System.out.println("*****고급자 레벨입니다.********");
    }
}
