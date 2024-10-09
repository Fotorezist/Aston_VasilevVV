import java.util.Arrays;

//Задания по курсу https://moodle.astondevs.ru/mod/assign/view.php?id=52071
public class Main {
    public static void main(String[] args) {

        System.out.println(compareSumm(12, 5));
        positiveOrNegative(-3);
        System.out.println(positiveOrNegativeBoolean(2));
        printString(3, "hi");
        System.out.println(leapYear(1986));

        //Задание 6
        int[] arr01 = {0,1,1,1,0,0,0,1};
        invertArray(arr01);
        System.out.println(Arrays.toString(arr01));
        array100();
        arrayX2();
        arrayCross(5);
        createArray(4,41);



    }
    //Задание 1
    public static boolean compareSumm(int a, int b){
    if ((a+b) < 10) return false;
    if ((a+b) > 20) return false;
       else return true;
    }
    //Задание 2
    public static void positiveOrNegative(int a){
        if (a < 0) System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
    }
    //Задание 3
    public static boolean positiveOrNegativeBoolean(int a){
        return a < 0;
    }
    //Задание 4
    public static void printString(int a, String line){
        for (int i = 0; i < a; i++) {
            System.out.println(line);
        }
    }
    //Задание 5
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }
    //Задание 6
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }
    //Задание 7
    public static void array100(){
        int[] arr100 = new int[100];
        for (int i = 0; i < 100; i++ ){
        arr100[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr100));
    }
    //Задание 8
    public static void arrayX2(){
        int[] arrX2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0;i < arrX2.length;i++){
            if (arrX2[i] < 6) arrX2[i] = arrX2[i] * 2;
            else arrX2[i] = arrX2[i];
        }
        System.out.println(Arrays.toString(arrX2));
    }
    //Задание 9
    public static void arrayCross(int size){
        int[][] array = new int[size][size];
            // заполняем главную и побочную диагональ
            for (int i = 0; i < size; i++) {
                array[i][i] = 1;
                array[i][size - i - 1] = 1;
            }
            Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
    }
    //Задание 10
    public static void createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        System.out.println(Arrays.toString(array));
    }
}