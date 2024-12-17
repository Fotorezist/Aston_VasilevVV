import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RunUp3 {
    //    Напиши программу, которая на вход примет ArrayList строк
//    и удаляет из него все дубликаты, не используя метод contains().
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("2");

        remoweDup(list);

        Set<String> noDup = new HashSet<>(list);
//        noDup.addAll(list);
//        list.clear();
//        list.addAll(noDup);
//        System.out.println("Второй способ: " + list);
//        for (String el : list){
//            noDup.add(el);
//        }
        list.clear();
        list.addAll(noDup);
        System.out.println("Второй способ: " + list);

    }

    public static void remoweDup(ArrayList<String> list) {
        ArrayList<String> uniq = new ArrayList<>();

        for (String el : list) {
            boolean isDup = false;
            for (String uniqEl : uniq) {
                if (el.equals(uniqEl)) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                uniq.add(el);
            }
        }
        list.clear();
        list.addAll(uniq);
        System.out.println("Список без дублей: " + list);
    }
}
