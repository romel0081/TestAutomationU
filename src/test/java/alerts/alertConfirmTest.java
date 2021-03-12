package alerts;

import base.baseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class alertConfirmTest extends baseTest {

    @Test
    public void testCancelAlert(){

    var alertConfirmPage = homePage.clickJavaScriptConfirm();
    alertConfirmPage.triggerAlertConfirm();
    alertConfirmPage.cancelAlert();
    assertEquals(alertConfirmPage.getResult(),"You clicked: Cancel","Check your code");

}
}
