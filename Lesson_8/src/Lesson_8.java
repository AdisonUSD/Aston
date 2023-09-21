import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson_8 {
    public static void main(String[] arg) {
        HashMap<String, Integer> words = new HashMap<>();
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList("mercury", "venus", "earth", "earth",
                "jupiter", "saturn", "uranus", "uranus"));
        for (String str : solarSystem) {
            if (words.containsKey(str)) {
                int counter = words.get(str);
                words.put(str, counter + 1);
            } else {
                words.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println("Планета " + entry.getKey() + " Колличество " + entry.getValue());
        }
    }
}
