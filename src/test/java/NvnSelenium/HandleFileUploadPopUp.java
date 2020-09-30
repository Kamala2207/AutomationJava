package NvnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://html.com/input-type-file/");
        driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Hyun\\Documents");

//here we use sendkeys not click. We do not click the browser button.
//After .sendkeys inside"" here we use the Xpath of location of file( for that we want to upload and
// do right click & go to info or property and copy the location of file and paste it here

    }
}
