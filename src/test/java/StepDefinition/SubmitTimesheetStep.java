package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPO;
import pageObjects.SubmitTimesheetPO;
import utils.TestContextSetup;

public class SubmitTimesheetStep {

    LoginPO login;

    SubmitTimesheetPO submitTimesheetPO;

    TestContextSetup testContextSetup;

    public SubmitTimesheetStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.submitTimesheetPO = new SubmitTimesheetPO(this.testContextSetup.driver);
    }

    @Given("User navigates to timesheet module")
    public void user_navigates_to_timesheetModule() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        submitTimesheetPO.timeModule();
    }

    @When("Fills the timesheet")
    public void fillsTheTimesheet() {
        submitTimesheetPO.fillTimesheet();
    }

    @Then("User submits the timesheet")
    public void userSubmitsTheTimesheet() {
        submitTimesheetPO.submit();
    }
}
