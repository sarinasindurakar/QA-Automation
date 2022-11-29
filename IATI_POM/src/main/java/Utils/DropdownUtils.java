package Utils;

import io.netty.util.internal.ThreadLocalRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownUtils {
    private WebDriver driver;
    WebElement drop;
    public  DropdownUtils(WebDriver driver){
        this.driver=driver;
    }
    public void findropdown(By locator){
        drop= driver.findElement(locator);
        drop.click();

    }
    public void selectDropdown(By locator){
        List<WebElement> itemsinType = driver
                .findElements(locator);
        int size = itemsinType.size();
        int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
        // Selecting random value
        itemsinType.get(randnMumber).click();
    }
}
