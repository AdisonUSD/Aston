import java.util.*;

public class Phonebook {

    private HashMap<Integer, String> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(Integer number, String name) {
        if (phonebook.containsKey(number)) {
            System.out.println("Такой номер " + number + " телефон есть, придумай новый номер ");
        } else {
            phonebook.put(number, name);
        }
    }

    public void get(String name) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Iterator<Map.Entry<Integer, String>> iterator = phonebook.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (Objects.equals(entry.getValue(), name)) {
                numbers.add(entry.getKey());
            }
        }
        System.out.print(name + " : ");
        for (Integer number : numbers) {
            System.out.print(number + ";");
        }
        System.out.println();
    }
}