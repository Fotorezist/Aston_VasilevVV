import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class FactorialTestNG {
    String name;

    @BeforeClass
    public void setup() {
        System.out.println("Это набор тестов программы для вычисления факториала");
    }
    @BeforeMethod
    public void configure(ITestResult result){
        name = result.getMethod().getDescription();
    }

    @Test(description="Проверка вычисления факториала от 0", priority = 1,groups="Correct_values")
    public void testFactorialOfZero() {
        Assert.assertEquals(Factorial.calculateFactorial(0), 1);
        System.out.println("Выполнен тест: " + name);
    }

    @Test(description="Проверка вычисления факториала от 1", priority = 2,groups="Correct_values")
    public void testFactorialOfOne() {
        Assert.assertEquals(Factorial.calculateFactorial(1), 1);
        System.out.println("Выполнен тест: " + name);
    }

    @Test(description="Проверка вычисления факториала от 2", priority = 3,groups="Correct_values")
    public void testFactorialOfTwo() {
        Assert.assertEquals(Factorial.calculateFactorial(2), 2);
        System.out.println("Выполнен тест: " + name);
    }

    @Test(description="Проверка вычисления факториала от 44(int to long)",priority = 4, invocationCount = 5,groups="Correct_values")
    public void testFactorialForLong() {
        Assert.assertEquals(Factorial.calculateFactorial(44), 2673996885588443136L);
        System.out.println("Выполнен тест: " + name);
    }

    @Test(description="Проверка вычисления факториала для отрицательных чисел",priority = 5, expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Факториал не может быть рассчитан для отрицательных чисел")
    public void testFactorialOfNegativeNumber() {
        System.out.println("Выполнен тест: " + name);
        Factorial.calculateFactorial(-1);
    }
}

