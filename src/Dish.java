public class Dish {
    int foodInDish;

    public Dish(int foodInDish) {
        this.foodInDish = foodInDish;
        System.out.println("В миску положили: " + foodInDish + " еды");
    }

    public void addFood(int addCount) {

        System.out.println("В миску добавлено " + addCount + " еды");
        foodInDish = foodInDish + addCount;
        System.out.println("Теперь миске: " + foodInDish + " еды");
        System.out.println();

    }
    public int emptying(int foodMinus) {
        foodInDish = foodInDish - foodMinus;
        if (foodInDish >= 0) {
            System.out.println("В миске осталось " + foodInDish + " еды");
            System.out.println();
        }
        else {
            System.out.println("Добавьте еды");
        }
    return foodInDish;
    }


}