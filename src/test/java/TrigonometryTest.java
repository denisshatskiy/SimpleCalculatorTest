import junit.framework.Assert;
import org.testng.annotations.Test;

public class TrigonometryTest extends BaseCalculator {

    @Test(description = "Check the result of Sin 0 degree", groups = "Trigonometry", priority = 0)
    public void sin0(){
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0D);
    }

    @Test(description = "Check the result of Sin 30 degree", groups = "Trigonometry", priority = 1)
    public void sin30(){
        double result = round(calculator.sin(Math.PI / 6));
        Assert.assertEquals(result, 0.5);
    }

    @Test(description = "Check the result of Sin 45 degree", groups = "Trigonometry", priority = 2)
    public void sin45(){
        double result = round(calculator.sin(Math.PI / 4));
        Assert.assertEquals(result, 0.7071);
    }

    @Test(description = "Check the result of Cosines 0 degree", groups = "Trigonometry", priority = 3)
    public void cos0(){
        double result = round(calculator.cos(0));
        Assert.assertEquals(result, 0D);
    }

    @Test(description = "Check the result of Cosines 30 degree", groups = "Trigonometry", priority = 4)
    public void cos30(){
        double result = round(calculator.cos(Math.PI / 6));
        Assert.assertEquals(result, 0.866);
    }

    @Test(description = "Check the result of Cosines 45 degree", groups = "Trigonometry", priority = 5)
    public void cos45(){
        double result = round(calculator.cos(Math.PI / 4));
        Assert.assertEquals(result, 0.7071);
    }

    @Test(description = "Check the result of Tangent 0 degree", groups = "Trigonometry", priority = 6)
    public void tg0(){
        double result = round(calculator.tg(0D));
        Assert.assertEquals(result, 0D);
    }

    @Test(description = "Check the result of Tangent 30 degree", groups = "Trigonometry", priority = 7)
    public void tg30(){
        double result = round(calculator.tg(Math.PI / 6));
        Assert.assertEquals(result, 0.5773);
    }

    @Test(description = "Check the result of Tangent 45 degree", groups = "Trigonometry", priority = 8)
    public void tg45(){
        double result = round(calculator.tg(Math.PI / 4));
        Assert.assertEquals(result, 1D);
    }

    @Test(description = "Check the result of Cotangent 0 degree", expectedExceptions = NumberFormatException.class, groups = "Trigonometry", priority = 9)
    public void ctg0(){
        double result = round(calculator.ctg(0D));
    }

    @Test(description = "Check the result of Cotangent 30 degree", groups = "Trigonometry", priority = 10)
    public void ctg30(){
        double result = round(calculator.ctg(Math.PI / 6));
        Assert.assertEquals(result, 1.7321);
    }

    @Test(description = "Check the result of Cotangent 45 degree", groups = "Trigonometry", priority = 11)
    public void ctg45(){
        double result = round(calculator.ctg(Math.PI / 4));
        Assert.assertEquals(result, 1D);
    }

    private double round (double value){
        return (double)Math.round(value * 10000d) / 10000d;
    }

}
