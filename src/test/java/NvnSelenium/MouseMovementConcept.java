package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

    public static void main(String[] args) throws InterruptedException {
//all the links are represented by <a> html tag
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.spicejet.com/");

        Actions s1 = new Actions(driver);
        s1.moveToElement(driver.findElement(By.linkText(""))).build().perform();
        Thread.sleep(4000);

        s1.moveToElement(driver.findElement(By.linkText("highlight-addons"))).build().perform();
        Thread.sleep(4000);
        driver.findElement(By.linkText("")).click();

    }
}
