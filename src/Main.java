public class Main {
    public static void main(String[] args) {
//  Задание 1
        Cat cat1 = new Cat("Барсик", 4, false);
        Cat cat2 = new Cat("Принц", 5, false);

        cat1.run(100);
        cat1.swim(3);

        Dog dog1 = new Dog("Полкан");


        dog1.run(700);
        dog1.swim(5);

//      Выводим количество созданных объектов
//        System.out.println(Cat.animalNumber);
//        System.out.println(Cat.catNumber);
//        System.out.println(Dog.dogNumber);

//      Создаём миску с едой для кота
        Dish dish1 = new Dish( 5);


//      Кот поел из миски
        cat2.eating(dish1.foodInDish);

//      Создаём массив котов
        Cat[] catArr = new Cat[3];
        catArr[0] = new Cat("Черныш", 3, false);
        catArr[1] = new Cat("Беляш", 4, false);
        catArr[2] = new Cat("Наглый", 6, false);

//      Добавляем еду в миску
        dish1.addFood(7);

        for (int i = 0; i < catArr.length; i++){
            if (dish1.foodInDish >= 0){
                catArr[i].eating(dish1.foodInDish);
                dish1.foodInDish = dish1.foodInDish - catArr[i].foodСonsumption;

            }
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