package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"stepDefinition"},
    tags = "@SmokeTest",
   // plugin = {"html: test-reports"},
    plugin = {"pretty"},
    //plugin = {"json: test-reports/json-report.json"},
    monochrome = true
)

public class ActivitiesRunner {
    //empty
}