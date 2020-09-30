package NvnSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

    public static void main(String[]args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();//launch firefox
        wd.get("http://www.google.com");//enter URL

 //For handle dropbox we have to use select

 Select select = new Select(wd.findElement(By.xpath("  ")));
 select.selectByVisibleText("   ");//enter from the list
    }
}
