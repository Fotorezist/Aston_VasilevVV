import java.util.ArrayList;
import java.util.List;

public class List5Plus {

//    На вход подается список чисел List<Integer> input,
//    далее пройти по списку,
//    и если элемент четный:
//    прибавить к нему предыдущий результат или 1 если ещё нет такого и положить в выходной список,
//    иначе просто положить в выходной список
//    например: 0,1,2,3,4,5 -> 1,1,3,3,7,5

    public static void main(String[] args) {
        List<Integer> list = List.of(0, 1, 2, 3, 4, 5);

        System.out.println(rez(list));
    }

    public static List<Integer> rez(List<Integer> input) {
        List<Integer> temp = new ArrayList<>();
        if (input == null && input.isEmpty()) return temp;
        temp.add(input.get(0) + 1);
        for (int i = 1; i < input.size(); i++) {
            if (i % 2 == 0) {
                temp.add(input.get(i) + input.get(i - 1));
            } else temp.add(i);
        }
        return temp;
    }
}
