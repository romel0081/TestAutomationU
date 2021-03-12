package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text() = 'Click for JS Alert']");
    private By results = By.id("result");

    public alertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getResults(){
       return driver.findElement(results).getText();
    }
}
