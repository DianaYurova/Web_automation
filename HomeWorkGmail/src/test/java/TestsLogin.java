import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestsLogin {
    @Test
    public void LoginHP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement webElementLogin = driver.findElement(By.id("identifierId"));
        webElementLogin.sendKeys("diankatestmail@gmail.com");
        WebElement webElementbtnNext = driver.findElement(By.xpath("//button [@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']"));
        webElementbtnNext.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement webElementPassword = (new WebDriverWait(driver, Duration.ofSeconds(10))).until
                (ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type = 'password']")));
        webElementPassword.sendKeys("Diana123=");
        WebElement webElementbtnNext2 = (new WebDriverWait(driver, Duration.ofSeconds(10))).until
                (ExpectedConditions.presenceOfElementLocated(By.xpath("//button [@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")));
        webElementbtnNext2.click();
        driver.close();
    }


    @Test
    public void LoginFailed() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement webElementLogin = driver.findElement(By.id("identifierId"));
        webElementLogin.sendKeys("diankatestmail@gmail.com");
        WebElement webElementbtnNext = driver.findElement(By.xpath("//button [@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']"));
        webElementbtnNext.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement webElementPassword = (new WebDriverWait(driver, Duration.ofSeconds(10))).until
                (ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type = 'password']")));
        webElementPassword.sendKeys("1234567");
        WebElement webElementbtnNext2 = (new WebDriverWait(driver, Duration.ofSeconds(10))).until
                (ExpectedConditions.presenceOfElementLocated(By.xpath("//button [@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")));
        webElementbtnNext2.sendKeys(Keys.ENTER);
 //       driver.close();
    }
}