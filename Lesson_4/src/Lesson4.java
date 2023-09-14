public class Lesson4 {
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
        Park.Attraction attraction1 = new Park.Attraction("Карусель", "10:00 - 20:00", 500);
        Park.Attraction attraction2 = new Park.Attraction("Горка", "11:00 - 19:00", 300);
        Park.Attraction attraction3 = new Park.Attraction("Колесо обозрения", "09:00 - 21:00", 800);


        System.out.println("Информация об аттракционах в парке:");
        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
    }
}