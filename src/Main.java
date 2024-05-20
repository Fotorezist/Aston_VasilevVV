import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareSumm(11, 1));
        positiveOrNegative(-5);
        printString("Кря, кря", 3);
        leapYear(2000);

        int[] arr10 = {1,1,1,0,0,0};
        for (int i = 0; i < arr10.length; i++) {
            if (arr10[i] == 1)
                arr10[i] = 0;
            else
                arr10[i] = 1;
        }


        int[] arr11 = new int[100];
        for (int i = 0; i < arr11.length; i++) {
            arr11[i] = i + 1;
//            System.out.println(arr11[i]);
        }
        System.out.println();
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<arr12.length; i++) {
            if (arr12[i] < 6)
                arr12[i] = arr12[i] * 2;
//            System.out.println(arr12[i]);

        }
        int[][] arr13 = new int [5][5];
        for (int i = 0; i < arr13.length; i++) {
            for (int j = 0; j < arr13.length; j++) {
                if (i == j)
                    arr13[i][j] = 1;
                else if ((i + j) == arr13.length-1)
                    arr13[i][j] =1;

            }

        }

//        Вывод двумерного массива
//        Arrays.stream(arr13).map(Arrays::toString).forEach(System.out::println);

        initialArray(2,55);

            }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSign(){
        int a, b;
        a = 4;
        b = 3;
        if ((a + b) >= 0 )
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");

    }

    public static void printColor() {
        int value = 16;

        if (value <= 0)
            System.out.println("Красный");
        else if (value > 100)
            System.out.println("Зелёный");
        else
            System.out.println("Желтый");


    }
    public static void compareNumbers() {
        int a, b;
        a = 1;
        b = 3;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");

    }

    public static boolean compareSumm(int a, int b) {
        boolean c = (a+b) >= 10;
        boolean d = (a+b) <= 20;
        boolean e = c==d;
        return e;

    }

    public static void positiveOrNegative(int a) {
        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");

    }

    public static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }

    }

    public static void leapYear(int year) {
    if (year % 400 == 0) {
        System.out.println("Год високосный");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный");

            } else if (year % 4 == 0) {
            System.out.println("Год високосный");

        } else {System.out.println("Год не високосный");

    }

    }

    public static void initialArray(int len, int initialValue) {
        int[] arr14 = new int[len];
        for (int i = 0; i < len; i++) {
            arr14[i] = initialValue;
//            System.out.println(arr14[i]);
        }

    }

}