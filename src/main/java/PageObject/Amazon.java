package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon {
    WebDriver ldriver;
    private static final By SEARCHNAME = By.xpath("//input[@id='twotabsearchtextbox']");
    private static final By SEARCH = By.xpath("//input[@id='nav-search-submit-button']");
    private static final By SUGGESTION = By.xpath("//img[@alt='Apple iPhone 14 (128 GB) - Midnight']");

    public Amazon(WebDriver rdriver) {
        ldriver = rdriver;
    }
    public void fillSearchname(String searchname){
        ldriver.findElement(SEARCHNAME).sendKeys(searchname);
    }
    public void fillSearch(){
        ldriver.findElement(SEARCH).click();
    }
    public void fillSuggestion(){
        ldriver.findElement(SUGGESTION).click();
    }
}
