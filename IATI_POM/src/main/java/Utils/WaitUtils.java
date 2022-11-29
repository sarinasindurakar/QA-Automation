package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitUtils {

    private WebDriverWait wait;

    private WebDriver driver;

    public WaitUtils(WebDriver driver){
        this.driver=driver;
    }
    public WebElement presenceOfElement(By locator, long waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public List<WebElement> presenceOfElements(By locator, long waitTime) {
       wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

}
