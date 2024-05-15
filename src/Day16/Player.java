package Day16;

public class Player {
    private Day16.PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevleMessage();
    }

    public Day16.PlayerLevel getLevel() {
        return level;
    }
    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevleMessage();
    }
    public void play(int count){
        level.go(count);
    }
}
