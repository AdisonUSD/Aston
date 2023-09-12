public class Lesson5 {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        bobik.run(20);
        bobik.swim(2000);
        Cat[] cats = {new Cat("Барсик"), new Cat("Мурзик"), new Cat("Васька")};
        Plate plate = new Plate(0);
        for (Cat cat : cats) {
            cat.eat(20);
            plate.decreaseFood(20);
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        plate.addFood(30);
        System.out.println("В тарелку добавили 30 еды. Теперь в тарелке " + plate.getFood() + " еды.");

        System.out.println("Всего собак " + Dog.getDogCount());
        System.out.println("Всего котов " + Cat.getCatCount());
        System.out.println("Всего животных " + Animal.getAnimalCount());
    }
}







