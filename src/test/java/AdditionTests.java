
import org.testng.annotations.*;


import static org.testng.Assert.assertEquals;

public class AdditionTests {

    Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @DataProvider(name = "Данные для суммирования")
    public Object[][] inputForSum() {
        return new Object[][]{
                {1, 1, 2},
                {-1, -1, -2},
                {0, 0, 0},
                {-1, 0, -1},
                {0, -1, -1},
                {2.5, 3.1, 5.6},
                {1000000000, 1000000000, 2000000000},
        };
    }

    @Test(dataProvider = "Данные для суммирования")
    public void testSum(double a, double b, double expectedResult) {
        double sum = calculator.sum(a, b);
        assertEquals(sum, expectedResult, "Сложение рабоатет не корректно");
    }
}