package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    WebDriver ldriver;
    private static final By PRODUCTNAME = By.xpath("//input[@placeholder='Search For Products']");
    private static final By SEARCH = By.xpath("//button[normalize-space()='Search']");

    public Search(WebDriver rdriver) {
        ldriver = rdriver;
    }


    public void fillProductname(String productname){
        ldriver.findElement(PRODUCTNAME).sendKeys(productname);
    }
    public void fillSearch(){
        ldriver.findElement(SEARCH).click();
    }

}
