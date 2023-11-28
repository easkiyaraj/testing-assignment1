package Tests;

import PageObject.Amazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonTesting {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_" +
                "e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=" +
                "13863139423992258216&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-" +
                "10573980&hydadcr=14453_2371562&gclid=EAIaIQobChMItL_Pn-zgggMVnQqDAx3iFglXEAAYASAAEgINWfD_BwE");

        Amazon search = new Amazon(driver);
        search.fillSearchname("iphone");
        search.fillSearch();
        search.fillSuggestion();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?crid=PUWSUMZ9C8SE&keywords=iphone&qid=1700980776&sprefix=%2Caps%2C289&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1",
                "product missmatch");
    }
}
