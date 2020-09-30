package NvnSelenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {//element.png

    public static void main(String[] args) throws IOException {
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\Hyun\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.freecrm.com/");
        driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();

        driver.findElement(By.name("email")).sendKeys("lkamala3@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Kamalalama123");

       // driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
       // Thread.sleep(4000);


        //executeScript ---to execute JavaScript code
        WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));//login button
        flash(loginBtn, driver);//hightlight the element

        drawBorder(loginBtn,driver);//draw a border

        //take screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Hyun\\IdeaProjects\\AutomationJava\\src\\test\\java\\NvnSelenium\\element.png"));

        //generate Alert
       // generateAlert(driver, "There is an issue with login button on Login Page");

        clickElementByJs(loginBtn,driver);//click on any element by using JS executor

        driver.navigate().refresh();//refresh page using selenium

        refreshBrowserByJS(driver);//refresh by using JS executor

        System.out.println(getTitleByJS(driver));//get the title of the page by JS

        System.out.println(getPageInnerText(driver));//get the page text

       // scrollPageDown(driver);//to scroll down

        WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        scrollIntoView(forgotPwdLink,driver);
    }

    public static void flash(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor = element.getCssValue("backgroundColor");
        for(int i = 0; i < 100; i++){
            changeColor("rgb(0,200,0)", element,driver);
            changeColor(bgcolor, element,driver);
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+ color+"'", element);

        try{
            Thread.sleep(20);
        } catch(InterruptedException e){

        }
    }

    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].style.border='3px solid red'",element);
    }

    //for alert we have to pass only one element
    public static void generateAlert(WebDriver driver, String message){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("alert('"+message+"')");
    }

    public static void clickElementByJs(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].click();",element);
    }

    //how to refresh the browser using JavascriptExecutor

    public static void refreshBrowserByJS(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("history.go(0)");
    }

    //get title
    public static String getTitleByJS(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        String title = js.executeScript("return document.title;").toString();
        return title;
    }

    public static String getPageInnerText(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        String pageText = js.executeScript("return document.documentElement.innerText;").toString();
        return pageText;
    }

    public static void scrollPageDown(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void scrollIntoView(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
}

