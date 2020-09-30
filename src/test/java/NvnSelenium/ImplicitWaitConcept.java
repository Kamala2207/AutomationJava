package NvnSelenium;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitConcept {

    public static void main(String[]args){
 //Implicit wait is dynamic
 //Thread.sleep these are static

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("URL  ");

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//it gives time to load the page fully
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//it gives all the elements of that page to load fully


    }
}
