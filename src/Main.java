import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//      Задание 1
        printThreeWords();
//      Задание 2
        checkSumSign();
//      Задание 3
        printColor();
//      Задание 4
        compareNumbers();
//      Задание 5
        System.out.println(compareSumm(11, 11));
//      Задание 6
        positiveOrNegative(-5);
//      Задание 7
        System.out.println(positiveOrNegativeBoolean(-3));
//      Задание 8
        printString("Кря, кря", 3);
//      Задание 9
        System.out.println(leapYear(2000));

//      Задание 10
        int[] arr10 = {1,1,1,0,0,0};
        for (int i = 0; i < arr10.length; i++) {
            if (arr10[i] == 1)
                arr10[i] = 0;
            else
                arr10[i] = 1;
//            System.out.println(arr10[i]);
        }

//      Задание 11
        int[] arr11 = new int[100];
        for (int i = 0; i < arr11.length; i++) {
            arr11[i] = i + 1;
//            System.out.println(arr11[i]);
        }

//      Задание 12
        System.out.println();
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<arr12.length; i++) {
            if (arr12[i] < 6)
                arr12[i] = arr12[i] * 2;
//            System.out.println(arr12[i]);

        }

//      Задание 13
        int[][] arr13 = new int [5][5];
        for (int i = 0; i < arr13.length; i++) {
            for (int j = 0; j < arr13.length; j++) {
                if (i == j)
                    arr13[i][j] = 1;
                else if ((i + j) == (arr13.length - 1))
                    arr13[i][j] =1;

            }

        }

//        Вывод двумерного массива
//        Arrays.stream(arr13).map(Arrays::toString).forEach(System.out::println);

//      Задание 14
        initialArray(2,55);

            }

//      Методы
//      Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
//    Задание 2
    public static void checkSumSign(){
        int a, b;
        a = 4;
        b = 3;
        if ((a + b) >= 0 )
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");

    }
//    Задание 3
    public static void printColor() {
        int value = 5;

        if (value <= 0)
            System.out.println("Красный");
        else if (value > 100)
            System.out.println("Зелёный");
        else
            System.out.println("Желтый");


    }
//    Задание 4
    public static void compareNumbers() {
        int a, b;
        a = 1;
        b = 3;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");

    }
//      Задание 5
    public static boolean compareSumm(int a, int b) {
        boolean e;
        if ((a+b) < 10)
            e = false;
        else if ((a+b) > 20)
            e = false;
        else e = true;

//        Вариант без if )
//        boolean c = (a+b) >= 10;
//        boolean d = (a+b) <= 20;
//        boolean e = c==d;

        return e;

    }
//      Задание 6
    public static void positiveOrNegative(int number) {
        if (number >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");

    }
//      Задание 7
    public static boolean positiveOrNegativeBoolean(int number) {
        boolean e;
        if (number < 0)
            e = true;
        else e = false;
        return e;
    }
//      Задание 8
    public static void printString(String line, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(line);
        }

    }
//      Задание 9
    public static boolean leapYear(int year) {
        boolean leapYear;
        if (year % 400 == 0) {
            leapYear = true;

        } else if (year % 100 == 0) {
            leapYear = false;

            } else if (year % 4 == 0) {
            leapYear = true;

        } else {
            leapYear = false;

    }
        return leapYear;

    }

//      Задание 14
    public static void initialArray(int len, int initialValue) {
        int[] arr14 = new int[len];
        for (int i = 0; i < len; i++) {
            arr14[i] = initialValue;
//            System.out.println(arr14[i]);
        }

    }


}