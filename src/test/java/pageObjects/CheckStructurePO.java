package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckStructurePO {

    WebDriver driver;

    public CheckStructurePO(WebDriver driver) {
        this.driver = driver;
    }

    private By viewAdminModule = By.id("menu_admin_viewAdminModule");
    private By adminOrganization = By.id("menu_admin_Organization");
    private By viewCompanyStructure = By.id("menu_admin_viewCompanyStructure");
    private By tag1 = By.xpath("//li[@id='node_3']//div[@class='hitarea collapsable-hitarea']");
    private By tag2 = By.xpath("//li[@id='node_7']//div[@class='hitarea collapsable-hitarea']");
    private By tag3 = By.xpath("//li[@id='node_10']//div[@class='hitarea collapsable-hitarea']");
    private By tag4 = By.xpath("//li[@id='node_3']//div[@class='hitarea expandable-hitarea']");
    private By tag5 = By.xpath("//li[@id='node_7']//div[@class='hitarea expandable-hitarea']");
    private By tag6 = By.xpath("//li[@id='node_10']//div[@class='hitarea expandable-hitarea']");

    public void structureModule() {
        driver.findElement(viewAdminModule).click();
        driver.findElement(adminOrganization).click();
        driver.findElement(viewCompanyStructure).click();
    }

    public void collapseStructure() {
        driver.findElement(tag1).click();
        driver.findElement(tag2).click();
        driver.findElement(tag3).click();
    }

    public void expandStructure() {
        driver.findElement(tag4).click();
        driver.findElement(tag5).click();
        driver.findElement(tag6).click();
    }

}