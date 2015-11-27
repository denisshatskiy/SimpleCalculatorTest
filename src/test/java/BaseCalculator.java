import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseCalculator {

    protected static Calculator calculator;


    @BeforeClass(groups = "Base")
    public void SetUp(){
        calculator = new Calculator();
    }




}
