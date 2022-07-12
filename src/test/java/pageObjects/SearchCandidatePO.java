package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchCandidatePO {

    WebDriver driver;

    public SearchCandidatePO(WebDriver driver) {
        this.driver = driver;
    }

    private By viewRecruitmentModule = By.id("menu_recruitment_viewRecruitmentModule");
    private By jobTitle = By.id("candidateSearch_jobVacancy");
    private By btnSrch = By.id("btnSrch");
    private By tag = By.xpath("//*[@id='resultTable']/tbody/tr[1]/td[3]/a");
    private By fileLink = By.className("fileLink");

    public void recruitmentModule() {
        driver.findElement(viewRecruitmentModule).click();
    }

    public void search() {

        WebElement jobTitleDropDown = driver.findElement(jobTitle);
        Select dropdown = new Select(jobTitleDropDown);
        dropdown.selectByValue("1");
        driver.findElement(btnSrch).click();
        driver.findElement(tag).click();
    }

    public void download() {
        driver.findElement(fileLink).click();
    }
}
