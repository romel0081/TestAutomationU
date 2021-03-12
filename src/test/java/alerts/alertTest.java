package alerts;

import base.baseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class alertTest extends baseTest {

    @Test
    public void testAcceptAlert(){
      var alertsPage =  homePage.clickJavaScriptAlert();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
       assertEquals (alertsPage.getResults(),"You successfuly clicked an alert","Check Alert function Again");
    }

}
