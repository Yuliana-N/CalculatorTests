
import org.testng.annotations.*;


import static org.testng.Assert.assertEquals;
public class SubtractionTests {
    Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
   }

//test parameters in XML
    @Parameters({"a", "b","result"})
    @Test(expectedExceptions = {ArithmeticException.class})
    public void subtractionTestParametersFromXML(@Optional("0") double a, @Optional("0") double b,  @Optional("0") double result) {
        double subtraction = calculator.minus(a, b);
        assertEquals(subtraction, result, "Вычитание рабоатет не корректно");
    }

    @Test(priority = 2)
    public void subtractionTestFromParameters2() {
        double multiply = calculator.minus(-1,1);;
        assertEquals(multiply, 0, "Вычитание рабоатет не корректно");
    }
    @Test(priority = 3)
    public void subtractionTestFromParameters3(){
        double multiply = calculator.minus(0,-1);;
        assertEquals(multiply, 1, "Вычитание рабоатет не корректно");
    }
}