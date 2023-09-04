
public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(checkSum(12, 5));
        positiveOrNegative(-1);
        System.out.println(falseOrTrue(-5));
        numberOfString("Hello", 9);
        System.out.println(isEvenYear(2023));
        changeNumbers();
        massive();
        onlySix();
        doubleLevelArray();
        initial(5, 101);
    }

    public static boolean checkSum(int num1, int num2) {
        int sum = num1 + num2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int num1) {
        if (num1 < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }

    public static boolean falseOrTrue(int num1) {
        if (num1 > 0) {
            return true;
        }
        return false;
    }

    public static void numberOfString(String text, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(text);
        }
    }

    public static boolean isEvenYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void changeNumbers() {
        int[] numbers = {0, 1, 1, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else if (numbers[i] == 1) {
                numbers[i] = 0;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

    public static void massive() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }

    public static void onlySix() {
        int[] six = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < six.length; i++) {
            int x = six[i];
            if (x < 6) {
                six[i] = x * 2;
            }
            System.out.println(six[i]);
        }
    }

    public static void doubleLevelArray() {
        int n = 5;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void initial(int len, int initialValue) {
        int[] numbers = new int[len];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = initialValue;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}








