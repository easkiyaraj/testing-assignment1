package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    WebDriver ldriver;
    private static final By PRODUCTNAME = By.xpath("//input[@placeholder='Search For Products']");
    private static final By SEARCH = By.xpath("//button[normalize-space()='Search']");
    private static final By PRODUCTNAME1 = By.xpath("//select[@name='category_id']");
    private  static final By SEARCH1 = By.xpath("//input[@id='button-search']");

    public Search(WebDriver rdriver) {
        ldriver = rdriver;
    }


    public void fillProductname(String productname){
        ldriver.findElement(PRODUCTNAME).sendKeys(productname);
    }
    public void fillSearch(){
        ldriver.findElement(SEARCH).click();
    }
    public void fillProductname1(String productname1){
        ldriver.findElement(PRODUCTNAME1).sendKeys(productname1);
    }
    public void fillSearch1(){
        ldriver.findElement(SEARCH1).click();
    }

}
