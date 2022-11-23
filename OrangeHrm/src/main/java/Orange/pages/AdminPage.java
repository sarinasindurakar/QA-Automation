package Orange.pages;

import Orange.Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AdminPage {
    private WebDriver driver;
    private WaitUtils waitUtils;

    private By admin_username=By.xpath("(//input[contains(@class,\"oxd-input oxd-input\")])[2]");
    private By  user_dropdownField=By.xpath("(//i[contains(@class,\"oxd-icon bi-caret-down-fill\")])[2]");
    private  By locator=By.xpath("//h5[contains(@class,\"oxd-text oxd-text--h5\")]");
    private By user_dropdownelement=By.xpath("(//div[@class=\"oxd-select-option\"])[2]");
    private By status_dropdownField=By.xpath("(//i[contains(@class,\"oxd-icon bi-caret-down-fill\")])[3]");
    private By status_dropdownElement=By.xpath("(//div[@class=\"oxd-select-option\"])[2]");
    private By employeename=By.xpath("//input[@placeholder=\"Type for hints...\"]");
    private By serachButton=By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium ')])[2]");
    public AdminPage(WebDriver driver) {
        this.driver = driver;
        waitUtils=new WaitUtils(driver);


    }

    public void setAdmin_username(String username) {
         waitUtils.presenceOfElement(locator,10);


        driver.findElement(admin_username).sendKeys(username);
    }

    public void clickdropdown(){
        driver.findElement(user_dropdownField).click();

    }
    public void selectdropdownelement(){
        driver.findElement(user_dropdownelement).click();

    }
    public void setStatus_dropdownField(){
        driver.findElement(status_dropdownField).click();
        driver.findElement(status_dropdownElement).click();
    }
    public void setEmployeename() throws InterruptedException {
        WebElement drop = driver.findElement(employeename);
        drop.sendKeys("Paul Collings");
        Thread.sleep(5000);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"oxd-autocomplete-option\"]"));
        Thread.sleep(3000);
        int c = elements.size();
        System.out.println(c);
        Thread.sleep(3000);
        for (WebElement b : elements) {
            String element = b.getText();
            System.out.print(element);
            if (element.equals("Aaliyah Haq")) {
                b.click();
            }
            /*
        Actions action=new Actions(driver);
        action.sendKeys(drop, Keys.ARROW_DOWN).build().perform();
        Thread.sleep(3000);
        /*
        WebElement ele= driver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-option\"]"));
        Thread.sleep(3000);
       ele.click();
       */

        }
    }
            public void clicksearchButton () {

        driver.findElement(serachButton).click();
            }


        }






