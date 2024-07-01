public class Factorial {
    static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не может быть рассчитан для отрицательных чисел");
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
    }
}
