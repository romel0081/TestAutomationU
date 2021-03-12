package javaScript;

import base.baseTest;
import org.testng.annotations.Test;

public class javaScriptTest extends baseTest {

    @Test
    public void scrollToViewTest(){
        homePage.clickLargeAndDeepDom().scrollToTable();

    }
}
