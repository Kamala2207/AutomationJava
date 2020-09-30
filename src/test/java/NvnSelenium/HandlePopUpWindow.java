package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlePopUpWindow {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("http://popuptest.com/goodpopups.html");

        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
        Thread.sleep(5000);

        Set<String> handler = driver.getWindowHandles();

        Iterator<String> it = handler.iterator();

        String parentWindowId = it.next();
        System.out.println("parent window id: " + parentWindowId);

        String childWindowId = it.next();
        System.out.println("Child window id: " + childWindowId);

        driver.switchTo().window(childWindowId);
        Thread.sleep(3000);

        System.out.println("child window pop up title " + driver.getTitle());

        driver.close();//not quit

        driver.switchTo().window(parentWindowId);
        Thread.sleep(3000);

        System.out.println("parent window title " + driver.getTitle());

    }
}
