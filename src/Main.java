public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog1.run(150);
        dog1.swim(5);
        cat1.run(100);
        cat1.swim(10); // Кот не умеет плавать

        Plate plate = new Plate(2); // 2 единицы еды кот1.поесть(тарелка);
        cat2.eat(plate);
        cat1.eat(plate); // Кот пытается покушать, но еды нет

        System.out.println("Кот 1 сытость: " + cat1.isSatiety());
        System.out.println("Кот 2 сытость: " + cat2.isSatiety());
        System.out.println("Количество животных: " + Animal.getAnimalCount());
    }
}