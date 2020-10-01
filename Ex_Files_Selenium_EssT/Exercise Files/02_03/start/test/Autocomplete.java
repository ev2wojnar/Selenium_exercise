import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/EvannaRasp/Documents/Selenium/Selenium_Essential_Training/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Szybowcowa, Wrocław, Dolośląskie, 54-130, Polska");
        Thread.sleep(1000);

        WebElement autocomplteResult = driver.findElement(By.className("pac-item"));
        autocomplteResult.click();

        driver.quit();
    }
}
