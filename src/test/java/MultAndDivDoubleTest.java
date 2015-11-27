import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultAndDivDoubleTest extends BaseCalculator {

    @Test(description = "Test for multinational by data provider", dataProvider = "multDp", priority = 0, groups = "Arithmetic")
    public void testMultLong(double a, double b, double expected){
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "Invalid result of multinational, expected: " + expected);
    }

    @Test(description = "Test for multinational with zero", groups = "Arithmetic", expectedExceptions = NumberFormatException.class, priority = 1)
    public void testMultinationalByZeroThrowsException(){
        double result = calculator.mult(101D, 0D);
    }

    @Test(description = "Test for division by data provider", dataProvider = "divDp", groups = "Arithmetic", priority = 2)
    public void testDivLong(double a, double b, double expected) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expected, "Invalid result of subtraction, expected: " + expected);
    }

    @Test(description = "Test for division with zero", groups = "Arithmetic", expectedExceptions = NumberFormatException.class, priority = 3)
    public void testDivisionByZeroThrowsException(){
        double result = calculator.div(101D, 0D);
    }

    @DataProvider(name = "multDp")
    public Object[][] valuesForMult() {
        return new Object[][]{
                {01.758654651D, 4646541.02D, 8171660.9758852832D},
                {-855.63D, -0.3333D, 285181479D},
                {-62.62D, 63.9D, -4001.418D},
                {0D, 10D, 0D}
        };
    }

    @DataProvider(name = "divDp")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {01.758654651D, 4646541.02D, 0.0000003785D},
                {-855.63D, -0.3333D, 2567.1467146715D},
                {-62.62D, 63.9D, -0.9799687011D},
                {0D, 10D, 0D}
        };
    }
}