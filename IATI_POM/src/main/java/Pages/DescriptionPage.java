package Pages;

import Utils.DropdownUtils;
import Utils.JavaExecutorUtils;
import io.netty.util.internal.ThreadLocalRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DescriptionPage {
    private WebDriver driver;
    private JavaExecutorUtils jsexecutor;
    private DropdownUtils dropdown;
    private By  locator=By.xpath("//label[text()='language']");
    private By  descriptiontitle=By.xpath("//div[@class=\"text-sm font-bold title\"]");
    private By typedropdown=By.xpath("(//span[@class=\"select2-selection__arrow\"])[1]");
    private By drop_option=By.xpath("//span[@class=\"select2-results\"]/ul/li");
    private By narrative=By.xpath("//textarea[@class=\"form__input border-0\"]");
    private By languagedropdown= By.xpath("(//span[@class=\"select2-selection__arrow\"])[2]");
    private By descriptionheading=By.xpath("(//div[.=\"description\"])[2]");
    public DescriptionPage(WebDriver driver){

        this.driver=driver;
        dropdown=new DropdownUtils(driver);
        jsexecutor=new JavaExecutorUtils(driver);

    }
    public String getdescriptiontitle(){
        return driver.findElement(descriptiontitle).getText();
    }
    public void type(){
        //jsexecutor.scroll(locator);
        dropdown.findropdown(typedropdown);
        //jsexecutor.scroll(locator);
        dropdown.selectDropdown(drop_option);

        /*
        WebElement types=driver.findElement(typedropdown);
        types.click();
        List<WebElement> itemsinType = driver
                .findElements(By.xpath("//span[@class=\"select2-results\"]/ul/li"));
        int size = itemsinType.size();
        int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
        // Selecting random value
        itemsinType.get(randnMumber).click();

         */

    }
    public void setnarrative( String type_narr){
        driver.findElement(narrative).sendKeys(type_narr);
    }
    public void setlanguage(){

        WebElement languages=driver.findElement(languagedropdown);
        languages.click();
        List<WebElement> itemsinLanguage = driver
                .findElements(By.xpath("//span[@class=\"select2-results\"]/ul/li"));
        int size = itemsinLanguage.size();
        int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
        // Selecting random value
        itemsinLanguage.get(randnMumber).click();

    }
    public boolean descriptiondisplayed(){
        return driver.findElement(descriptionheading).isDisplayed();
    }
}
