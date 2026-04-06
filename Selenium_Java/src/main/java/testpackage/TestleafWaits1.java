package testpackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestleafWaits1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/waits.xhtml");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click button
        driver.findElement(By.cssSelector("span.ui-button-text.ui-c")).click();

        // Wait for element to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text()='I am here']")));

        System.out.println("Visibility wait completed");
    }
}