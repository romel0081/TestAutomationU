package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class keyPressesPage{
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public keyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.NUMPAD7)+ "=3.14");
    }
    public String getResult(){
       return driver.findElement(resultText).getText();
    }


}
