package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddVacancyPO {

    WebDriver driver;

    public AddVacancyPO(WebDriver driver) {
        this.driver = driver;
    }

    private By viewRecruitmentModule = By.id("menu_recruitment_viewRecruitmentModule");
    private By jobVacancy = By.id("menu_recruitment_viewJobVacancy");
    private By btnAdd = By.id("btnAdd");
    private By jobTitle = By.id("addJobVacancy_jobTitle");
    private By vacancyName = By.id("addJobVacancy_name");
    private By hiringManager = By.id("addJobVacancy_hiringManager");
    private By tag = By.xpath("(//li[@class='ac_even ac_over'])[1]");
    private By btnSave = By.id("btnSave");
    private By saved = By.id("successBodyEdit");

    public void vacancyModule() {
        driver.findElement(viewRecruitmentModule).click();
        driver.findElement(jobVacancy).click();
    }

    public void vacancyAdd() {
        driver.findElement(btnAdd).click();
        WebElement jobTitleDropDown = driver.findElement(jobTitle);
        Select dropdown = new Select(jobTitleDropDown);
        dropdown.selectByValue("26");
        driver.findElement(vacancyName).sendKeys("Automation Tester");
        driver.findElement(hiringManager).sendKeys("o");
        driver.findElement(tag).click();
    }

    public void save() {
        driver.findElement(btnSave).click();
        driver.findElement(saved);
    }
}
