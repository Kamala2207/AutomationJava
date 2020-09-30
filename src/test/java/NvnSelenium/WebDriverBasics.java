package NvnSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

    public static void main(String[]args){

      //  WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        //Automation code

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver wd = new FirefoxDriver();//launch firefox
//        wd.get("http://www.google.com");//enter URL

        String title = driver.getTitle();
        System.out.println(title);

      //  validation point
        if(title.equals("Google")){
            System.out.println("correct tittle");
        }else{
            System.out.println("incorrect tittle");
        }

        System.out.println(driver.getCurrentUrl());
       // System.out.println(wd.getPageSource());

       driver.quit();
    }
}
