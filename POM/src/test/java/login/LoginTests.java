package login;

import base.baseTests;
import org.example.Pages.LoginPage;
import org.example.Pages.SecureAreaPage;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class LoginTests extends baseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
