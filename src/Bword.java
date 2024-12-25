import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bword {
    //Подсчитать количество строк в списке, начинабщихся с "B", используя Stream
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Red", "Black", "Green", "Blue", "Pink", "Brown");
        long sorted = words.stream()
                .filter(w -> w.startsWith("B"))
                .count();
        System.out.println("Количество слов на букву B: " + sorted);
    }
}
