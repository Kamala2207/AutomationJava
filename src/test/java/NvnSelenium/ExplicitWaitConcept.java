package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitConcept {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
//
//        clickOn(driver, driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")),20);//login button
//        clickOn(driver, driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")),10);//create a page link
//
//    }
//
//    public static void clickOn(WebDriver driver, WebElement locator, int timeout){
//        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
//        locator.click();
    }
}
//needs a revision code isn't working