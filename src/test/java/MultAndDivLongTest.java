import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultAndDivLongTest extends BaseCalculator {

    @Test(description = "Test for multinational by data provider", dataProvider = "multDp", groups = "Arithmetic", priority = 0)
    public void testMultLong(long a, long b, long expected){
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "Invalid result of multinational, expected: " + expected);
    }

    @Test(description = "Test for multinational with zero", groups = "Arithmetic", expectedExceptions = NumberFormatException.class, priority = 1)
    public void testMultinationalByZeroThrowsException(){
        long result = calculator.mult(101L, 0L);
    }

    @Test(description = "Test for division by data provider", dataProvider = "divDp", groups = "Arithmetic", priority = 2)
    public void testSubLong(long a, long b, long expected) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expected, "Invalid result of subtraction, expected: " + expected);
    }

    @Test(description = "Test for division with zero", groups = "Arithmetic", expectedExceptions = NumberFormatException.class, priority = 3)
    public void testDivisionByZeroThrowsException(){
        long result = calculator.div(101L, 0L);
    }

    @DataProvider(name = "multDp")
    public Object[][] valuesForMult() {
        return new Object[][]{
                {5623245989L, 85L, 477975909065L},
                {-855L, -63L, 53865L},
                {-62L, 63L, -3906L},
                {0L, 19L, 0L}
        };
    }

    @DataProvider(name = "divDp")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {5623245989L, 85L, 66155835.16470588D},
                {-855L, -5L, 171L},
                {-62L, 1L, -62L},
                {0L, 10L, 0L}
        };
    }
}