package homework;

import core.Calculator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tests {
    @Test
    public void firstBrowser() throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();
        wd.get("https://twitter.com/login");
        wd.manage().window().maximize();
        //wait for 5 sec
        wd.quit();

    }

    @Test
    public void titleVerification() {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.baruch.cuny.edu/");
        wd.manage().window().maximize();

        String expectedTitle = "Baruch College - The City University of New York (CUNY)";
        String actualTitle = wd.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
        wd.quit();



    }

//    @Test
//    public void Verification() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver wd = new ChromeDriver();
//        wd.get("https://www.yahoo.com/");
//        wd.manage().window().maximize();
//        wd.quit();
//
//    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        Assert.assertEquals(15, c.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        Assert.assertEquals(5, c.divide(6, 36));
    }

    @Test
    public void sourceVerification() {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.hamropatro.com/");
        wd.manage().window().maximize();

        String expectedTittle = "Nepali Calendar 2077 | हाम्रो नेपाली पात्रो २०७७ | Hamro Nepali Patro";
        String actualTittle = wd.getTitle();
        System.out.println(actualTittle);

        Assert.assertEquals(expectedTittle, actualTittle);
        wd.quit();
    }

}