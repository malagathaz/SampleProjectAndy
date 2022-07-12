package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePIMConfigurationPO {

    WebDriver driver;

    public ChangePIMConfigurationPO(WebDriver driver) {
        this.driver = driver;
    }

    private By pimModule = By.id("menu_pim_viewPimModule");
    private By configuation = By.id("menu_pim_Configuration");
    private By configuationPim = By.id("menu_pim_configurePim");
    private By SaveButton = By.id("btnSave");
    private By clickCheck = By.id("configPim_chkShowSSN");
    private By ButtonSave = By.id("btnSave");
    private By confirm = By.id("successBodyEdit");

    public void pimModule() {
        driver.findElement(pimModule).click();
        driver.findElement(configuation).click();
    }

    public void changeConfiguration() {
        driver.findElement(configuationPim).click();
        driver.findElement(SaveButton).click();
        driver.findElement(clickCheck).click();
    }

    public void save() {

        driver.findElement(ButtonSave).click();
        driver.findElement(confirm);
    }
}