package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/test/resources/features/sanityfeatures",
        glue = "com/xyzbank",
        dryRun = false,
        tags = "@managercontrols")
public class SanityTestRunner extends AbstractTestNGCucumberTests {
}
