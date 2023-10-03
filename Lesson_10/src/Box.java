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

    public boolean compare(Box box) {
        float weight1 = this.getWeight();
        float weight2 = box.getWeight();
        if (weight1 > weight2) {
            return true;
        } else {
            return false;
        }
    }

    public void select(List<T> box) {
        for (T fruit : fruits) {
            box.add(fruit);
        }
    }
}
