import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(OrderAnnotation.class)

public class FactorialTestJunit5 {

    @BeforeAll
    static void message1(){
        System.out.println("Это набор тестов программы для вычисления факториала");
    }

    @Test
    @Order(1)
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 0")
    public void testFactorialOfZero() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(0));
        System.out.println("Тест 1 пройден успешно");
    }

    @Test
    @Order(2)
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 1")
    public void testFactorialOfOne() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(1));
        System.out.println("Тест 2 пройден успешно");
    }

    @Test
    @Order(3)
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 2")
    public void testFactorialOfTwo() {
        Factorial factorial = new Factorial();
        assertEquals(2, factorial.calculateFactorial(2));
        System.out.println("Тест 3 пройден успешно");
    }


    @RepeatedTest(value = 5)
    @Order(4)
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 44(int to long)")
    public void testFactorialForLong() {
        Factorial factorial = new Factorial();
        assertEquals(2673996885588443136L, factorial.calculateFactorial(44));
        System.out.println("Тест 4 пройден успешно");
    }

    @Test
    @Order(5)
    @DisplayName("Проверка вычисления факториала для отрицательных чисел")
    public void testFactorialOfNegativeNumber() {
        Factorial factorial = new Factorial();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factorial.calculateFactorial(-3);
        });
        assertEquals("Факториал не может быть рассчитан для отрицательных чисел", exception.getMessage());
        System.out.println("Тест 5 пройден успешно");
    }
}

