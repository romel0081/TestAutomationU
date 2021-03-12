package javaScript;

import base.baseTest;
import org.testng.annotations.Test;

public class infiniteScrollTest extends baseTest {
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
