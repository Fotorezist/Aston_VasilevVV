public class Dish {
    int foodInDish;

    public Dish() {
        this.foodInDish = 0;
        System.out.println("Достали миску из шкафа");

    }

    public void addFood(int addCount) {

        if (addCount > 0){
            System.out.println("В миску добавлено " + addCount + " еды");
            foodInDish = foodInDish + addCount;

        } else {
            System.out.println("Из миски забрали " + (addCount * (-1)) + " еды");
            foodInDish = foodInDish + addCount;
            if (foodInDish < 0) {
                System.out.println("Нельзя забрать из миски больше чем там есть");
                foodInDish = 0;
            } else {
                System.out.println("В миске осталось " + foodInDish + " еды");
            }

        }
        System.out.println();

    }
    public int emptying(int foodMinus) {
        if (foodInDish >= foodMinus) {
            foodInDish = foodInDish - foodMinus;
            System.out.println("В миске осталось " + foodInDish + " еды");
            System.out.println();
        }
        else {
            System.out.println("Добавьте еды");
        }
    return foodInDish;
    }


}