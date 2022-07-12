package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AssignLeavePO {
    WebDriver driver;

    public AssignLeavePO(WebDriver driver) {
        this.driver = driver;
    }

    private By menuLeaveModule = By.id("menu_leave_viewLeaveModule");
    private By assignLeave = By.id("menu_leave_assignLeave");
    private By employeeName = By.id("assignleave_txtEmployee_empName");
    private By selectEmployee = By.xpath("//body/div[6]/ul[1]/li[1]");
    private By leveDropdown = By.id("assignleave_txtLeaveType");
    private By fromDate = By.id("assignleave_txtFromDate");
    private By currentDate = By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a");
    private By comment = By.id("assignleave_txtComment");
    private By assignButton = By.id("assignBtn");
    private By confirmButton = By.id("confirmOkButton");

    public void clickLeaveTab() {
        driver.findElement(menuLeaveModule).click();
    }

    public void clickAssignLeaveTab() {
        driver.findElement(assignLeave).click();
    }

    public void typeEmpName() {
        driver.findElement(employeeName).sendKeys("a");
    }

    public void selectEmp() {
        driver.findElement(selectEmployee).click();
    }

    public void selectLeaveDropdown() {
        WebElement leaveDropDown = driver.findElement(leveDropdown);
        Select dropdown = new Select(leaveDropDown);
        dropdown.selectByIndex(2);
    }

    public void clickFromDate() {
        driver.findElement(fromDate).click();
        driver.findElement(currentDate).click();
    }

    public void comment() {
        driver.findElement(comment).sendKeys("Medical Leave");
    }

    public void confirm() {
        WebElement waitCountry = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("assignBtn"))));
        driver.findElement(assignButton).click();
        driver.findElement(confirmButton).click();
    }

}