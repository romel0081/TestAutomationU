package dropdown;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dropDownTests extends baseTest {
    @Test
    public void testSelectOption(){
      var dropDownPage =  homePage.clickDropDown();
      String option = "Option 1";
      dropDownPage.selectFormDropDown(option);
      var selectedOptions = dropDownPage.getSelectedOptions();
      assertEquals(selectedOptions.size(), 1, "Incorrect Selection");
      assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
