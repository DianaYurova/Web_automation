import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class DouWithAnnotation {
    @FindBy(xpath = "//div[@class = 'b-dou-vacancies']/ul/li/a") WebElement hotVacancy;

    @Test
    public void SearchDou() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://dou.ua/");
        hotVacancy.click();
        System.out.println(driver.findElement(By.xpath("//span[@class = 'place']")).getText());
    }
}
