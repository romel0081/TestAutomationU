package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndexButton = By.xpath("(//span[@class='tox-icon tox-tbtn__icon-wrap'])[10]");

    public wysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArear(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
       String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;

    }

    public void increaseIndention(){
        driver.findElement(increaseIndexButton).click();
    }

    public void setTextArear(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);

    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
