package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features/regressionfeatures",
        glue = "com/xyzbank",
        tags = "",
        dryRun = false
        )
public class RegressionTestRunner extends AbstractTestNGCucumberTests {
}
