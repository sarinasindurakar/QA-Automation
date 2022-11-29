package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HeaderPage {
    private WebDriver driver;
    private By  about=By.xpath("//*[@id=\"nav-list\"]/li[1]");

    public HeaderPage(WebDriver driver){
        this.driver=driver;
    }
     public void AboutUs(){
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(about).click();

    }

}
