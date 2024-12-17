import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Написать программу, который определяет является ли строка
//        "Аргентина манит негра" палиндромом
//        используя сканер и stringbuilder

        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        input = scanner.nextLine().toLowerCase().replace(" ", "");
        scanner.close();
        //String input = "Аргентина манит негра";
        System.out.println("Первый метод " + isPalindrome(input));

        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        System.out.println("Перевёрнутая строка " + reversed);

        if (input.contentEquals(reversed.toString())) {
            System.out.println("Второй метод, строка палиндром");
        } else {
            System.out.println("Второй метод, строка не палиндром ");
        }
    }

    public static boolean isPalindrome(String palindrome) {
        char[] chars = palindrome.toLowerCase().replace(" ", "").toCharArray();
        int leftCountter = 0;
        int rightCounter = chars.length - 1;

        while (leftCountter < rightCounter) {
            char leftChar = chars[leftCountter];
            char rightChar = chars[rightCounter];

            if (leftChar != rightChar) {
                return false;
            }
            leftCountter++;
            rightCounter--;
        }
        return true;
    }
}
