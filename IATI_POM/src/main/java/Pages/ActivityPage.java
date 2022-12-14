package Pages;

import Utils.JavaExecutorUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    private WebDriver driver;
    private JavaExecutorUtils jsexecutor;
    private By narrative=By.xpath("(//input[@class=\"form__input\"])[1]");
    private By activityidentifier=By.xpath("//input[starts-with(@placeholder,'Type activity-identifier here')]");
    private By savebutton=By.xpath("//span[text()=\"Save\"]");
    private By title=By.xpath("(//div[.=\"title\"])[2]");
    private By activitystatus=By.xpath("//div[.=\"activity-status\"]");
    private By descriptiontab=By.xpath("//div[.=\"description\"]");

    public ActivityPage(WebDriver driver){

        this.driver=driver;
        jsexecutor=new JavaExecutorUtils(driver);
    }
    public void setNarrative( String narr){

        driver.findElement(narrative).sendKeys(narr);
    }
    public void setActivityidentifier(String number)
    {

        driver.findElement(activityidentifier).sendKeys(number);
    }
    public ActivityDetailPage clicksavebutton(){
        jsexecutor.scrollactivity();
        driver.findElement(savebutton).click();
        return new ActivityDetailPage(driver);

    }
    public DescriptionPage clickdescription(){
        driver.findElement(descriptiontab).click();
        return new DescriptionPage(driver);

    }


   // public  boolean activityname(){
     //    return driver.findElement(title).isDisplayed();
    //}



}
