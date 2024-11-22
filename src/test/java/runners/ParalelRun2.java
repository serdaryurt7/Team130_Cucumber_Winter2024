package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/paralelReports/rapor2.html",
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@e2e",
        dryRun = false
)
public class ParalelRun2 {
}
