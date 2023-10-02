package kick;
import lotr.Character;

public class BrutalKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoKick.getPower() >= whoIsKicked.getPower()) {
            whoIsKicked.setHp(0);
        }
        else {
            whoIsKicked.setHp(whoIsKicked.getHp() - 1);
        }
    }
}
