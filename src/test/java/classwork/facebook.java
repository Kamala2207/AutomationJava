package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
    @Test
    public void Browser() throws InterruptedException{

        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();

        wd.get("http://www.facebook.com");
        wd.manage().window().maximize();

    }
}
