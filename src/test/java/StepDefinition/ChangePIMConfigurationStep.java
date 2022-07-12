package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ChangePIMConfigurationPO;
import pageObjects.LoginPO;
import utils.TestContextSetup;

public class ChangePIMConfigurationStep {

    LoginPO login;

    ChangePIMConfigurationPO changePIMConfigurationPO;

    TestContextSetup testContextSetup;

    public ChangePIMConfigurationStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.changePIMConfigurationPO = new ChangePIMConfigurationPO(this.testContextSetup.driver);
    }

    @Given("user is on pim tab")
    public void userIsOnPimTab() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        changePIMConfigurationPO.pimModule();
    }

    @When("user changes configuration")
    public void userChangesConfiguration() {
        changePIMConfigurationPO.changeConfiguration();
    }

    @Then("user gets confirmation for the configuration change")
    public void userGetsConfirmationForTheConfigurationChange() {
        changePIMConfigurationPO.save();
    }
}
