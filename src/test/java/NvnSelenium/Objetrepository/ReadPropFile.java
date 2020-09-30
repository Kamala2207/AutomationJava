package NvnSelenium.Objetrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

    static WebDriver driver;

    public static void main(String[]args) throws IOException {

        Properties prop = new Properties();

        FileInputStream ip = new FileInputStream("C:\\Users\\Hyun\\IdeaProjects\\AutomationJava\\src\\test\\java\\NvnSelenium\\Objetrepository\\config.properties");//location of file
        prop.load(ip);


        System.out.println(prop.getProperty("Name"));
        System.out.println(prop.getProperty("Age"));
//        System.out.println(prop.getProperty("URL")); //this helps just to print
//        System.out.println(prop.getProperty("browser"));
            //we can do these both ways but
        String url = prop.getProperty("URL");
        System.out.println(url);//this helps later in the code to execute the URL just using obj url which is used below

        String BrowserName =  prop.getProperty("browser");
        System.out.println(BrowserName);

//advantage if this File.java is instead of going through the code and changing the browser where we want to execute
// just by changing the value in file the whole code gets execute either in chrome or firefox or Internet Explorer
//with file VALUE browser, FF and IE


        if(BrowserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
             driver = new ChromeDriver();
        }
        else if(BrowserName.equals("FF")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Hyun\\Desktop\\firefoxdriver");
             driver = new FirefoxDriver();
        }
        else if(BrowserName.equals("IE")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Hyun\\Desktop\\internetexplorerdriver.exe");
             driver = new InternetExplorerDriver();
        }

        driver.get(url);

        driver.findElement(By.xpath(prop.getProperty("firstname_Xpath"))).sendKeys(prop.getProperty("firstname"));
        driver.findElement(By.xpath(prop.getProperty("lastname_Xpath"))).sendKeys(prop.getProperty("lastname"));


    }
}
