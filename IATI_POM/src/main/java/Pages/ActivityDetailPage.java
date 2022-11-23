package Pages;

import io.netty.util.internal.ThreadLocalRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ActivityDetailPage {
    private WebDriver driver;
    private WebElement statusdropdown;
    private By activitystatuspage = By.xpath("//div[.=\"activity-status\"]");
    private By activitystatusdropdown = By.xpath("//span[@class=\"select2-selection__arrow\"]");
    private By activitystatustext = By.xpath("//div[.=\" activity-status \"]");
    private By savebutton=By.xpath("//button[@class=\"primary-btn save-btn\"]");
    private By activitystatyus_done=By.xpath("(//div[.=\"activity-status\"])[2]");
    private By  youractivities=By.xpath(" //a[.=\" Your Activities \"]");
    private By dashboardheading=By.xpath("//h4[.=\" Your Activities \"]");

    public ActivityDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickactivitystatus() {
        driver.findElement(activitystatuspage).click();
    }

    public String activitystatus() {
        return driver.findElement(activitystatustext).getText();
    }

    public void findactivitystatusddropdown() {
        statusdropdown = driver.findElement(activitystatusdropdown);

    }

    public void selectfromactivitystatusDropdown() {
        // List<WebElement> itemsInDropdown = driver
        //   .findElements(By.xpath("//span[@class=\"select2-results\"]/ul/li"));
        // int size = itemsInDropdown.size();
         for (int i = 0; i <6; i++) {
            statusdropdown.click();
            List<WebElement> itemsInDropdown = driver
                    .findElements(By.xpath("//span[@class=\"select2-results\"]/ul/li"));
            int size = itemsInDropdown.size();
            int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
            // Selecting random value
            itemsInDropdown.get(randnMumber).click();

        }

    }
    public void  clicksave(){
        driver.findElement(savebutton).click();
    }
    public Boolean getactivitystatus(){
        return driver.findElement(activitystatyus_done).isDisplayed();
    }
    //youractivities
    public void clickyouractivites(){
        driver.findElement(youractivities).click();
    }
    public String getheading(){
        return driver.findElement(dashboardheading).getText();
    }

    }


