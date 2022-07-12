package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LoginPO;
import utils.TestContextSetup;

public class LoginStep {

    LoginPO login;
    TestContextSetup testContextSetup;

    public LoginStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        login.confirmLogin();
    }

    @When("user enters correct username and password")
    public void user_enters_correct_username_and_password() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
    }

    @Then("user gets confirmation")
    public void user_gets_confirmation() {
        Assert.assertTrue(login.getTitle().contains("OrangeHRM"));
        //System.out.println(login.getTitle());
    }
}
