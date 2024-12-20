import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ChangeTwoInt {
    //    поменять значения двух переменных a и b местами без использования дополнительных переменных
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        String a = scanner.nextLine();
        int aa = parseInt(a);
        System.out.println("Введите число b");
        String b = scanner.nextLine();
        int bb = parseInt(b);
        scanner.close();
        aa = aa + bb;
        bb = aa - bb;
        aa = aa - bb;

        System.out.println("a = " + aa + " b = " + bb);
    }
}
