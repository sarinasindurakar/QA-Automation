package Pages;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private WaitUtils wait;
    private By usernamefield=By.id("username");
    private By passwordfield=By.id("password");
    private By buttonField=By.xpath("//button[@id=\"btn\"]");
    private By signup=By.xpath("//button[text()=\"Join Now\"]");

    public LoginPage( WebDriver driver){
        this.driver=driver;
        // wait=new WaitUtils(driver);

    }
    public void setUsername(String username){
        driver.findElement(usernamefield).sendKeys(username);

    }
    public void setPassword(String password)
    {
        driver.findElement(passwordfield).sendKeys(password);
    }
    public DashBoardPage clickloginbutton(){
       // wait.presenceOfElements()
        driver.findElement(buttonField).click();
        return new DashBoardPage(driver);

    }
    public SignupPage clicksignupbutton(){
        driver.findElement(signup).click();
        return new SignupPage(driver);
    }


}
