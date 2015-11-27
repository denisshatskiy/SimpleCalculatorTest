import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumAndSubDoubleTest extends BaseCalculator {

    @Test(description = "Test for summation by data provider", dataProvider = "sumDp", groups = "Arithmetic", priority = 0)
    public void testSumLong(double a, double b, double expected) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expected, "Invalid result of summation, expected: " + expected);
    }

    @Test(description = "Test for subtraction by data provider", dataProvider = "subDp", groups = "Arithmetic", priority = 1)
    public void testSubLong(double a, double b, double expected) {
        double result = calculator.sub(a, b);
        org.testng.Assert.assertEquals(result, expected, "Invalid result of subtraction, expected: " + expected);
    }

    @DataProvider(name = "sumDp")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {01.758654651D, 4646541.02D, 4646542.7786546508},
                {-855.63D, -0.3333D, -855.9633D},
                {-62.62D, 63.9D, 1.37D},
                {0D, 0D, 0D}
        };
    }

    @DataProvider(name = "subDp")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {01.758654651D, 4646541.02, -4646539.261345348D},
                {-855.63D, -0.3333D, -855.2967D},
                {-62.62D, 63.9D, -126.52D},
                {0D, 0D, 0D}
        };
    }
}
