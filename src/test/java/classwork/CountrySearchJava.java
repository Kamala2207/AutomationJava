package classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountrySearchJava {

    WebDriver wd;
    @Test
    public void CountrySearch() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.get("https://www.w3schools.com/html/html_tables.asp");
        wd.manage().window().maximize();
        //Print Germany
        WebElement country = wd.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[3]"));
        System.out.println(country.getText());
        //Print All Countries
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]"));
        for (WebElement row : rows) {
            System.out.println(row.getText());

        }
        //TCS to verify names with 2 arrayList
        List<String> expectedCountries = new ArrayList<>
                (Arrays.asList("Germany", "Mexico", "Austria", "UK", "Canada", "Italy"));

        List<String> countries = new ArrayList<>();
        for (WebElement row : rows) {
            //System.out.println(row.getText());
            countries.add(row.getText());
        }
        Assert.assertEquals(countries, expectedCountries);
        // wd.quit();
    }


        @Test
        public void CountrySearchVerification () {

            WebDriverManager.chromedriver().setup();
            wd=new ChromeDriver();
            wd.get("https://www.w3schools.com/html/html_tables.asp");
            wd.manage().window().maximize();

            String expectedCountry = "US";
            byte found = 0;
            //Print All Countries

            List<WebElement> rows= wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]"));
            for (WebElement row : rows) {
                System.out.println(row.getText());
                if (row.getText().equals(expectedCountry)) {
                    found++;
                    break;
                }
            }
            Assert.assertEquals(found, 1);
        }

    }


