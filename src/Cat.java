public class Cat extends Animal{
    static int catNumber;
    int foodConsumption;
    Boolean fullness;

    public Cat (String name, int foodConsumption, Boolean fullness) {
        catNumber++;
        this.name = name;
        this.foodConsumption = foodConsumption;
        this.fullness = fullness;
    }
    public void run (int distance){
        if (distance > 200) {
            System.out.println(name + " столько не пробежит");
        }
        else {
            System.out.println(name + " пробежал " + distance + " метров");
        }

    }
    public void swim (int distance){
        System.out.println(name + " не умеет плавать");

    }
    public int eating (int foodInDish) {
        if (fullness == true) {
            System.out.println("Не кормите кота " + name + " , он уже сыт!");
        }
        else {
            if (foodConsumption > foodInDish){
            System.out.println("В миске мало еды, кот " + name + " остался голодным. " + " Его сытость = " + fullness);
            System.out.println("В миске осталось " + foodInDish + " еды");}

         else {
            fullness = true;
                System.out.println(name + " съел " + foodConsumption + " еды и наелся. " + " Его сытость = " + fullness);
         }
            return foodConsumption;

        }

        return 0;

    }
}
