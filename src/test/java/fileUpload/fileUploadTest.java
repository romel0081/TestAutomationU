package fileUpload;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class fileUploadTest extends baseTest {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\saam1\\webdriver_java\\driver\\geckodriver.exe");
        assertEquals(uploadPage.getUploadFiles(),"geckodriver.exe","Check Your Path");
    }

}
