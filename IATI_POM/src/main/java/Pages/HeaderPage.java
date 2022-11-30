package Pages;

import Utils.ActionUtils;
import Utils.ElementUtils;
import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HeaderPage {
    private WebDriver driver;
    private WaitUtils wait;
    private ActionUtils actionutils;
    private By  about=By.xpath("(//li[@class=\"nav__links active dropdown\"])[1]");
    private By publishingcheck=By.xpath("(//li[@class=\"nav__links active dropdown\"])[2]");
    private By iati=By.xpath("//li[@class=\"nav__links active dropdown relative\"]");
    private By support=By.xpath("(//li[@class=\"nav__links active dropdown\"])[3]");
   // private By  nav=By.xpath("//ul[@id=\"nav-list\"]");
    private ElementUtils elementutils;
    private By learnmore=By.xpath("//a[@class=\"read__more\"]");
    private By heading=By.xpath("//h1[contains(@class,\"text-xl font-bold\")]");

    public HeaderPage(WebDriver driver){
        this.driver=driver;
        wait=new WaitUtils(driver);
        elementutils=new ElementUtils(driver);
        actionutils=new ActionUtils(driver);

    }
     public void hoveroverelment() {
         actionutils.movingtoelement(about);
         actionutils.movingtoelement(publishingcheck);
         actionutils.movingtoelement(iati);
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         actionutils.movingtoelement(support);
    }

    public void publishingchecklist(){

        actionutils.movingtoelement(publishingcheck);
        wait.presenceOfElement(publishingcheck,20);
        actionutils.movingtoelement(learnmore);
    }
    public void about(){

        actionutils.movingtoelement(about);
        wait.presenceOfElement(about,20);
        actionutils.movingtoelement(learnmore);
    }
    public void iati(){

        actionutils.movingtoelement(iati);
        wait.presenceOfElement(iati,20);
        actionutils.movingtoelement(learnmore);
    }
    public void support(){

        actionutils.movingtoelement(support);
        wait.presenceOfElement(support,20);
        actionutils.movingtoelement(learnmore);
    }



    public String gettext(){
        return elementutils.gettitle(heading);
    }

}
