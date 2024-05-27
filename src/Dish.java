public class Dish {
    int foodInDish;

    public Dish(int foodInDish) {
        this.foodInDish = foodInDish;
    }

    public void addFood(int addCount) {

        System.out.println("В миску добавлено " + addCount + " еды");
        System.out.println();
        foodInDish = foodInDish + addCount;

    }

}