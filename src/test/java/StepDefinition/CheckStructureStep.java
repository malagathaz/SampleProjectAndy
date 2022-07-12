package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckStructurePO;
import pageObjects.LoginPO;
import utils.TestContextSetup;

public class CheckStructureStep {

    LoginPO login;

    CheckStructurePO checkStructurePO;

    TestContextSetup testContextSetup;

    public CheckStructureStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.checkStructurePO = new CheckStructurePO(this.testContextSetup.driver);
    }

    @Given("User goes to the admin tab")
    public void user_goes_to_the_admin_tab() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        checkStructurePO.structureModule();
    }

    @When("User collapses the structure")
    public void user_collapses_the_structure() {
        checkStructurePO.collapseStructure();
    }

    @Then("User expands the structure")
    public void user_expands_the_structure() {
        checkStructurePO.expandStructure();
    }
}