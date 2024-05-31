public class Dog extends Animal {
    static int dogNumber;

    public Dog (String name) {
        dogNumber ++;
        this.name = name;
    }

        public void run (int distance) {
            distance = Math.abs(distance);
            if (distance > 500) System.out.println(name + " столько не пробежит");
            else System.out.println(name + " пробежал " + distance + " метров");

        }
        public void swim(int distance) {
            distance = Math.abs(distance);
            if (distance > 10) {
                System.out.println(name + " столько не проплывёт");
            }
            else {
                System.out.println(name + " проплыл " + distance + " метров");
            }

        }


}
