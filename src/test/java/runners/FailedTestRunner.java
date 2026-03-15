package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = "@target/rerun.txt",
            glue = "step_definitions",
            plugin = {
                    "pretty",
                    "html:target/cucumber-failed-report.html"
            }
    )

    public class FailedTestRunner extends AbstractTestNGCucumberTests {
    }



// purpose:
//        rerun failed tests only
