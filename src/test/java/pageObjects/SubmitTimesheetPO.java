package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SubmitTimesheetPO {

    WebDriver driver;

    public SubmitTimesheetPO(WebDriver driver) {
        this.driver = driver;
    }

    private By TimeModule = By.id("menu_time_viewTimeModule");
    private By Timesheets = By.id("menu_time_Timesheets");
    private By MyTimesheet = By.id("menu_time_viewMyTimesheet");
    private By edit = By.className("edit");
    private By projectName = By.id("initialRows_0_projectName");
    private By projectNameKeys = By.id("initialRows_0_projectName");
    private By tag = By.xpath("//div[@class='ac_results']//li[3]");
    private By projectActivityName = By.id("initialRows_0_projectActivityName");
    private By projectActivityNameKey = By.id("initialRows_0_projectActivityName");
    private By Row1 = By.id("initialRows_0_0");
    private By Row2 = By.id("initialRows_0_1");
    private By Row3 = By.id("initialRows_0_2");
    private By Row4 = By.id("initialRows_0_3");
    private By Row5 = By.id("initialRows_0_4");
    private By Row6 = By.id("initialRows_0_5");
    private By Row7 = By.id("initialRows_0_6");
    private By submit = By.id("submitSave");

    public void timeModule() {
        driver.findElement(TimeModule).click();
        driver.findElement(Timesheets).click();
        driver.findElement(MyTimesheet).click();
    }

    public void fillTimesheet() {
        driver.findElement(edit).click();
        driver.findElement(projectName).click();
        driver.findElement(projectNameKeys).sendKeys("a");
        driver.findElement(tag).click();
        driver.findElement(projectActivityName).click();
        WebElement activityDropDown = driver.findElement(projectActivityNameKey);
        Select dropdown = new Select(activityDropDown);
        dropdown.selectByValue("12");
        driver.findElement(Row1).sendKeys("1");
        driver.findElement(Row2).sendKeys("1");
        driver.findElement(Row3).sendKeys("1");
        driver.findElement(Row4).sendKeys("1");
        driver.findElement(Row5).sendKeys("1");
        driver.findElement(Row6).sendKeys("1");
        driver.findElement(Row7).sendKeys("1");
    }

    public void submit() {
        driver.findElement(submit).click();
    }
}