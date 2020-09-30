package NvnSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
    public static void main(String[]args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.name("")).click();//click on Go bth
        Thread.sleep(5000);

//To switch from one window to another when alert pop up is there:

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();

  //if you want to put a condition then: OR to validate:
  if(text.equals("Please enter a valid user name")){
      System.out.println("correct alert message");
  }
  else{
      System.out.println("in-correct alert message");
  }

        alert.accept();//click on OK bth
      //alert.dismiss();//click on cancel bth
    }
}
