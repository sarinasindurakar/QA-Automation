package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
    private WebDriver driver;
   // private By locator=By.xpath("(//li[@class=\"nav__links active dropdown\"])[1]");

    public ElementUtils(WebDriver driver){
        this.driver=driver;

    }
    public WebElement getelement(By locator){
        WebElement aa=driver.findElement(locator);
       return aa;
    }
    public String gettitle(By locator){
        return driver.findElement(locator).getText();
    }
}
