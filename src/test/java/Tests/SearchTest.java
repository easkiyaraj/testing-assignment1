package Tests;

import PageObject.Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

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

//        Search search = new Search(driver);
//        search.fillProductname("Tablets");
//        search.fillSearch();

        Assert.assertTrue(driver.getCurrentUrl().contains("Tablets"),"URL MISSMATCH");
    }
}
