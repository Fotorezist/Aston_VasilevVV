public class Rectangle implements Figure {

    double sideA;
    double sideB;
    String background;
    String border;

    public Rectangle (double sideA, double sideB, String background, String border){
        this.sideA = Math.abs(sideA);
        this.sideB = Math.abs(sideB);
        this.background = background;
        this.border = border;
    }

    @Override
    public void square() {
        double square;
        square = sideA * sideB;
        System.out.println("Площадь прямоугольника = " + square);

    }

    @Override
    public void borderLength() {
        double lenght;
        lenght = (sideA + sideB) * 2;
        System.out.println("Периметр прямоугольника = " + lenght);

    }

    @Override
    public void background() {
        System.out.println("Цвет фона прямоугольника: " + background);

    }

    @Override
    public void border() {
        System.out.println("Цвет границы прямоугольника: " + border);

    }
}
