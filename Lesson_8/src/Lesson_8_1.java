public class Lesson_8_1 {
    public static void main(String[] Arg) {
        Phonebook phonebook = new Phonebook();
        phonebook.add(111, "A");
        phonebook.add(111, "T");
        phonebook.add(222, "B");
        phonebook.add(333, "C");
        phonebook.add(444, "C");
        phonebook.get("A");
        phonebook.get("B");
        phonebook.get("C");
    }
}
