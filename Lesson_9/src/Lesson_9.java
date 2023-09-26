import java.util.ArrayList;
import java.util.List;

public class Lesson_9 {
    public static void main(String[] args) {
        List<Integer> random = randomNumbers(10);
        int evenCount = countEvenNumbers(random);
        System.out.println(evenCount + " Чётных чисел");
    }

    public static List<Integer> randomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int random = (int) (1 + (Math.random() * 10));
            numbers.add(random);
        }
        return numbers;
    }

    public static int countEvenNumbers(List<Integer> numbers) {
        int evenCount = 0;
        for (int number : numbers) {
            if (0 == number % 2) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
