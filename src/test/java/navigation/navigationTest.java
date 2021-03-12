package navigation;

import base.baseTest;
import org.testng.annotations.Test;

public class navigationTest extends baseTest {

    @Test
    public void testNavigator(){
        homePage.clickDinamicLoading().clickExample1();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goBack();
        getWindowManager().goTo("https://www.google.com/");

    }
    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
