// Задания для https://moodle.astondevs.ru/mod/assign/view.php?id=52069
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printThreeWords();
        printColor();
        compareNumbers();
    }
    // Задание 1
    public static void printThreeWords(){
        System.out.println("Первое слово");
        System.out.println("Второе слово");
        System.out.println("третье слово");
        }
    // Задание 2
    public static void printColor(){
        int value = 1;
        if (value < 0)
            System.out.println("Красный");
        else if (value > 100)
            System.out.println("Зелёный");
        else System.out.println("Жёлтый");

    }
    public static void compareNumbers(){
        int a = 12;
        int b = 14;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
    }
