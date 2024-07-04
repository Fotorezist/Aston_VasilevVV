import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)

public class FactorialTestJunit5 {

    @BeforeAll
    static void message1(){
        System.out.println("Это набор тестов программы для вычисления факториала");
    }
    @AfterEach
    void message2(){
        System.out.println("Done");
    }

    @Test
    @Order(1)
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 0")
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.calculateFactorial(0));
        System.out.print("Тест 1: ");
    }

    @Test
    @Order(2)
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 1")
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.calculateFactorial(1));
        System.out.print("Тест 2: ");
    }

    @Test
    @Order(3)
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 2")
    public void testFactorialOfTwo() {
        assertEquals(2, Factorial.calculateFactorial(2));
        System.out.print("Тест 3: ");
    }


    @RepeatedTest(value = 5)
    @Order(4)
    @Tag("Correct_values")
    @DisplayName("Проверка вычисления факториала от 44(int to long)")
    public void testFactorialForLong() {
        assertEquals(2673996885588443136L, Factorial.calculateFactorial(44));
        System.out.print("Тест 4: ");
    }

    @Test
    @Order(5)
    @DisplayName("Проверка вычисления факториала для отрицательных чисел")
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-3);
        });
        assertEquals("Факториал не может быть рассчитан для отрицательных чисел", exception.getMessage());
        System.out.print("Тест 5: ");
    }
}

