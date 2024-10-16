class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0; // Коты не умеют плавать private boolean сытость;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
    }

    @Override public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Plate plate) {
        if (plate.getEatCount() > 0) {
            plate.eat();
            this.satiety = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не может покушать, еды нет.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
