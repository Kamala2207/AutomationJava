package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementConcept {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/");
//suppose if you have to find the links for an entire webpage how can we do it
//1. how to get the total count of links on the page

List<WebElement> linklist = driver.findElements(By.tagName("a"));//a coz all the link use a html tag
        System.out.println(linklist.size());
//2. how to get the text of each link on the page, here we have to use for loop

for(int i=0; i< linklist.size(); i++){
    String linkText = linklist.get(i).getText();
    System.out.println(linkText);
}
    }
}
