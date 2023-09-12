class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (amount < 0) {
            System.out.println("Нельзя убрать отрицательное количество еды из тарелки.");
        } else if (amount <= food) {
            food -= amount;
        } else {
            System.out.println("В тарелке недостаточно еды.");
        }
    }

    public void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя добавить отрицательное количество еды в тарелку.");
        } else {
            food += amount;
        }
    }

    public int getFood() {
        return food;
    }
}
