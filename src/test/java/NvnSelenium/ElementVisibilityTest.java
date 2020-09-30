package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ElementVisibilityTest {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

    //1. isDisplayed() method: applicable for all the elements
        boolean b1 = driver.findElement(By.id("u_0_2")).isDisplayed();
        System.out.println(b1);//true

     //2. isEnabled() method://good example will be click i agree check box
     boolean b2 = driver.findElement(By.id("u_0_2")).isEnabled();
        System.out.println(b2);


    }
}
