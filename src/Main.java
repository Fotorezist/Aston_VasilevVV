import java.util.*;

public class Main {
    public static void main(String[] args) {
//         Задание 1

        ArrayList<String> wordsArray = new ArrayList<>(Arrays.asList("Красный", "Желтый", "Красный", "Оранжевый", "Синий", "Желтый", "Красный", "Белый", "Синий", "Зеленый", "Черный", "Зеленый", "Красный", "Желтый","Оранжевый", "Синий"));

//         Коллекция для хранения уникальных слов
        Set<String> uniqueWords = new TreeSet<>();

//         Коллекция для подсчета количества появлений каждого слова
        Map<String, Integer> wordCount = new TreeMap<>();

//         Обход массива слов
        for (String word : wordsArray) {
//            Добавление слова в коллекцию уникальных слов
            uniqueWords.add(word);

//             Увеличение счетчика для данного слова
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

//         Вывод списка уникальных слов
        System.out.println("Уникальные слова: " + uniqueWords);

//         Вывод количества появлений каждого слова
        System.out.println("Количество появлений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//         Задание 2
//         Телефонный справочник

        System.out.println();

            PhoneBook phoneBook = new PhoneBook();

            phoneBook.addPhone("Иванов", "+7(8452) 74-86-11");
            phoneBook.addPhone("Петров", "+7(8452) 74-86-03");
            phoneBook.addPhone("Иванов", "+7(8452) 26-07-57");

            phoneBook.getPhone("Иванов");
            phoneBook.getPhone("Петров");

//            Вывод всего справочника
            phoneBook.printBook();

    }
}