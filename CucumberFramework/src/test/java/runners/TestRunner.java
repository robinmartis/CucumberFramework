package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources",
    glue = {"stepdefinitions"},
    
    monochrome = false
//    dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
