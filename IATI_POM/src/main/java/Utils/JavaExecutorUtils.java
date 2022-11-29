package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaExecutorUtils {
    private WebDriver driver;
    private By scrollelement=By.xpath("(//input[@class=\"form__input\"])[4]");
    private By signupscroll=By.xpath("//span[@class=\"text-sm font-bold text-bluecoral\"]");
    private By pubscroll=By.xpath("//span[@class=\"text-xl font-bold text-n-50 sm:text-2xl\"]");
    private By activity=By.xpath("(//p[@class=\"form-group-title\"])[2]");
    public JavaExecutorUtils(WebDriver driver){
        this.driver=driver;

    }

    public  void scroll(By locator){
       // WebElement tableElement= driver.findElement(scrollelement);
        //using visibility of element in webpage
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,locator);

    }
    public void scrollSignup(){
        WebElement sign=driver.findElement(signupscroll);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,sign);

    }
    public void scrolladmin(){
        WebElement pub=driver.findElement(pubscroll);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,pub);
    }
    public void scrollactivity(){
        WebElement ac=driver.findElement(activity);
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,ac);

    }
}
