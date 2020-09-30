package classwork;

import core.Calculator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {


    @Test
    public void firstBrowser() throws InterruptedException {
        //Set Chrome Browser Driver
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //create ChromeDriver instance
        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();
        //ChromeDriver wd= new ChromeDriver();
        //Open Browser

        wd.get("http://www.gmail.com");
        //Maximize Browser
        wd.manage().window().maximize();
        //wait for 5 sec
        wd.quit();

    }

    @Test
    public void Browser() throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();

        wd.get("http://www.facebook.com");
        wd.manage().window().maximize();
        wd.quit();

    }

    @Test
    public void titleVerification()  {
        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();
        wd.get("http://automationpractice.itsutra.com/");
        wd.manage().window().maximize();
        wd.quit();

        String expectedTitle="Home Page - Contoso University";
        String actualTitle=wd.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(expectedTitle,actualTitle);


    }

}