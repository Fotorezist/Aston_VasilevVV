public class Circle implements Figure {

    double radius;
    String background;
    String border;

    public Circle (double radius, String background, String border){
        this.radius = Math.abs(radius);
        this.background = background;
        this.border = border;
    }

    @Override
    public void square() {
        double square;
        square = Math.PI * (radius * radius);
        System.out.println("Площадь круга = " + square);

    }

    @Override
    public void borderLength() {
        double borderLength;
        borderLength = 2 * Math.PI * radius;
        System.out.println("Длинна окружности = " + borderLength);

    }

    @Override
    public void background() {
        System.out.println("Цвет фона круга: " + background);

    }

    @Override
    public void border() {
        System.out.println("Цвет границы круга: " + border);

    }
}
