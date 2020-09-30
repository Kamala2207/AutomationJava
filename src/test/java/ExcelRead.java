import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

 WebDriver wd;
 FileInputStream inputStream;
 Workbook workbook;
 Sheet employeeSheet;


     @Before

         public void setup() throws IOException{
            String fileName = "source.xlsx";
            String filePath = System.getProperty("user.dir")+ "\\src\\test\\resources";
            File file = new File(filePath + "\\" + fileName);


    //Create an object of FileInputStream class to read excel file
     inputStream = new FileInputStream(file);
     workbook = new XSSFWorkbook(inputStream);

     employeeSheet= workbook.getSheet("User"); //sheetname

     String site=employeeSheet.getRow(0).getCell(1).getStringCellValue();


    // System.setProperty("webdriver.chrome.driver", "chromedriver_old.exe");
     WebDriverManager.chromedriver().setup();
    // Create ChromeDriver instance

     wd = new ChromeDriver();
     wd.get(site);
     wd.manage().window().maximize();
     }


     @Test

     public void readExcel() throws InterruptedException, IOException {
    // Find number of rows in excel file
     String email=employeeSheet.getRow(1).getCell(1).getStringCellValue();
     String pass=employeeSheet.getRow(2).getCell(1).getStringCellValue();

      WebElement emailElement=wd.findElement(By.name("identifier"));
      emailElement.sendKeys(email);

      WebElement nextButtonElement=wd.findElement(By.xpath("//"));
      nextButtonElement.click();
      Thread.sleep(5000);

      WebElement txtPwd = wd.findElement(By.name("password"));
      txtPwd.sendKeys(pass);
      WebElement btnNext =wd.findElement(By.id("passwordNext"));
      btnNext.click();
      Thread.sleep(5000);
}
}
