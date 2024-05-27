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
        int leftovers;
        leftovers = foodInDish - foodСonsumption;
        if (leftovers < 0) System.out.println("В миске мало еды, кот " + name + " остался голодным. " + " Его сытость = " + fullness);
        else {
            fullness = true;
            System.out.println(name + " наелся " + " Его сытость = " + fullness);
        }

    }
}
