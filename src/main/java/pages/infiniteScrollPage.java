package pages;

import com.sun.source.tree.WhileLoopTree;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class infiniteScrollPage {
    private WebDriver driver;
    private By textBlock = By.className("jscroll-added");

    public infiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }
    /**
     * Scrolls until paragraph with index specified is in view
     * @param index 1-based
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while (getNumberOfParagraphsPresent()<index){
            jsExecutor.executeScript(script);

        }

    }

    private int getNumberOfParagraphsPresent(){
        return driver.findElements(textBlock).size();
    }
}
