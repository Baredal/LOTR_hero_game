package kick;
import lotr.Character;
import lotr.Hobbit;

public class CryKick implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoIsKicked instanceof Hobbit) {
            whoIsKicked.setHp(0);
            System.out.println("Hobbit is crying");
        }
        else {
            System.out.println("Hobbit can't do nothing except for another hobbit");
        }
    }
}
