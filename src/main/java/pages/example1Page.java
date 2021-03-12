package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class example1Page {
    private WebDriver driver;
    private By StartButton = By.xpath("//button[contains (text (), 'Start')]");
    private By loadingIndicator = By.id("loading");
    private By loadingText = By.id("finish");

    public example1Page(WebDriver driver){
        this.driver = driver;
    }
    public void clickStartButton(){
        driver.findElement(StartButton).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));


        //This is Fluent Wait:
        /**
        FluentWait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fWait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));**/

    }

    public String getLoadingText(){
        return driver.findElement(loadingText).getText();
    }
}
