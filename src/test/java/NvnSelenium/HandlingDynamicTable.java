package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HandlingDynamicTable {
    //how to handle Dynamic table
 //1. using custom xpath
 //2. using parent & preceding sibling tags
 //3. no need to write for loop
 //4. no full iteration
 //5. single line statement
 //6. more dynamic
 //7. efficient & fast

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.freecrm.com/");
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();

        driver.findElement(By.name("email")).sendKeys("lkamala3@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Kamalalama123");

         driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
         Thread.sleep(4000);


    }
}
