import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Факториал любого числа используя scaner, с проверкой на -
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала");
        int inputNumber = scanner.nextInt();
        scanner.close();
        if (inputNumber < 0){
            System.out.println("Введеное число меньше нуля");
        } else {
            long result = factorial(inputNumber);
            System.out.println("Факториал для " + inputNumber + " = " + result);
        }
    }
    public static long factorial (int input){
        long res = 1;
        for (int i = 1; i <= input; i++){
            res *= i;
        }
        return res;
    }

}
