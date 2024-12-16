import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SurnameSorted2 {
    public static void main(String[] args) {
        //Создать List string, наполнить фамилиями и вывести фамилии на определённую букву используя stream
        List<String> surnames = new ArrayList<>();
        surnames.add("Иванов");
        surnames.add("Афанасьев");
        surnames.add("Петров");
        surnames.add("Алексеев");
        surnames.add("Дашков");
        surnames.add("Сергеев");
        surnames.add("Анищенко");
        surnames.add("Скумбриевич");

        String sort = "А";

        List<String> sortedSur = surnames.stream()
                .filter(x -> x.startsWith(sort))
                .collect(Collectors.toList());

        System.out.println("Фамилии, начинающиеся с буквы " + sort + " : " + sortedSur);
    }
}
