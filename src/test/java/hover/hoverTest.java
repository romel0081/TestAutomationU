package hover;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class hoverTest extends baseTest {

    @Test
    public void testHoverUser1(){
       var hoversPage = homePage.clickHovers();
       var caption = hoversPage.hoverOverFigure(1);
       assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
       assertEquals(caption.getTitle(),"name: user1","Caption Title incorrect");
       assertEquals(caption.getLinkText(),"View profile","Caption Link Text incorrect");
       assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");



    }
}
