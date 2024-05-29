public class Triangle implements Figure{

    double sideA;
    double sideB;
    double sideC;
    String background;
    String border;

    public Triangle (double sideA, double sideB, double sideC, String background, String border){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.background = background;
        this.border = border;
    }

    @Override
    public void square() {
        double square, halfPerimeter;
        halfPerimeter = (sideA + sideB + sideC) / 2;
        square = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        System.out.println("Площадь треугольника = " + square);
    }

    @Override
    public void borderLength() {
        double lenght;
        lenght = sideA + sideB + sideC;
        System.out.println("Периметр треугольника = " + lenght);
    }

    @Override
    public void background() {
        System.out.println("Цвет фона треугольника: " + background);

    }

    @Override
    public void border() {
        System.out.println("Цвет границы треугольника: " + border);

    }
}
