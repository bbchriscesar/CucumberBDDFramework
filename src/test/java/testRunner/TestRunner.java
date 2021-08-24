package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = ".\\src\\test\\Resources\\Features",
                glue = "stepDefinitions",tags="@AllTest",
                monochrome = true,
                plugin = {"pretty", "json:target/json-report/cucumber.json"},
                dryRun = false
        )
public class TestRunner {
}
