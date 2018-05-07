package steps;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        strict = true,
        //tags = "@category, @obrigatory",
        features = "src/test/resources/features/",
        glue = "steps",
        monochrome = false,
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:results/cucumber.json",
                "junit:results/cucumber.xml"
        }
)

public class RunnerTests {
}
