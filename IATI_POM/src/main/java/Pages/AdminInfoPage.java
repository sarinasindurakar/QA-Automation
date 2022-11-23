package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminInfoPage {
    public WebDriver driver;
    private By usernamefield=By.id("username");
    private By fullnamefield =By.id("full-name");
    private By Email=By.id("email");
    private By passwordfield=By.id("password");
    private By confirmpwd=By.id("password-confirmation");
    private By nextstep_2=By.xpath("//button[@class=\"btn btn-next\"]");
    public AdminInfoPage(WebDriver driver){
        this.driver=driver;
    }
    public void setform(String name,String user,String email,String pwd,String cpwd){
        driver.findElement(usernamefield).sendKeys(user);
        driver.findElement(fullnamefield).sendKeys(name);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(passwordfield).sendKeys(pwd);
        driver.findElement(confirmpwd).sendKeys(cpwd);


    }
    public void clickbutton(){
        driver.findElement(nextstep_2).click();
    }


}
