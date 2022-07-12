package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchEmployeePO {
    WebDriver driver;

    public SearchEmployeePO(WebDriver driver) {
        this.driver = driver;
    }

    private By adminTab = By.id("menu_admin_viewAdminModule");
    private By userName = By.name("searchSystemUser[userName]");
    private By searchButton = By.className("searchbutton");
    private By employee = By.xpath("//a[normalize-space()='adash']");

    public void adminTab() {
        driver.findElement(adminTab).click();
    }

    public void setUserSearch() {
        driver.findElement(userName).sendKeys("Adash");
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void employeeFound() {
        driver.findElement(employee);
    }
}
