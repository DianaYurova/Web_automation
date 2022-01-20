import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstTest {

    @Test
    public void Test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("anything for search");

        driver.findElement(By.name("btnK")).click();
    }

    @Test
    public void Test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.ukr.net/");
        driver.switchTo().frame("mail widget");

        driver.findElement(By.id("id-input-login")).sendKeys("Diana");
        driver.findElement(By.id("id-input-password")).sendKeys("1234567");
    }

    @Test
    public void Test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.rozetka.com.ua/");

        List<WebElement> elements = driver.findElements(By.className("main-categories__link ng-star-inserted"));
        System.out.println(elements.size());
    }

    @Test
    public void Test4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.rozetka.com.ua/");
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.tagName("img"));
        System.out.println(elements.size());
    }

    @Test
    public void Test5() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.ukr.net/");
        driver.switchTo().frame("mail widget");
        List<WebElement> elements2 = driver.findElements(By.name("login"));
        List<WebElement> elements3 = driver.findElements(By.name("password"));

        System.out.println(elements2.size());
        System.out.println(elements3.size());
    }
    @Test
    public void Test6() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.partialLinkText("укр")).click();

    }

    @Test
    public void Test7() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.rozetka.com.ua/");
        List <WebElement> elements4 = driver.findElements(By.cssSelector("html body app-root div div rz-header rz-main-header header"));
        System.out.println(elements4.size());
    }
    @Test
    public void Test8() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.rozetka.com.ua/");
        driver.findElement(By.xpath("//*[@name='search']")).sendKeys("конфеты");
        driver.findElement(By.xpath("//*[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")).click();
    }

    @Test
    public void Test9() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.rozetka.com.ua/");
        driver.findElement(By.cssSelector("rz-mobile-user-menu .header__button")).click();
        driver.findElement(By.cssSelector("li button#fat-menu")).click();
        driver.findElement(By.cssSelector("button[aria-label = 'Ноутбуки и компьютеры']")).click();
        driver.findElement(By.cssSelector("li.menu-main__item a[href = \"https://rozetka.com.ua/notebooks/c80004/\"]']")).click();
    }

}
