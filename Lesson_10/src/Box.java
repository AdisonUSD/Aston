import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();

        }
        System.out.println(weight);
        return weight;
    }

    public static class FruitComparator implements Comparator<Box<? extends Fruit>> {
        @Override
        public int compare(Box<? extends Fruit> box1, Box<? extends Fruit> box2) {
            float weight1 = box1.getWeight();
            float weight2 = box2.getWeight();
            return Float.compare(weight1, weight2);
        }
    }

    public void select(List<T> box) {
        for (T fruit : fruits) {
            box.add(fruit);
        }
    }
}
