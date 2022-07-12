package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignLeavePO;
import pageObjects.LoginPO;
import utils.TestContextSetup;

public class AssignLeaveStep {

    LoginPO login;

    AssignLeavePO assignLeavePO;

    TestContextSetup testContextSetup;

    public AssignLeaveStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.assignLeavePO = new AssignLeavePO(this.testContextSetup.driver);
    }

    @Given("user is on leave tab")
    public void userIsOnLeaveTab() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        assignLeavePO.clickLeaveTab();
        assignLeavePO.clickAssignLeaveTab();
    }


    @When("fills the form to assign leave")
    public void fillsTheFormToAssignLeave() {
        assignLeavePO.typeEmpName();
        assignLeavePO.selectEmp();
        assignLeavePO.selectLeaveDropdown();
        assignLeavePO.clickFromDate();
        assignLeavePO.comment();
    }

    @Then("user gets confirmation for the leave")
    public void userGetsConfirmationForTheLeave() {
        assignLeavePO.confirm();
    }
}
