package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckBox {
    WebDriver wd;

    @Test
    public void setup() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        wd.manage().window().maximize();
        Thread.sleep(6000);
        wd.findElement(By.xpath("//*[@id=\"isAgeSelected\"]")).click();
        Thread.sleep(4000);
        Assert.assertEquals(wd.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText(), "Success - Check box is checked");
        wd.findElement(By.xpath("//*[@id=\"isAgeSelected\"]")).click();
        Thread.sleep(4000);
        Assert.assertEquals("", "");
    }

    @Test
    public void multipleCheckBox()  {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(3) > label > input")).click();
        wd.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(4) > label > input")).click();
        wd.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(5) > label > input")).click();
        wd.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(6) > label > input")).click();

//        wd.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")).click();
//        wd.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")).click();
//        wd.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")).click();
//        wd.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")).click();
        Assert.assertEquals(wd.findElement(By.cssSelector("#check1")).getText(), "Uncheck All");
//        wd.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")).click();
//        Assert.assertEquals(wd.findElement(By.id("isChkd")).getText(), "false");



    }
}
