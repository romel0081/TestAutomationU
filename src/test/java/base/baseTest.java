package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.homePage;
import utils.eventReporter;
import utils.windowManager;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class baseTest {
    private EventFiringWebDriver driver;
    protected homePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");

        driver = new EventFiringWebDriver(new FirefoxDriver());
        driver.register(new eventReporter());

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(375,812));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());

        homePage = new homePage(driver);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

//    @AfterMethod
//    public void recordFailure(ITestResult result){
//        if (ITestResult.FAILURE == result.getStatus()){
//            var camera = (TakesScreenshot)driver;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try{
//                Files.move(screenshot,new File("driver/screenshots/"+ result.getName() +".png"));
//            }catch (IOException e){
//                e.printStackTrace();
//        }
//
//       }
//    }
    @AfterMethod
    public void takeScreenshot(){
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try{
            Files.move(screenshot,new File("driver/screenshots/test.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public windowManager getWindowManager(){
        return new windowManager(driver);
    }
}




