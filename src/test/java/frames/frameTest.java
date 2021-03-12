package frames;

import org.testng.annotations.Test;
import base.baseTest;

import static org.testng.Assert.assertEquals;

public class frameTest extends baseTest {
    @Test
    public void testWysiwyg(){
      var editorPage = homePage.clickwysiwygEditor();
      editorPage.clearTextArear();

      String text1 = "Hello";
      String text2 = "World";

      editorPage.setTextArear(text1);
      editorPage.increaseIndention();
      editorPage.setTextArear(text2);

      assertEquals(editorPage.getTextFromEditor(),text1 + text2,"Check Your Code");
    }

}
