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
    public void empty(int foodMinus) {
        foodInDish = foodInDish - foodMinus;
        if (foodInDish > 0) {
            System.out.println("В миске осталось " + foodInDish + " еды");
        }
        else {
            System.out.println("Миска пуста");
        }
    }

}