public class Main {
    public static void main(String[] args) {
//  Задание 1
        Cat cat1 = new Cat("Барсик", 4, false);
        Cat cat2 = new Cat("Принц", 5, true);

        cat1.run(100);
        cat1.swim(3);

        Dog dog1 = new Dog("Полкан");


        dog1.run(700);
        dog1.swim(5);

        System.out.println();

//      Выводим количество созданных объектов (животных, котов и собак)
        System.out.println("Всего животных: " + Animal.animalNumber);
        System.out.println("Всего котов: " + Cat.catNumber);
        System.out.println("Всего собак: " + Dog.dogNumber);
        System.out.println();

//      Создаём пустую миску для кота
        Dish dish = new Dish();
//      Добавляем еду в миску
        dish.addFood(14);

//      Кот поел из миски
        dish.emptying(cat1.eating(dish.foodInDish));
        dish.emptying(cat2.eating(dish.foodInDish));

//      Создаём массив котов
        Cat[] catArr = new Cat[3];
        catArr[0] = new Cat("Черныш", 3, false);
        catArr[1] = new Cat("Беляш", 4, false);
        catArr[2] = new Cat("Наглый", 6, false);

//      Добавляем еду в миску
        dish.addFood(-2);

//      Коты едят из миски
        for (int i = 0; i < catArr.length; i++){

            dish.emptying(catArr[i].eating(dish.foodInDish));

        }

//        Задание 2
        System.out.println();
        System.out.println("Задание 2");

        Circle circle1 = new Circle(3, "Green", "Red");
        circle1.square();
        circle1.borderLength();
        circle1.background();
        circle1.border();
        System.out.println();

        Rectangle rectangle1 = new Rectangle(2,3, "Blue", "Red");
        rectangle1.square();
        rectangle1.borderLength();
        rectangle1.background();
        rectangle1.border();
        System.out.println();

        Triangle triangle1 = new Triangle(4,4,5, "Green", "Yellow");
        triangle1.square();
        triangle1.borderLength();
        triangle1.background();
        triangle1.border();
    }

}