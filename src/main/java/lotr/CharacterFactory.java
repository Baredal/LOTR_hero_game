package lotr;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.reflections.Reflections;
import lombok.SneakyThrows;
import java.util.ArrayList;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> charactersSet = reflections.getSubTypesOf(Character.class);    
        List<Class<? extends Character>> characters = new ArrayList<>(charactersSet);
        return characters.get(new Random().nextInt(characters.size())).newInstance();
    }
}
