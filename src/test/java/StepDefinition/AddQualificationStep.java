package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddQualificationPO;
import pageObjects.LoginPO;
import utils.TestContextSetup;

public class AddQualificationStep {

    LoginPO login;

    AddQualificationPO qualificationPO;

    TestContextSetup testContextSetup;

    public AddQualificationStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.qualificationPO = new AddQualificationPO(this.testContextSetup.driver);
    }

    @Given("user is on admin tab")
    public void user_is_on_admin_tab() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        qualificationPO.firstClicks();
    }

    @When("user does the necessary clicks")
    public void user_does_the_necessary_clicks() {
        qualificationPO.secondClicks();
        qualificationPO.skillName();
        qualificationPO.skillDescription();
        qualificationPO.saveClick();
    }

    @Then("user gets confirmation for the change")
    public void user_gets_confirmation_for_the_change() {
        qualificationPO.confirmation();
    }
}
