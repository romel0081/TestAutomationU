package wait;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class waitTest extends baseTest {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDinamicLoading().clickExample1();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadingText(),"Hello World!","Check your code");
    }
}
