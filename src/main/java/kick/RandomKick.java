package kick;
import java.util.Random;
import lotr.Character;

public class RandomKick implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - new Random().nextInt(whoKick.getPower() + 1));
    }
}
