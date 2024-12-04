import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDouble {
    public static void main(String[] args) {
        //Напиши программу, которая на вход примет ArrayList строк и
//        удаляет из него все дубликаты, не используя метод contains().
//        ArrayList<String> countries = new ArrayList<>();

        List<String> countries = new ArrayList<>();
        countries.add("A");
        countries.add("B");
        countries.add("A");
        countries.add("C");
        countries.add("B");
        countries.add("D");
        Set<String> sortedCountries = new HashSet<>();
        for (String s : countries){
            sortedCountries.add(s);
        }
//        sortedCountries.addAll(countries);
        System.out.println(sortedCountries);
    }
}
