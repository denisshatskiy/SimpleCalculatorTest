package runners;

import listeners.CustomLogger;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomRunner {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        TestListenerAdapter tla = new TestListenerAdapter();

        TestNG testNG = new TestNG();
        testNG.addListener(tla);
        testNG.addListener(new CustomLogger());
        List<String> suites = new ArrayList<>();
        suites.add(".//src//test//resources//allTests.xml");
        suites.add(".//src//test//resources//calculator.xml");
        suites.add(".//src//test//resources//parallel.xml");

        testNG.setTestSuites(suites);

        testNG.run();
    }
}
