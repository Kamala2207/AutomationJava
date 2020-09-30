package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators {
    WebDriver wd;
    @Test
public void titleVerification() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.itsutra.com/");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//html/body/div[1]/div/div[2]/ul/li[5]/a")).click();
        Thread.sleep(4000);
        wd.findElement(By.xpath("//html/body/div[2]/p/a")).click();
        Thread.sleep(4000);

        WebElement lastName = wd.findElement(By.id("LastName"));
        lastName.sendKeys("Tamang");
        WebElement firstname = wd.findElement(By.id("FirstMidName"));
        firstname.sendKeys("Kamala");
        WebElement hire = wd.findElement(By.id("HireDate"));
        hire.sendKeys("08/10/2020");
        WebElement location = wd.findElement(By.id("OfficeAssignment_Location"));
        location.sendKeys("California");
        wd.findElement(By.xpath("//html/body/div[2]/form/div/div[5]/div/table/tbody/tr[2]/td[1]/input")).click();
        Thread.sleep(4000);
        wd.findElement(By.xpath("//html/body/div[2]/form/div/div[6]/div/input")).click();
    }

    @Test
        public void NameVerification () {
            WebDriverManager.chromedriver().setup();
            wd = new ChromeDriver();
            wd.get("https://automationpractice.itsutra.com/Instructor");
            wd.manage().window().maximize();


        String expectedFirstName = "Kamala";
        byte found = 0;

        List<WebElement> rows= wd.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]"));
        for (WebElement row : rows) {
            System.out.println(row.getText());
            if (row.getText().equals(expectedFirstName)) {
                found++;
                break;
            }
        }

        Assert.assertEquals(found, 1);
        }

}

