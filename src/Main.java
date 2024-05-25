

public class Main {

    public static void main(String[] args) {
        Employer employer1;
        employer1 = new Employer();
        employer1.personInfo();
        System.out.println();

        Employer[] emplArr = new Employer[5];
//        emplArr [0] = new Employer();
        emplArr [0] = new Employer("Сидоров", "Семён", "Семёнович", "Подниматель пингвинов", "email1@email.ru", "+11111111111", 100, 10);
        emplArr [1] = new Employer("Петров", "Пётр", "Петрович", "Укладыватель пингвинов", "email2@email.ru", "+22222222222", 200, 20);
        emplArr [2] = new Employer("Кузнецов", "Андрей", "Дмитриевич", "Стилист", "email3@email.ru", "+33333333333", 300, 30);
        emplArr [3] = new Employer("Галицкий", "Генадий", "Александрович", "Психолог", "email4@email.ru", "+44444444444", 400, 40);
        emplArr [4] = new Employer("Дмитриевский", "Евгений", "Олегович", "Инженер", "email5@email.ru", "+55555555555", 500, 50);

//        Вывод данных сотрудников из массива
        for (int i = 0; i< emplArr.length; i++) {
            System.out.println(emplArr[i]);
        }
        System.out.println();

        Park park1 = new Park("Саратов", "Липки", 5);
        Park.Entertainment entertainment1 = park1.new Entertainment(10, 21, 500);
        park1.parkInfo();
        entertainment1.entertaimentInfo();

        }

}