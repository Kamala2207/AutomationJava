import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class range {
    WebDriver wd;

    @Before
    public void setup() throws Exception {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(6000);
    }

    @Test
    public void PriceRange() throws InterruptedException {
        int target = 53;
        wd.findElement(By.xpath("//a[@title='Women']")).click();
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,1500)");

        WebElement slider = wd.findElement(By.cssSelector(".ui-slider-range.ui-widget-header.ui-corner-all"));
        Actions move = new Actions(wd);
        Thread.sleep(5000);
        int method = 2;
        if (method == 1) {
        }

        if (method == 2) {
            move.dragAndDropBy(slider, 150, 0).build().perform();
        }
        Thread.sleep(3000);
        Assert.assertEquals(wd.findElement(By.id("layered_price_range")).getText(), "$53.00 - $53.00");
    }
    @After
    public void end(){wd.quit();}


}
