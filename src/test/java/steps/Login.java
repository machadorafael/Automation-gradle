package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Login extends Config{

    WebDriver driver;

    @Given("^Estou na home page$")
    public void openHomePage() throws InterruptedException {

        //System.setProperty(jenkinsChromeName, jenkinsChromePath);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Clico em Login$")
    public void clickOnLoginButton() throws Throwable {
        WebElement loginBtn = driver.findElement(By.id("landingComponentLoginButton"));
        loginBtn.click();
    }

    @When("^Insiro email e senha validos$")
    public void insertEmail() throws Throwable {
        WebElement emailInput = driver.findElement(By.id("loginFormInputUser"));
        WebElement passwordInput = driver.findElement(By.id("loginFormInputPassword"));
        emailInput.sendKeys(user);
        passwordInput.sendKeys(password);
    }

    @When("^Clico no botao de login$")
    public void clico_no_botao_de_login() throws Throwable {
        WebElement enterBtn = driver.findElement(By.id("loginComponentLoginEmailSenha"));
        enterBtn.click();
    }

    @Then("^Home page e apresentada com sucesso$")
    public void showHomePage() throws Throwable {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.className("burger")).isDisplayed();
        driver.quit();
    }
}
