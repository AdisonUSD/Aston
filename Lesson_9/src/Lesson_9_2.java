import java.util.*;

public class Lesson_9_2 {
    public static void main(String[] args) {
        String[] collection = {"f15", "f10", "f2", "f4", "f4"};

        Arrays.sort(collection);


        String[] newArray = new String[collection.length];
        for (int i = 0; i < collection.length; i++) {
            newArray[i] = collection[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}

