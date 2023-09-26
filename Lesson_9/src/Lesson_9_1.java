import java.util.ArrayList;
import java.util.List;

public class Lesson_9_1 {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("Highload");
        collection.add("High");
        collection.add("Load");
        collection.add("Highload");
        int countHigh = 0;
        for (String item : collection) {
            if (item.equals("High")) {
                countHigh++;
            }
        }
        String firstElement;
        if (collection.isEmpty()) {
            firstElement = "0";
        } else {
            firstElement = collection.get(0);
        }
        String lastElement;
        if (collection.isEmpty()) {
            lastElement = "0";
        } else {
            lastElement = collection.get(collection.size() - 1);
        }

        System.out.println("Количество раз, когда 'High' встречается в коллекции: " + countHigh);
        System.out.println("Первый элемент коллекции: " + firstElement);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}