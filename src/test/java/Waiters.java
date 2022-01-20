import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {

    @Test
    public void Test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("http://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("test");

        driver.findElement(By.name("btnK")).click();
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),\"Учетная запись\")]"));

        driver.quit();
    }

    @Test
    public void Test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("test");

        WebElement dynamicElement = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.name("btnK")));

        driver.findElement(By.name("btnK")).click();
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),\"Учетная запись\")]"));

        driver.quit();
    }

    @Test
    public void Test3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        final String searchQuery = "test";

        driver.navigate().to("https://prozorro.gov.ua/tender/search/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.elementToBeClickable(By.id("query")));
            driver.findElement(By.id("query")).clear();
            Thread.sleep(2000);

            driver.findElement(By.id("query")).sendKeys("test");
            WebElement element2 = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.visibilityOfElementLocated(By.id("query")));

            new WebDriverWait(driver, Duration.ofSeconds(3)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver webDriver) {
                    return webDriver.findElement(By.xpath("//a[@class='selected']//span")).getText().contains(searchQuery);
                }
            });
            driver.findElement(By.id("query")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//a[@href = '/tender/UA-2021-12-27-000820-c']")).click();
 //       driver.quit();
    }

    @Test
    public void Test4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        final String searchQuery = "test";

        driver.navigate().to("https://prozorro.gov.ua/tender/search/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ключове слово']")));
        driver.findElement(By.xpath("//button[text()='Ключове слово']")).click();
        driver.findElement(By.xpath("//div[@id='blocks']/div/input")).sendKeys("anything");
//        Thread.sleep(2000);

//        driver.findElement(By.id("query")).sendKeys("test");
//        WebElement element2 = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.visibilityOfElementLocated(By.id("query")));
//
//        new WebDriverWait(driver, Duration.ofSeconds(3)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver webDriver) {
//                return webDriver.findElement(By.xpath("//a[@class='selected']//span")).getText().contains(searchQuery);
//            }
//        });
//        driver.findElement(By.id("query")).sendKeys(Keys.ENTER);
//        driver.findElement(By.xpath("//a[@href = '/tender/UA-2021-12-27-000820-c']")).click();
//        //       driver.quit();
    }
}
