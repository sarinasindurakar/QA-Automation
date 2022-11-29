package Pages;

import Utils.JavaExecutorUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SignupPage {
    private WebDriver driver;
    private JavaExecutorUtils jsexecutor;
    private By register=By.xpath("//a[@class=\"right__content mb-4\"]");
    private By  organization=By.xpath("(//div[@class=\"details mx-4 xl:px-1\"])[2]");
    private By publisherName=By.id("publisher-name");
    private  By publisherId=By.id("publisher-id");

    private By organizationumber=By.id("registration-number");
  private By dropdown=By.xpath("(//input[@class=\"multiselect-search\"])[2]");
  private By element=By.id("multiselect-option-US-EIN");
  private By nextbutton=By.xpath("//button[@class=\"btn btn-next\"]");

  private WebElement dpp;
    public  SignupPage(WebDriver driver){

        this.driver=driver;
        jsexecutor=new JavaExecutorUtils(driver);
    }
    public void clickregister() throws InterruptedException {
        jsexecutor.scrollSignup();
        driver.findElement(register).click();
        Thread.sleep(3000);
       // driver.findElement(organization).click();
    }
    public void fillPublisherform( String pn,String pid,String ON) throws InterruptedException {
        jsexecutor.scrolladmin();
        Thread.sleep(3000);

        driver.findElement(publisherName).sendKeys(pn);
        driver.findElement(publisherId).sendKeys(pid);
        driver.findElement(organizationumber).sendKeys(ON);

    }
    public void finddropdownelement(){
        //jsexecutor.scroll();
      dpp=  driver.findElement(dropdown);
      dpp.click();

    }

        public void selectFromDropDown()  {
        driver.findElement(element).click();

        }
        public AdminInfoPage clicknextstep(){
            jsexecutor.scroll(register);
        driver.findElement(nextbutton).click();
        return new AdminInfoPage(driver);
        }

    }

