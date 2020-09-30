package half;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebay {

    WebDriver wd;
    @Test

    public  void setup (){

        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
        wd.manage().window().maximize();

        wd.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Nabin");
        wd.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Auto");
        wd.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("12 New Road");
        wd.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Palm");
       // wd.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("California");
        //handle drop box
        Select select = new  Select(wd.findElement(By.id("state")));
        select.selectByVisibleText("California");
        wd.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("2008");
        wd.findElement(By.xpath("//*[@id=\"dayphone1\"]")).sendKeys("199");
        wd.findElement(By.xpath("//*[@id=\"dayphone2\"]")).sendKeys("233");
        wd.findElement(By.xpath("//*[@id=\"dayphone3\"]")).sendKeys("6789");
        wd.findElement(By.xpath("//*[@id=\"dayphone4\"]")).sendKeys("122");

        wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("123@yahoo.com");
        wd.findElement(By.xpath("//*[@id=\"retype_email\"]")).sendKeys("123@yahoo.com");
        wd.findElement(By.cssSelector("#userid")).sendKeys("college_teacher123");
        wd.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys("Human$being3");
        wd.findElement(By.xpath("//*[@id=\"rpass\"]")).sendKeys("Human$being3");
       // wd.findElement(By.xpath("//*[@id=\"SECRET_QUESTION\"]")).sendKeys("What is your pet's name?");

        //handle drop down
        Select select1 = new  Select(wd.findElement(By.id("SECRET_QUESTION")));
        select1.selectByVisibleText("What is your pet's name?");

        wd.findElement(By.xpath("//*[@id=\"SECRET_ANSWER\"]")).sendKeys("Tommy");

//        wd.findElement(By.xpath("//*[@id=\"birthdate2\"]")).sendKeys("November");
//        wd.findElement(By.xpath("//*[@id=\"birthdate1\"]")).sendKeys("09");
//        wd.findElement(By.xpath("//*[@id=\"birthdate3\"]")).sendKeys("2000");
        Select select2 = new  Select(wd.findElement(By.name("birthdate2")));
        select2.selectByVisibleText("November");

        Select select3 = new  Select(wd.findElement(By.id("birthdate1")));
        select3.selectByVisibleText("15");

        Select select4 = new  Select(wd.findElement(By.id("birthdate3")));
        select4.selectByVisibleText("1996");

        wd.findElement(By.xpath("//*[@id=\"acceptq1\"]")).click();

        wd.findElement(By.linkText("Sign in")).click();

    }

}
