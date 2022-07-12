package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPO;
import pageObjects.ProjectReportPO;
import utils.TestContextSetup;

public class ProjectReportStep {

    LoginPO login;

    ProjectReportPO projectReportPO;

    TestContextSetup testContextSetup;

    public ProjectReportStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.projectReportPO = new ProjectReportPO(this.testContextSetup.driver);
    }

    @Given("User navigates to report module")
    public void user_navigates_to_report_module() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        projectReportPO.firstClicks();
    }

    @When("User selects the project to report")
    public void user_selects_the_project_to_report() {
        projectReportPO.projectDropdown();
    }

    @Then("User gets the project report")
    public void user_gets_the_project_report() {
        projectReportPO.reportView();
    }
}
