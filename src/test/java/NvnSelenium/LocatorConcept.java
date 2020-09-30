package NvnSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {

    public static void main(String[]args){

//only relative Xpath should be used. Absolute Xpath should never be used.

//if we add # in front of id it will change to CssSelector OR if we add . in front of class then also it will change to CssSelector

//partial LinkText, class name, these locators are not recommended

//Anything after < is the html tag..eg..<input, <img..

        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();//launch firefox
        wd.get("http://www.google.com");//enter URL

        wd.findElement(By.xpath("   "));
        wd.findElement(By.name("  "));
        wd.findElement(By.id( "  " ));
    }
}
