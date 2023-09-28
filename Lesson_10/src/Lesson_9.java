public class Lesson_9 {
    public static void main(String[] args) {
        Box<Apple> boxApple = new Box<>();
        Apple apple = new Apple();
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);


        Box<Orange> boxOrange = new Box<>();
        Orange orange = new Orange();
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);


        boxApple.getWeight();
        boxOrange.getWeight();
        Box.FruitComparator comparator = new Box.FruitComparator();
        int result = comparator.compare(boxOrange, boxApple);
        System.out.println("Comparison result: " + result);


    }
}
