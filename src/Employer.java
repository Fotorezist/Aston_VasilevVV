public class Employer {
    private String middleName;
    private String name;
    private String surName;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employer (String middleName, String name, String surName, String email, String phone, int salary, int age){
        this.middleName = middleName;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public Employer (){
        this.middleName = "Иванов";
        this.name = "Иван";
        this.surName = "Иванович";
        this.email = "example@example.com";
        this.phone = "+01231231212";
        this.salary = 1000;
        this.age = 30;

    }
    public void personInfo() {
        System.out.println("Данные сотрудника: \n" + " ФИО: " + middleName + " " + name + " " + surName + "\n email: " + email + "\n Телефон: " + phone + "\n Зарплата: " + salary + "\n Возраст: " + age);
    }

//    Вывод данных сотрудников из массива
    public String toString() {
        return "Данные сотрудника: " + " ФИО: " + middleName + " " + name + " " + surName + " email: " + email + " Телефон: " + phone + " Зарплата: " + salary + " Возраст: " + age;
    }
}

