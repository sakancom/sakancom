package featureSteps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "test_cases",
        plugin = "html:target/cucumber/report.html",
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "featureSteps") // Update the glue attribute with the correct package

public class Acceptencetest {
}
