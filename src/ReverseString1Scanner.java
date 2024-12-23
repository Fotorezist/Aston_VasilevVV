import java.util.Scanner;

public class ReverseString1Scanner {
    //Развернуть произвольную строку не используя методы типа revers() и используя один массив
    // (ввод доп строки scanner'ом)
    public static void main(String[] args) {
        String str;
        do {
            System.out.println("Введите строку");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            StringBuilder reverseStr = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                reverseStr.append(str.charAt(i));
            }
            System.out.println("Перевёрнутая строка: " + reverseStr);
        } while (!str.equals("end"));
    }
}
