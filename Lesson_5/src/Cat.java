class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull = false;

    public boolean isFull() {
        return isFull;
    }

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    public void eat(int amount) {
        if (amount <= 0) {
            System.out.println("Кот не может съесть отрицательное количество еды.");
        } else if (amount > 0 && !isFull) {
            isFull = true;
            System.out.println("Кот поел и наелся.");
        } else if (isFull) {
            System.out.println("Кот уже сыт.");
        }
    }

    public String getName() {
        return super.getName();
    }
    public static int getCatCount() {
        return catCount;
    }
}