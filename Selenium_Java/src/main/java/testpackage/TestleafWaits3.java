package testpackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestleafWaits3{

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/waits.xhtml");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click button
        driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();

        // Wait for text to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//span[text()='I am about to hide']")));

        System.out.println("Invisibility wait completed");
    	driver.quit();
    }
}