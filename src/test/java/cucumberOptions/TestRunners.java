package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/Features", glue = "StepDefinition", monochrome = true, plugin = {
        "html:target/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failed_scenarios.txt"}, tags = "@Qualification or @SearchEmployee or @CheckStructure" +
        " or @Leave or @ProjectReport or @Timesheet or @Candidate or @Vacancy or @ChangeConfiguration")
public class TestRunners extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
