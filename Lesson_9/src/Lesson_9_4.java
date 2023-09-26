import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson_9_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> logins = new ArrayList<>();
        while (true) {
            System.out.print("Введите логин или пустую строку для завершения: ");
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }
        System.out.println("Логины, начинающиеся на букву 'f':");
        for (String login : logins) {
            if (login.startsWith("f")) {
                System.out.println(login);
            }
        }
    }
}
