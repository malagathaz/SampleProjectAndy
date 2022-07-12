package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddQualificationPO {

    WebDriver driver;

    public AddQualificationPO(WebDriver driver) {
        this.driver = driver;
    }

    private By viewAdminModule = By.id("menu_admin_viewAdminModule");
    private By Qualifications = By.id("menu_admin_Qualifications");
    private By viewSkills = By.id("menu_admin_viewSkills");
    private By btnAdd = By.id("btnAdd");
    private By skillName = By.name("skill[name]");
    private By skillDescription = By.name("skill[description]");
    private By btnSave = By.id("btnSave");
    private By confirmation = By.id("successBodyEdit");

    public void firstClicks() {
        driver.findElement(viewAdminModule).click();
    }

    public void secondClicks() {
        driver.findElement(Qualifications).click();
        driver.findElement(viewSkills).click();
        driver.findElement(btnAdd).click();
    }

    public void skillName() {
        driver.findElement(skillName).sendKeys("C");
    }

    public void skillDescription() {
        driver.findElement(skillDescription).sendKeys("Programming language");
    }

    public void saveClick() {
        driver.findElement(btnSave).click();
    }

    public void confirmation() {
        driver.findElement(confirmation);
    }

}