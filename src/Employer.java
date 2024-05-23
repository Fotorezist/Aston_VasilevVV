public class Employer {
    public String middleName;
    public String name;
    public String surName;
    public String email;
    public String phone;
    public int salary;
    public int age;
public Employer (){
        this.middleName = "Иванов";
        this.name = "Иван";
        this.surName = "Иванович";
        this.email = "example@example.com";
        this.phone = "+01231231212";
        this.salary = 1000;
        this.age = 30;

    }
    public void info() {
        System.out.println("Данные сотрудника: \n" + " ФИО: " + middleName + " " + name + " " + surName + "\n email: " + email + "\n Телефон: " + phone + "\n Зарплата: " + salary + "\n Возраст: " + age);
    }
}
