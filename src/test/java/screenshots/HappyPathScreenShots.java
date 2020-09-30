package screenshots;

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


public class HappyPathScreenShots {
    WebDriver driver;
    @Before
            public void setup() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(6000);
    }

    @Test
    public void gmailHappyPathScreenshots() throws Exception{
        String email = "qatesting00567@gmail.com";
        String pass = "Test@123";
        WebElement emailElement=driver.findElement(By.name("identifier"));
        emailElement.sendKeys(email);
        Thread.sleep(2000);
        takeSnapShot(driver);
        WebElement nextButtonElement=driver.findElement(By.xpath("//*[@id='identifierNext']"));

        nextButtonElement.click();
        Thread.sleep(5000);


        WebElement txtPwd = driver.findElement(By.name("password"));
        txtPwd.sendKeys(pass);
        Thread.sleep(2000);
        takeSnapShot(driver);
        WebElement btnNext = driver.findElement(By.id("passwordNext"));
        btnNext.click();
        Thread.sleep(2000);
        takeSnapShot(driver);
        Thread.sleep(3000);

    }

    @After
    public void end() { driver.quit();}

    public static void takeSnapShot(WebDriver wd) throws IOException{
        TakesScreenshot scrShot =((TakesScreenshot)wd);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        Random r = new Random();
        int rand = r.nextInt(1000);
        String filePath = System.getProperty("user.dir") + "\\Screens";
        File file = new File(filePath + "\\" + rand+"_shot.jpeg");
        FileUtils.copyFile(SrcFile,file);


   }
}
