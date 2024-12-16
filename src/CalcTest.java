import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalcTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(calculator.add(2, 3), 5);
        Assert.assertEquals(calculator.add(-1, 1), 0);
        Assert.assertEquals(calculator.add(-1, -1), -2);
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(calculator.subtract(5, 3),2);
        Assert.assertEquals(calculator.subtract(-1, -1),0);
        Assert.assertEquals(calculator.subtract(-1, 1),-2);
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(calculator.multiply(2,3),6);
        Assert.assertEquals(calculator.multiply(-1,1),-1);
        Assert.assertEquals(calculator.multiply(-1,-1),1);
    }

    @Test
    public void testDivide(){
        Assert.assertEquals(calculator.divide(6,3), 2);
        Assert.assertEquals(calculator.divide(-1,1), -1);
        Assert.assertEquals(calculator.divide(-6,-2), 3);
    }
}
