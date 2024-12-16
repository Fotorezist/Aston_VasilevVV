import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        //Написать программу, которая будет возвращать количество передаваемого символа в слове.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово");
        String word = scanner.nextLine();

        System.out.println("Введите букву");
        char character = scanner.nextLine().charAt(0);
        scanner.close();
        int count = countChar(word, character);
        System.out.println("В слове " + word + " " + count + " символов " + character);
    }
    public static int countChar(String word, char character){
        int count = 0;
        for (char c : word.toCharArray()){
            if (c == character){
                count++;
            }
        }
        return count;
    }
}
