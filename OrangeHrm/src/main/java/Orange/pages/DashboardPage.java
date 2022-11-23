package Orange.pages;

import Orange.Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private WaitUtils waitUtils;
    private By dashboard = By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[1]");
    private By locator=By.xpath("//h6[contains(@class,\"oxd-text oxd-text--h6\")]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
         waitUtils=new WaitUtils(driver);
    }

    public String text() {
        waitUtils.presenceOfElement(locator,30);
        return driver.findElement(dashboard).getText();
    }
}

