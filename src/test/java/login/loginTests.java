package login;

import base.baseTest;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.secureAreaPage;

import static org.testng.Assert.assertEquals;

public class loginTests extends baseTest {
    @Test
    public void testSuccessfulLogin(){
        loginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        secureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertEquals(secureAreaPage.getAlertText(),
                "You logged into a secure area!\n" +
                        "×",
                "Check Username or Password");

    }
}
