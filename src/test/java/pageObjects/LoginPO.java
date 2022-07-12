package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPO {
    public WebDriver driver;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameBox = By.xpath("//input[@id='txtUsername']");
    private By passwordBox = By.id("txtPassword");
    private By loginButton = By.xpath("//input[@id='btnLogin']");

    public void getURL() {
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }

    public void setUserName() {
        driver.findElement(usernameBox).sendKeys("Admin");
    }

    public void setPassword() {
        driver.findElement(passwordBox).sendKeys("admin123");
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void confirmLogin() {
        driver.findElement(loginButton);
    }

    public String getTitle() {
        return driver.getTitle();
    }

}