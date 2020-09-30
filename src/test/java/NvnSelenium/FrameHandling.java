package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.freecrm.com/");
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();

        driver.findElement(By.name("email")).sendKeys("lkamala3@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Kamalalama123");

        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(4000);
       // driver.findElement(By.xpath("//span[contains(@class,'item-text')]")).click();//there is no This Frame
    }
}
