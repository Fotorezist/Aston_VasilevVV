// Задания по https://moodle.astondevs.ru/mod/assign/view.php?id=52073
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван Иванов", "Инженер", "ivan.ivanov@example.com", "+7 123 456 7890", 50000.0, 30);
        employees[1] = new Employee("Петр Петров", "Менеджер", "petr.petrov@example.com", "+7 987 654 3210", 70000.0, 45);
        employees[2] = new Employee("Сергей Сергеев", "Программист", "sergey.sergeev@example.com", "+7 555 123 4567", 60000.0, 38);
        employees[3] = new Employee("Анна Аннова", "Бухгалтер", "anna.annova@example.com", "+7 901 234 5678", 40000.0, 42);
        employees[4] = new Employee("Михаил Михайлов", "Директор", "mikhail.mikhailov@example.com", "+7 111 222 3333", 100000.0, 50);

        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
                System.out.println();
            }
        }
        Park park = new Park(3);
        park.addAttraction(0, "Колесо обозрения", "10:00", "20:00", 500.0);
        park.addAttraction(1, "Американские горки", "12:00", "22:00", 700.0);
        park.addAttraction(2, "Карусель", "11:00", "21:00", 300.0);

        park.printAttractions();
    }

}
