import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqString {
    public static void main(String[] args) {
//        Напиши программу, которая на вход примет ArrayList строк и
//        удаляет из него все дубликаты, не используя метод contains().

      List<String> countries = new ArrayList<>();
      countries.add("Франция");
      countries.add("Германия");
      countries.add("Англия");
      countries.add("Франция");
      countries.add("Испания");
      countries.add("Англия");

      Set<String> uniqCountries = new HashSet<>();
//      Set<String> uniqCountries = new HashSet<>(countries);
//      uniqCountries.addAll(countries);
      for (String s:countries){
          uniqCountries.add(s);
      }
        System.out.println(uniqCountries);
    }
}
