package sakancom;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "test_cases",
        plugin = "html:target/cucumber/report2.html",
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "sakancom")

public class Acceptencetest {
}
