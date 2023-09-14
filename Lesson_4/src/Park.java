public class Park {

    static class Attraction {
        private String name;
        private String operatingHours;
        private double cost;

        public Attraction(String name, String operatingHours, double cost) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.cost = cost;
        }


        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + operatingHours);
            System.out.println("Стоимость: " + cost);
            System.out.println();
        }
    }
}