package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = "@target/rerun.txt",
            glue = "step_definitions",
            plugin = {
                    "pretty",
                    "html:target/cucumber-failed-report.html"
                    //"rerun:target/failed_scenarios.txt" if needed, add it in a FailedTR file as

                    // features = "@target/failed_scenarios.txt",
                    //    glue = "step_definitions"
            }
    )

    public class FailedTestRunner extends AbstractTestNGCucumberTests {
    }



// purpose:
//        rerun failed tests only
