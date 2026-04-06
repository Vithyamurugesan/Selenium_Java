package testpackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestleafWaits4 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/waits.xhtml");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Click red Click button (Text Change section)
        driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();

        // Wait for text change on blue button
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.xpath("//span[contains(text(),'I am going to change')]"),
                "Did you notice?"));

        System.out.println("Text changed successfully");

        driver.quit();
    }
}