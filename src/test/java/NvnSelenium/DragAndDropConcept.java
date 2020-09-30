package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://jqueryui.com/droppable/");

        driver.switchTo().frame(0);//depends how many frame are there..starts with 0

        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("  ")))
        .moveToElement(driver.findElement(By.xpath("  "))).release()
        .build().perform();
// if there is no frame we can start with Actions step
    }
}
