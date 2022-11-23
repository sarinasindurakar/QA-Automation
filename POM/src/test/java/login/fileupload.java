package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class fileupload {
    @Test
    public void fileupload() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.monsterindia.com/");
        driver.findElement(By.xpath("//a[contains(@class,'btn block resume-btn btn-orange mt20')]")).click();

        WebElement button= driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",button);

        //button.click();
        //.sendKeys("F:\\\\Academics/EC2.pdf\"");
        /*
        1.Copy path
        CTRL+V
        ENTER
        */

        Robot rb=new Robot();
        rb.delay(2000);

        //put the path to the file in clipboard
        StringSelection ss=new StringSelection("F:\\Academics\\EC2.pdf");//puting
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        //Ctrl+V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(2000);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(2000);

        //ENTER
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        rb.delay(2000);


    }
}
