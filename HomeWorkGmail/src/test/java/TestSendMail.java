import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSendMail {
    @Test
    public void SendMailHP() {
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
        WebElement webElementWriteNewMail = (new WebDriverWait(driver, Duration.ofSeconds(10))).until
                (ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-I T-I-KE L3']")));
        webElementWriteNewMail.click();
        WebElement webElementRecipient = (new WebDriverWait(driver, Duration.ofSeconds(10))).until
                (ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@aria-label='Кому']")));
        webElementRecipient.sendKeys("diana.yurova111@gmail.com");
        WebElement webElementTopic = driver.findElement(By.xpath("//input[@aria-label='Тема']"));
        webElementTopic.sendKeys("anything");
        WebElement webElementSendButton = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
        webElementSendButton.click();
    }

    @Test
    public void SendMailWithoutRecipient() {
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
        WebElement webElementWriteNewMail = (new WebDriverWait(driver, Duration.ofSeconds(10))).until
                (ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-I T-I-KE L3']")));
        webElementWriteNewMail.click();
        WebElement webElementTopic = driver.findElement(By.xpath("//input[@aria-label='Тема']"));
        webElementTopic.sendKeys("no recipient");
        WebElement webElementSendButton = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
        webElementSendButton.click();
    }
}
