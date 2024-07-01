import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 0")
    public void testFactorialOfZero() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(0));
    }

    @Test
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 1")
    public void testFactorialOfOne() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(1));
    }

    @Test
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 2")
    public void testFactorialOfFive() {
        Factorial factorial = new Factorial();
        assertEquals(2, factorial.calculateFactorial(2));
    }

    @Test
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 44(int to long)")
    public void testFactorialOfTen() {
        Factorial factorial = new Factorial();
        assertEquals(2673996885588443136L, factorial.calculateFactorial(44));
    }

    @Test
    @DisplayName("Проверка вычисления факториала для отрицательных чисел")
    public void testFactorialOfNegativeNumber() {
        Factorial factorial = new Factorial();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factorial.calculateFactorial(-1);
        });
        assertEquals("Факториал не может быть рассчитан для отрицательных чисел", exception.getMessage());
    }
}
