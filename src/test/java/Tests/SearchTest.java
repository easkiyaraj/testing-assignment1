package Tests;

import PageObject.Search;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        wait.until(ExpectedConditions.urlContains("iphone"));
        driver.quit();



//        Assert.assertTrue(driver.getCurrentUrl().contains("Tablets"),"URL MISSMATCH");
    }
    @Test
    public void searchTesting2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        Search search = new Search(driver);
        search.fillProductname("iphone");
        search.fillSearch();
        search.fillProductname1("Tablet");
        search.fillSearch1();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        wait.until(ExpectedConditions.urlContains("iphone"));
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://ecommerce-playground.lambdatest.io/index.php?route=product/search&search=iphone&category_id=57",
                "Url Missmatch");
        driver.quit();
    }
    @Test
    public void searchTesting3(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        Search search = new Search(driver);
        search.fillProductname("xyz12345ds");
        search.fillSearch();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://ecommerce-playground.lambdatest.io/index.php?route=product%2Fsearch&search=xyz12345ds",
                "Url Missmatch");
        TakesScreenshot screenshort = (TakesScreenshot) driver;
        File screenshortfile = screenshort.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("xyz12345ds.png");
        try {
            FileUtils.copyFile(screenshortfile, destinationfile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    @Test
    public void searchTesting4(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        Search search = new Search(driver);
        search.fillProductname("imac");
        search.fillSearch();

        TakesScreenshot screenshort = (TakesScreenshot) driver;
        File screenshortfile = screenshort.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("imac.png");
        try {
            FileUtils.copyFile(screenshortfile, destinationfile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://ecommerce-playground.lambdatest.io/index.php?route=product%2Fsearch&search=imac",
                "Url Missmatch");
    }
}
