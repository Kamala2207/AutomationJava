package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("URL  ");

//absolute Xpath: not recommended
//1.performance issue
//2.not reliable
//3.can be changed at any time in future

//steps to create Customize Xpath:
//1. start with double slash("//")
//2. put the html tag
//3.Then put []
//4. whatever attribute is present @ like class or @ name, use it
//5. Then =''
//6. put attribute value inside '' eg, with class it should look like
        //suppos the inspect element looks like this:
 //<input class="actualbox" name="query" value="" maxlength="300" autocomplete="OFF" type="text"/>

driver.findElement(By.xpath("//input[@class='actualbox ']")).sendKeys("Java");//with @class

driver.findElement(By.xpath("//input[@name='query']")).sendKeys("Java");//with @name

driver.findElement(By.xpath("//input[contains(@class,'actualbox')]")).sendKeys("Java");//with contains, we
//dont use = here instead we use ,
//we use contains when id is changing for eg,

//id = test_123
//By.id("test_123")

//starts-with
//id = test_456
//id = test_789
//id = test_test_7890_test

//ends with
//id = 1234_test_t
//id = 2345_test_t
//id = 6789_test_t

driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Java");
driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Java");
driver.findElement(By.xpath("//input[ends-with[ends-with(@id,'_test')]")).sendKeys("Java");

//for links: custom xpath
//all the links are represented by <a> html tag:
driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
    }
}
