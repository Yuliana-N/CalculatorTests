import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultiplicationTests {
    Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Parameters({"a", "b", "result"})
    @Test(expectedExceptions = {ArithmeticException.class}, priority = 1)
    public void multiplyTestParametersFromXML(@Optional("0") double a, @Optional("0") double b, @Optional("0") double result) {
        double multiply = calculator.multiply(a, b);
        assertEquals(multiply, result, "Умножние рабоатет не корректно");
    }

    @Test(priority = 2)
    public void multiplyFromParameters(){
        double multiply = calculator.multiply(-1,0);;
        assertEquals(multiply, 0, "Умножние рабоатет не корректно");
    }
}
