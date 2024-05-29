public class Cat extends Animal{
    static int catNumber;
    int foodСonsumption;
    Boolean fullness;

    public Cat (String name, int foodСonsumption, Boolean fullness) {
        catNumber++;
        this.name = name;
        this.foodСonsumption = foodСonsumption;
                this.fullness = fullness;
    }
    public void run (int distance){
        if (distance > 200) System.out.println(name + " столько не пробежит");
        else System.out.println(name + " пробежал " + distance + " метров");

    }
    public void swim (int distance){
        System.out.println(name + " не умеет плавать");

    }
    public void eating (int foodInDish){
        Dish dish1 = new Dish(foodInDish);
        if (foodСonsumption > foodInDish){
            System.out.println("В миске мало еды, кот " + name + " остался голодным. " + " Его сытость = " + fullness);
            System.out.println("В миске осталось " + foodInDish + " еды");
        }
        else {
                fullness = true;
                System.out.println(name + " наелся " + " Его сытость = " + fullness);

            dish1.empty(foodСonsumption);
        }

    }
}
