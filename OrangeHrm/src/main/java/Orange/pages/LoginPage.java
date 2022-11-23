package Orange.pages;

import Orange.Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WaitUtils waitUtils;
    private WebDriver driver;
    private By usernameField=By.xpath("//input[@name=\"username\"]");
    private By passwordField=By.name("password");


    private By loginbutton=By.xpath("//button[contains(@class,'oxd-button') ]");
    private By locator=By.tagName("label");
    private By admin=By.xpath("(//a[contains(@class,\"oxd-main-menu-item\")])[1]");
    public LoginPage(WebDriver driver){

        this.driver=driver;
        waitUtils=new WaitUtils(driver);
    }
    public void setUsernameField(String username){
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      waitUtils.presenceOfElement(locator,10);

        driver.findElement(usernameField).sendKeys(username);

    }
    public void setPasswordField(String password){
        //waitUtils.presenceOfElement(locator,30);
        driver.findElement(passwordField).sendKeys(password);

    }
    public DashboardPage clickLoginButoon(){

        driver.findElement(loginbutton).click();
        return new DashboardPage(driver);

    }
    public AdminPage clickAdmin() {
        driver.findElement(admin).click();
        return new AdminPage(driver);
    }


}
