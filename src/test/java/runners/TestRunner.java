package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "step_definitions",
            plugin = {
                    "pretty",
                    "html:target/cucumber-report.html"
                    //"rerun:target/failed_scenarios.txt" if needed, add it in a FailedTR file as

                    // features = "@target/failed_scenarios.txt",
                    //    glue = "step_definitions"
            },
            dryRun = true,
            tags=""
    )

    public class TestRunner extends AbstractTestNGCucumberTests {
    }




