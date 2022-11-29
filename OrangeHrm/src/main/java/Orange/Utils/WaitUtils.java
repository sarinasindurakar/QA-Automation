package Orange.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    private WebDriver driver;
   private WebDriverWait wait;


    public WaitUtils(WebDriver driver) {
        this.driver = driver;
    }


    public  WebElement presenceOfElement(By locator,long waitTime) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
