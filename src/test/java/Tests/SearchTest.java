package Tests;

import PageObject.Search;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class SearchTest {
    @Test
    public void searchTesting1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        Search search = new Search(driver);
        search.fillProductname("iphone");
        search.fillSearch();



//        Assert.assertTrue(driver.getCurrentUrl().contains("Tablets"),"URL MISSMATCH");
    }
    @Test
    public void searchTesting2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        Search search = new Search(driver);
        search.fillProductname("Tablets");
        search.fillSearch();
    }
    @Test
    public void searchTesting3(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        Search search = new Search(driver);
        search.fillProductname("xyz12345ds");
        search.fillSearch();
    }
    @Test
    public void searchTesting4(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        Search search = new Search(driver);
        search.fillProductname("camera");
        search.fillSearch();

        TakesScreenshot screenshort = (TakesScreenshot) driver;
        File screenshortfile = screenshort.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("camera.png");
        try {
            FileUtils.copyFile(screenshortfile, destinationfile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
