package lotr;

public class GameManager {
    public static void fight(Character opponent1, Character opponent2) {
        int turn = 0;
        while (opponent1.isAlive() && opponent2.isAlive()) {
            System.out.println("Opponent №1 " + opponent1.getClass().getSimpleName() + " has " + opponent1.getHp() + " HP"+ " and " + opponent1.getPower() +" power");
            System.out.println("Opponent №2 " + opponent2.getClass().getSimpleName() + " has " + opponent2.getHp() + " HP"+ " and " + opponent2.getPower() +" power" + "\n");

            if (turn % 2 == 0) {
                System.out.println("Opponent №1 " + opponent1.getClass().getSimpleName() + " hits Opponent №2 " + opponent2.getClass().getSimpleName() + "\n");
                opponent1.kick(opponent2);
            }
            else {
                System.out.println("Opponent №2 " + opponent2.getClass().getSimpleName() + " hits Opponent №1 " + opponent1.getClass().getSimpleName() + "\n");
                opponent2.kick(opponent1);
            }
            turn++;
        }
        if (opponent1.isAlive()) {
            System.out.println("Opponent №1 " + opponent1.getClass().getSimpleName() + " won!");
        }
        else {
            System.out.println("Opponent №2 " + opponent2.getClass().getSimpleName() + " won!");
        } 
    }

    public static void main(String[] args) {
        Character opponent1 = CharacterFactory.createCharacter();
        Character opponent2 = CharacterFactory.createCharacter();
        fight(opponent1, opponent2);
    }
    
}
