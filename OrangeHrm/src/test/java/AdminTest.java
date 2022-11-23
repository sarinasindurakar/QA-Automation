import Orange.pages.AdminPage;
import Orange.pages.DashboardPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class AdminTest extends BaseTest{
    private WebDriver driver;

    @Test
    public void testadmin() throws InterruptedException {
        loginPage.setUsernameField("Admin");
        loginPage.setPasswordField("admin123");

        DashboardPage dpage=loginPage.clickLoginButoon();
        Thread.sleep(3000);
        AdminPage adminPage=loginPage.clickAdmin();
        adminPage.setAdmin_username("Admin");
        Thread.sleep(1000);
        adminPage.clickdropdown();
        Thread.sleep(3000);
        adminPage.selectdropdownelement();
        Thread.sleep(3000);
        adminPage.setStatus_dropdownField();
        Thread.sleep(3000);
        adminPage.setEmployeename();
        Thread.sleep(3000);
        adminPage.clicksearchButton();
        Thread.sleep(3000);
    }
}
