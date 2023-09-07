
class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;


    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }


    public int getAge() {
        return age;
    }
}


class Park {

    class Attraction {
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

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Andrey Aleksandrov", "Engineer", "aleksandrov@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "891623456", 40000, 45);
        employees[2] = new Employee("Sidorov Eugen", "Programmer", "sidorov@mailbox.com", "890934567", 50000, 35);
        employees[3] = new Employee("Kozlov Danila", "Designer", "kozlov@mailbox.com", "892045678", 35000, 28);
        employees[4] = new Employee("Smirnov Sergey", "Accountant", "smirnov@mailbox.com", "891056789", 45000, 50);


        System.out.println("Информация о сотрудниках старше 40 лет:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }


        Park park = new Park();
        Park.Attraction attraction1 = park.new Attraction("Карусель", "10:00 - 20:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Горка", "11:00 - 19:00", 300);
        Park.Attraction attraction3 = park.new Attraction("Колесо обозрения", "09:00 - 21:00", 800);


        System.out.println("Информация об аттракционах в парке:");
        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
    }
}