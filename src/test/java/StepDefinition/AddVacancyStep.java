package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddVacancyPO;
import pageObjects.LoginPO;
import utils.TestContextSetup;

public class AddVacancyStep {

    LoginPO login;

    AddVacancyPO addVacancyPO;

    TestContextSetup testContextSetup;

    public AddVacancyStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.addVacancyPO = new AddVacancyPO(this.testContextSetup.driver);
    }

    @Given("user is on vacancies tab")
    public void user_is_on_vacancies_tab() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        addVacancyPO.vacancyModule();
    }

    @When("user fills the information for the new vacancy")
    public void user_fills_the_information_for_the_new_vacancy() {
        addVacancyPO.vacancyAdd();
    }

    @Then("user gets confirmation for the vacancy added")
    public void user_gets_confirmation_for_the_vacancy_added() {
        addVacancyPO.save();
    }
}
