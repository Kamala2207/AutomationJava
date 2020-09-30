package NvnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigations {
//Navigation or Simulation is same thing, it is done between Webbrowsers

    public static void main(String[] args) throws InterruptedException {

    //get() vs navigate().to
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        //Transition from google to amazon
        driver.navigate().to("http://www.amazon.com");//used to launch external URL


        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();//back and forward simulation
        Thread.sleep(2000);
        driver.navigate().back();

        driver.navigate().refresh();//to refresh page



    }
}
