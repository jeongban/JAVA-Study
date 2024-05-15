package Day16;

import Day16.AdvancedLevel;
import Day16.SuperLevel;

public class MainBoard {
    public static void main(String[] args) {
        Day16.Player player = new Day16.Player();
        player.play(5);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
