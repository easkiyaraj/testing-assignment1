package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Myntra {
    WebDriver ldriver;
    private static final By MEN = By.xpath("//a[@class='desktop-main'][normalize-space()='Men']");
    private static final By MENCOLLECTION = By.xpath("//div[@id='mountRoot']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//picture[1]//img[1]");

    public Myntra(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void fillMen(){
       ldriver.findElement(MEN).isEnabled();
        ldriver.findElement(MEN).click();
    }
    public void fillMencollection(){
        ldriver.findElement(MENCOLLECTION).click();
    }
}
