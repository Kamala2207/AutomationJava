package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CountSum {
    WebDriver wd;

@Before



    public void totalSum() {
    WebDriverManager.chromedriver().setup();
     wd = new ChromeDriver();
    wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
    wd.manage().window().maximize();
}

@Test
        public void sumTable(){
    double sum = 0.00;
    double expectedSum = 90.35;
    List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row : rows) {
            double no = Double.parseDouble(row.getText());
            sum = sum + no;
        }


        Assert.assertEquals(sum, expectedSum,0.001);
    }
 @After
public void exit(){ wd.quit();}


}
