package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( features = "src/test/resources/features/smokefeatures",
glue = "com/xyzbank",
dryRun = false,
tags = "@deposit")
public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
