package runner;

import io.cucumber.core.backend.Glue;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/shopping.feature",
        glue = {"stepDefinitions", "hooks"} ,plugin = {"pretty", "html:target/cucumber-reports.html"},
        dryRun = false)

public class TestRunner {
}
