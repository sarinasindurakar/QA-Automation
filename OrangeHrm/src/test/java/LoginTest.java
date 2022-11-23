import Orange.Utils.WaitUtils;
import Orange.pages.DashboardPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{
    //private WebDriver driver;
    @Test
    public void testsucessfulLogin()  {


        loginPage.setUsernameField("Admin");
        loginPage.setPasswordField("admin123");

        DashboardPage dpage=loginPage.clickLoginButoon();
        dpage.text();
        assertTrue(dpage.text().contains("Time at Work"),"The text is incorrect");
    }



}
