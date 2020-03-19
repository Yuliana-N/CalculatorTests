import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivisionTests {
    Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Parameters({"a", "b", "result"})
    @Test(expectedExceptions = {ArithmeticException.class}, priority = 1)
    public void subtractionTestParametersFromXML(@Optional("0") double a, @Optional("0") double b, @Optional("0") double result) {
        double division = calculator.division(a, b);
        assertEquals(division, result, "Деление рабоатет не корректно");
    }

    @Test(expectedExceptions = {ArithmeticException.class}, priority = 2, description = "Проверка деления на ноль")
    public void subtractionTestFromParameters3() {
        assertEquals(calculator.division(1, 0), "Деление на ноль!", "Не предусмотрена проверка на деление на ноль");
    }
}


