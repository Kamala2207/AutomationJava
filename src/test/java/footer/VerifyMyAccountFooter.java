package footer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class VerifyMyAccountFooter {
    WebDriver wd;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();

    }


    @Test
    public void VerifyFootersLists() throws InterruptedException {


//        WebElement country = wd.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/h4/a"));
//        System.out.println(country.getText());






//        var expectedFooters = new ArrayList<String>
//                (Arrays.asList("My orders", "My credit slips", "My addresses", "My personal info"));
//
//        var actualArray = new ArrayList<>();
//        var eFooters = wd.findElements(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li/a"));
//        for (var footer : eFooters) {
//            actualArray.add(footer.getText());
//
//        }
//        Assert.assertEquals(expectedFooters, actualArray);
    }
}


