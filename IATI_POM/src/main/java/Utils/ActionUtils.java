package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {
    private WebDriver driver;
    private Actions action;
    private ElementUtils elementutils;
    private WebElement header;
    public ActionUtils(WebDriver driver){
        this.driver=driver;
        elementutils=new ElementUtils(driver);
        action=new Actions(driver);
    }
    public void movingtoelement(By locator){
       action.moveToElement(elementutils.getelement(locator)).click().perform();
    }
    public void movingtoelement(By locator1, By locator2){
        action.moveToElement(elementutils.getelement(locator1)).perform();
        elementutils.getelement(locator2).click();
    }

}
