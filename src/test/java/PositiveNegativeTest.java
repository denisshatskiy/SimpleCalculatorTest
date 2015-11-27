import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveNegativeTest extends BaseCalculator{

    private long value;
    private boolean expectedToBePositive;
    private boolean expectedToBeNegative;

    public PositiveNegativeTest (long value, boolean expectedToBePositive, boolean expectedToBeNegative){
        this.value = value;
        this.expectedToBePositive = expectedToBePositive;
        this.expectedToBeNegative = expectedToBeNegative;
    }

    @Test(description = "Check the positive value of number", groups = "Boolean", priority = 0)
    public void checkPositive(){
        Assert.assertTrue(calculator.isPositive(value) == expectedToBePositive);
    }

    @Test(description = "Check the negative value of number", groups = "Booolean", priority = 1)
    public void checkNegative(){
        Assert.assertTrue(calculator.isNegative(value) == expectedToBeNegative);
    }
}

