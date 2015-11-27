import org.testng.annotations.Factory;

public class PositiveNegativeFactoryTest {
    @Factory
    public Object[] getTests() {
        return new Object[]{
                new PositiveNegativeTest(10, true, false),
                new PositiveNegativeTest(-10, false, true),
                new PositiveNegativeTest(0, false, false),
        };
    }
}