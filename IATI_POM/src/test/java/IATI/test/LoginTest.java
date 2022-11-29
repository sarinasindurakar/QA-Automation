package IATI.test;

import Base.BaseTest;
import Pages.DashBoardPage;
import Pages.LoginPage;
import Utils.ConstantUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    public WebDriver driver;


 @BeforeTest
    public void testSucessfulLogin() throws InterruptedException {
    //objects and methods

       loginPage.setUsername("testautomate");
        loginPage.setPassword("12345678");
        loginPage.clickloginbutton();
        dashboard.clickprofiledropdown();
    }
    @Test(priority =2)
    public void validateLogin(){
        assertEquals( dashboard.getusername(), ConstantUtils.username);
    }

   // @AfterTest
    //public void testlogout(){
       // dashboard.logout();
   // }

}
