package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPO;
import pageObjects.SearchCandidatePO;
import utils.TestContextSetup;

public class SearchCandidateStep {

    LoginPO login;

    SearchCandidatePO searchCandidatePO;

    TestContextSetup testContextSetup;

    public SearchCandidateStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.login = new LoginPO(this.testContextSetup.driver);
        this.searchCandidatePO = new SearchCandidatePO(this.testContextSetup.driver);
    }

    @Given("user is on candidates tab")
    public void user_is_on_candidates_tab() {
        login.setUserName();
        login.setPassword();
        login.clickLogin();
        searchCandidatePO.recruitmentModule();
    }

    @When("user looks for the candidate")
    public void user_looks_for_the_candidate() {
        searchCandidatePO.search();
    }

    @Then("user downloads the resume for the candidate")
    public void user_downloads_the_resume_for_the_candidate() {
        searchCandidatePO.download();
    }
}
