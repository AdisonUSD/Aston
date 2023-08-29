
public class Lesson_1 {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");}

        public static void checkSumSign() {
            int a = -50, b=4;
            int c = a + b;
            if (c >= 0) {
                System.out.println("Сумма положительна");
            } else {
                System.out.println("Сумма отрицательна");
            }

        }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value < 100 && value > 0) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers(){
        int a = 7, b = 8;
        if (a >= b){
            System.out.println("a >= b");}
        else  {
            System.out.println("a < b");
        }

    }
}










