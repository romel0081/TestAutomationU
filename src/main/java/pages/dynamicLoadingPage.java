package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicLoadingPage {
    private WebDriver driver;

    private By example_1 = By.xpath("//a[contains (text (), 'Example 1:')]");

    public dynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public example1Page clickExample1(){
        driver.findElement(example_1).click();

        return new example1Page(driver);
    }


}
