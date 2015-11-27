import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumAndSubLongTest extends BaseCalculator {

    @Test(description = "Test for summation by data provider", dataProvider = "sumDp", groups = "Arithmetic", priority = 0)
    public void testSumLong(long a, long b, long expected) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expected, "Invalid result of summation, expected: " + expected);
    }

    @Test(description = "Test for subtraction by data provider", dataProvider = "subDp", groups = "Arithmetic", priority = 1)
    public void testSubLong(long a, long b, long expected) {
        long result = calculator.sub(a, b);
        org.testng.Assert.assertEquals(result, expected, "Invalid result of subtraction, expected: " + expected);
    }

    @DataProvider(name = "sumDp")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {5623245989L, 85, 5623246074L},
                {-855, -63, -918},
                {-62, 63, 1},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "subDp")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {5623245989L, 85, 5623245904L},
                {-855, -63, -792},
                {62, -63, 125},
                {0, 0, 0}
        };
    }
}
