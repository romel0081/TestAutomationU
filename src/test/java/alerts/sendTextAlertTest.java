package alerts;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class sendTextAlertTest extends baseTest {
    @Test
    public void sendTextAlert(){
       var sendTextAlertTest = homePage.clickJavaScriptPrompt();
       sendTextAlertTest.triggerJsPrompt();
       sendTextAlertTest.sendText();
       sendTextAlertTest.acceptTest();
       assertEquals(sendTextAlertTest.getResult(),"You entered: Hi How Are You?","Check you Code");
    }
}
