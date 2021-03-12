package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;

    public homePage(WebDriver driver){
        this.driver = driver;

    }

    public loginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new loginPage(driver);

    }

    public dropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new dropDownPage(driver);
    }

    public hoversPage clickHovers(){
        clickLink("Hovers");
        return new hoversPage(driver);
    }

    public keyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new keyPressesPage(driver);
    }

    public alertsPage clickJavaScriptAlert(){
        clickLink("JavaScript Alerts");
        return new alertsPage(driver);
    }
    public alertConfirmPage clickJavaScriptConfirm(){
        clickLink("JavaScript Alerts");
        return new alertConfirmPage(driver);
    }
    public sendTextAlertPage clickJavaScriptPrompt(){
        clickLink("JavaScript Alerts");
        return new sendTextAlertPage(driver);
    }

    public fileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new fileUploadPage(driver);
    }

    public wysiwygEditorPage clickwysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new wysiwygEditorPage(driver);
    }

    public dynamicLoadingPage clickDinamicLoading(){
        clickLink("Dynamic Loading");
        return new dynamicLoadingPage(driver);
    }

    public largeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new largeAndDeepDomPage(driver);
    }

    public infiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new infiniteScrollPage(driver);
    }

    public multipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new multipleWindowsPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
