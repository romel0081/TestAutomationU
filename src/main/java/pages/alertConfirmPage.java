package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alertConfirmPage {
    private WebDriver driver;
    private By triggerJsConfirmButton = By.xpath("//button[text() = 'Click for JS Confirm']");
    private By confirmResult = By.id("result");

    public alertConfirmPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlertConfirm(){
        driver.findElement(triggerJsConfirmButton).click();
    }
    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getResult(){
        return driver.findElement(confirmResult).getText();
    }

}
