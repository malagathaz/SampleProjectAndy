package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPO;
import pageObjects.SearchEmployeePO;
import utils.TestContextSetup;

public class SearchEmployeeStep {

    LoginPO login;

    SearchEmployeePO searchEmployeePO;

    TestContextSetup testContextSetup;

    public SearchEmployeeStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.searchEmployeePO = new SearchEmployeePO(this.testContextSetup.driver);
    }

    @Given("user is on admin tab again")
    public void user_is_on_admin_tab_again() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        searchEmployeePO.adminTab();
    }

    @When("user does the necessary clicks to look for the employee")
    public void user_does_the_necessary_clicks_to_look_for_the_employee() {
        searchEmployeePO.setUserSearch();
        searchEmployeePO.clickSearchButton();
    }

    @Then("User gets the information for the employee")
    public void user_gets_confirmation_for_the_employee() {
        searchEmployeePO.employeeFound();
    }
}
