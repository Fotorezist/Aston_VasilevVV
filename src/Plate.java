class Plate {
    private int eatCount;

    public Plate(int eatCount) {
        this.eatCount = eatCount;
    }

    public void eat() {
        if (eatCount > 0) {
            eatCount--;
        }
    }

    public int getEatCount() {
        return eatCount;
    }

    public void addEat(int count) {
        if (count > 0) {
            eatCount += count;
        }
    }
}
