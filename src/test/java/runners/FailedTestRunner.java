package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// This runner will be used later to rerun failed scenarios.
// For now, it is intentionally empty because the rerun plugin is not enabled yet.

//
//    @CucumberOptions(
//            features = "@target/rerun.txt",
//            glue = "step_definitions",
//            plugin = {
//                    "pretty",
//                    "html:target/cucumber-failed-report.html"
//
//            }
//    )

    public class FailedTestRunner extends AbstractTestNGCucumberTests {
    }



// purpose:
//        rerun failed tests only
