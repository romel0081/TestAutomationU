package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sendTextAlertPage {
    private WebDriver driver;
    private By triggerJsPromptButton = By.xpath("//button[text() = 'Click for JS Prompt']");
    private By promptResult = By.id("result");

    public  sendTextAlertPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerJsPrompt(){
        driver.findElement(triggerJsPromptButton).click();
    }
    public void sendText(){
        driver.switchTo().alert().sendKeys("Hi How Are You?");

    }
    public void acceptTest(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(promptResult).getText();
    }
}
