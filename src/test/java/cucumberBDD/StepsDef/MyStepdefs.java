package cucumberBDD.StepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class MyStepdefs {
    WebDriver wd;
    @Given("^User is in gmail login page$")
    public void userIsInGmailLoginPage() {
        WebDriverManager.firefoxdriver().setup();
        wd = new FirefoxDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();

    }

    @When("^Enters valid user in User Field$")
    public void entersValidUserInUserField()  {
        WebElement username = wd.findElement(By.id("identifierId"));
        username.sendKeys("qatesting00567@gmail.com");
    }

    @And("^Click next button$")
    public void clickNextButton() {
        WebElement btnNext = wd.findElement(By.className("VfPpkd-RLmnJb"));
        btnNext.click();
    }

    @And("^Enters valid password in password field$")
    public void entersValidPasswordInPasswordField() throws InterruptedException {
        Thread.sleep(5000);
        WebElement pass = wd.findElement(By.name("password"));
        pass.sendKeys("Test@123");
    }

    @And("^Click on next button to login$")
    public void clickOnNextButtonToLogin() {
        WebElement btnNext = wd.findElement(By.className("VfPpkd-RLmnJb"));
        btnNext.click();
    }

    @Then("^Verify User is on email profile page$")
    public void verifyUserIsOnEmailProfilePage() {
    }

    @Given("^User is in gmail login page$")
    public void userIsInGmailLoginPage1() {
        WebDriverManager.firefoxdriver().setup();
        wd = new FirefoxDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();

    }

    @When("^Enters valid user in User Field$")
    public void entersValidUserInUserField1()  {
        WebElement username = wd.findElement(By.id("identifierId"));
        username.sendKeys("qatesting00567@gmail.com");
    }

    @And("^Click next button$")
    public void clickNextButton1() {
        WebElement btnNext = wd.findElement(By.className("VfPpkd-RLmnJb"));
        btnNext.click();
    }

    @Then("^Verify User is on email profile page$")
    public void verifyUserIsOnEmailProfilePage1() {
    }



    @And("^Enters invalid password in password field$")
    public void entersInvalidPasswordInPasswordField() throws Throwable {
        Thread.sleep(5000);
        WebElement pass = wd.findElement(By.name("password"));
        pass.sendKeys("12345678");
    }

    @Then("^Display Error message$")
    public void displayErrorMessage() throws Throwable {
    Thread.sleep(5000);
    WebElement err = wd.findElement(By.xpath(""));
        System.out.println(err.getText());
    }
}
