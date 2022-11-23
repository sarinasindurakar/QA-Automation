package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaExecutorUtils {
    private WebDriver driver;
    private By scrollelement=By.xpath("(//input[@class=\"form__input\"])[4]");
    public JavaExecutorUtils(WebDriver driver){
        this.driver=driver;

    }

    public  void scroll(){
        WebElement tableElement= driver.findElement(scrollelement);
        //using visibility of element in webpage
        String Script="arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(Script,tableElement);

    }
}
