import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowAndSqrtTest extends BaseCalculator {

    @Test(description = "Test for involution by data provider", dataProvider = "powDp", groups = "Arithmetic", priority = 0)
    public void testPow(double a, double b, double expected){
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expected, "Invalid result of involution, expected: " + expected);
    }

    @Test(description = "Test for rootsquaring by data provider", dataProvider = "sqrtDp", groups = "Arithmetic", priority = 1)
    public void testSqrtLong(double a, double expected) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expected, "Invalid result of rootsquaring, expected: " + expected);
    }

    @Test(description = "Test for rootsquaring with zero", groups = "Arithmetic", expectedExceptions = NumberFormatException.class, priority = 2)
    public void testRootaquaringByNegativeNumberThrowsException(){
        double result = calculator.sqrt(-2.5);
    }

    @DataProvider(name = "powDp")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {2.5, 3.5, 24.705294220065463},
                {2.5, -3.5, 0.0404771540501552},
                {-2, 2.2, -4.59479341998814D},
                {-2.1, -2.2, -0.1954868513374198},
                {2D, 0D, 1D},
                {0D, 3D, 0D},
                {0D, 0D, 1D}
        };
    }

    @DataProvider(name = "sqrtDp")
    public Object[][] valuesForSqrt() {
        return new Object[][]{
                {2.5, 1.5811388300841898},
                {0D, 0D}
        };
    }
}