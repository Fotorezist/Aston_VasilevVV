public class Employee {
    private String fio;
    private String job;
    private String email;
    private String phone;
    private double salary;
    public int age;

    public Employee(String fio, String job, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + job);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
