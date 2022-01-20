import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsDiana {
    @Test
    public void Salaries() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://dou.ua/");
        WebElement webElement = driver.findElement(By.xpath("//a[@href='https://jobs.dou.ua/salaries/']"));
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[@href='https://jobs.dou.ua/salaries/']"))).build().perform();
        String color = webElement.getCssValue("Color");
        System.out.println(color);
    }
    @Test
    public void SearchDou() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://dou.ua/");
        WebElement webElement = driver.findElement(By.id("txtGlobalSearch"));
        webElement.sendKeys("junit");
        webElement.sendKeys(Keys.ENTER);
        WebElement webElementResult = driver.findElement(By.xpath("//a[@class = \"gs-title\"]"));
        System.out.println(webElementResult.getText());
    }

    @Test
    public void SearchDouCity() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://dou.ua/");
        driver.findElement(By.xpath("//div[@class = 'b-dou-vacancies']/ul/li/a")).click();
        System.out.println(driver.findElement(By.xpath("//span[@class = 'place']")).getText());
    }

    @Test
    public void Rozetka() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rozetka.com.ua/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 750);");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        System.out.println(driver.findElement(By.xpath("//goods-sections/section[@rzinview]/preceding-sibling::section[1]//h2")).getText());
//        WebElement element1 = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//goods-sections/section[@rzinview]/preceding-sibling::section[1]//h2")));
//        System.out.println(element1.getText());



    }


    @Test
    public void DrugDropped() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://crossbrowsertesting.github.io/drag-and-drop");
        Actions builder = new Actions(driver);
        builder.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
        System.out.println(driver.findElement(By.id("droppable")).getText());
    }

    @Test
    public void DrugDropped2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://crossbrowsertesting.github.io/drag-and-drop");
        Actions builder = new Actions(driver);
        builder.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
        builder.moveToElement(driver.findElement(By.id("droppable"))).build().perform();
        builder.release().build().perform();
        System.out.println(driver.findElement(By.id("droppable")).getText());
    }

    @Test
    public void DrugDropped3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://crossbrowsertesting.github.io/drag-and-drop");
        Actions builder = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        builder.clickAndHold(source).release(target).build().perform();
        System.out.println(driver.findElement(By.id("droppable")).getText());
    }
}
