import java.util.SequencedSet;

public class Enums {
    enum Season{
        WINTER, SPRING, SUMMER, AUTUMN, CITY
    }

    public static void main(String[] args) {

        System.out.println(method(Season.CITY));
    }
    private static String method(Season seasons){
        return switch (seasons){
            case WINTER -> "Зима";
            case SPRING -> "Весна";
            case SUMMER -> "Лето";
            case AUTUMN -> "Осень";
            default -> "ХЗ";
        };
    }
}
