package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProjectReportPO {
    WebDriver driver;

    public ProjectReportPO(WebDriver driver) {
        this.driver = driver;
    }

    private By TimeModule = By.id("menu_time_viewTimeModule");
    private By TimeReports = By.id("menu_time_Reports");
    private By ProjectReportCriteria = By.id("menu_time_displayProjectReportCriteria");
    private By ProjectName = By.id("time_project_name");
    private By ProjectFromName = By.id("project_date_range_from_date");
    private By ProjectFromNameField = By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']");
    private By ProjectToName = By.id("project_date_range_to_date");
    private By ProjectToNameField = By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']");
    private By ViewButton = By.id("viewbutton");

    public void firstClicks() {
        driver.findElement(TimeModule).click();
        driver.findElement(TimeReports).click();
        driver.findElement(ProjectReportCriteria).click();
    }

    public void projectDropdown() {
        WebElement projectDropDown = driver.findElement(ProjectName);
        Select dropdown = new Select(projectDropDown);
        dropdown.selectByIndex(2);
        driver.findElement(ProjectFromName).click();
        driver.findElement(ProjectFromNameField).click();
        driver.findElement(ProjectToName).click();
        driver.findElement(ProjectToNameField).click();
    }

    public void reportView() {
        driver.findElement(ViewButton).click();
    }
}