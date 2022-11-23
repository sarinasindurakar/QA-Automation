package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DashBoardPage {
    private WebDriver driver;
    private By profiledropdown=By.xpath("//button[@class=\"button secondary-btn dropdown-btn\"]");
    private By profilename=By.xpath("//span[@class=\"text-tiny text-n-40\"]");
    private By logoutbutton=By.xpath("//button[@class=\"text-sm\"]");
    private By addactivitybutton=By.xpath("//span[text()=\"Add Activity\"]");
    private By addmanuallybutton=By.xpath("(//a[@class=\"block p-2.5 text-n-40 text-tiny leading-[1.5] font-bold hover:text-n-50 hover:bg-n-10\"])[1]");
    public DashBoardPage(WebDriver driver){
        this.driver=driver;
    }
    public  void clickprofiledropdown(){
        driver.findElement(profiledropdown).click();

    }
    public String getusername(){
        String text= driver.findElement(profilename).getText();
        text.equalsIgnoreCase(text);
        System.out.println(text);
        return text;
    }
    public void addactivity(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(addactivitybutton).click();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      //  driver.findElement(addmanuallybutton).click();
    }
    public void setAddmanuallybutton(){


        driver.findElement(addmanuallybutton).click();
    }

    public void logout(){

        driver.findElement(logoutbutton).click();


    }
}
