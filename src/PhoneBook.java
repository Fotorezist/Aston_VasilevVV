import java.util.*;

public class PhoneBook {
        private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }

//     Метод для добавления записи в справочник
    public void addPhone(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
    }

//     Метод для получения списка телефонных номеров по фамилии
    public void getPhone(String lastName) {
        System.out.println(lastName + " : " + phoneBook.getOrDefault(lastName, new ArrayList<>()));
        }

    public void printBook(PhoneBook phoneBook) {
        System.out.println(this.phoneBook);
    }
}

