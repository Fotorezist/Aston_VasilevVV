import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SurnamesSorted {
    public static void main(String[] args) {
        //  Есть стринговый лист фамилий, нужно пройтись по списку,
//  вытащить фамилии которые начинаются на А и поместить их
//  в другой список для дальнейшей работы с ними

        List <String> surnames = Arrays.asList("Афанасьев", "Ананьев", "Семёнов", "Петров", "Иванов", "Анкар");
        List <String> sortedSurnames = new ArrayList<>();
        for (String surname : surnames){
            if(surname.startsWith("А")){
                sortedSurnames.add(surname);
            }
        }
        System.out.println("1 " + sortedSurnames);

        List <String> filteredSurnames = filterSurnames(surnames);
        System.out.println("2 " + filteredSurnames);

    }
    public static List <String> filterSurnames(List <String> surnames){
        return surnames.stream()
                .filter(surname -> surname.charAt(0) == 'А')
                .collect(Collectors.toList());
    }
}
