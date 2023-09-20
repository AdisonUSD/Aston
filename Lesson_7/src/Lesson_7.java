public class Lesson_7 {
    public static void main(String[] arg) throws MyArraySizeException, MyArrayDataException {
        int n = 4;
        int m = 4;
        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = "1";
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        arr[n - 1][m - 3] = "a";
        arraySize(arr);
    }

    public static void arraySize(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length == 4 && arr[0].length == 4) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (Exception e) {
                        throw new MyArrayDataException("Неверное преобразование в ячейке " + i + ":" + j);
                    }
                }
            }
            System.out.println("сумма " + sum);
        } else {
            throw new MyArraySizeException();
        }
    }
}


