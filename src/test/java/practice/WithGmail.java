package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class WithGmail {
     WebDriver driver;

    @Before
    public void setup() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(6000);
    }

    @Test
    public void gmail() throws Exception {
        String email = "makingthenewnormal@gmail.com";
        String pass = "Sutecase963";
        WebElement emailElement = driver.findElement(By.id("identifierId"));
        emailElement.sendKeys(email);
        Thread.sleep(2000);
        //  takeSnapShot(driver);
        WebElement nextButtonElement = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
        nextButtonElement.click();
        Thread.sleep(5000);// check from this step doesn't go to password link







        WebElement txtPwd = driver.findElement(By.name("password"));
        txtPwd.sendKeys(pass);
        Thread.sleep(2000);
        //  takeSnapShot(driver);
        WebElement btnNext = driver.findElement(By.id("passwordNext"));
        btnNext.click();
        Thread.sleep(2000);
        //  takeSnapShot(driver);
       // Thread.sleep(3000);
    }

//    @After
//    public void end() {
//        driver.quit();
//    }
//
//    public static void takeSnapShot(WebDriver wd) throws IOException {
//        TakesScreenshot scrShot = ((TakesScreenshot) wd);
//        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//        Random r = new Random();
//        int rand = r.nextInt(1000);
//        String filePath = System.getProperty("user.dir") + "\\Screens";
//        File file = new File(filePath + "\\" + rand + "_shot.jpeg");
//        FileUtils.copyFile(SrcFile, file);
//    }
}

