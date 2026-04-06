package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestleafWaits2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/waits.xhtml");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Click First Button
        driver.findElement(By.xpath("//span[text()='Click First Button']")).click();

        // Wait for growl popup to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-growl")));

        // Wait for growl popup to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ui-growl")));

        // Now wait for Click Second button clickable and click
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='Click Second']"))).click();

        System.out.println("Clickability wait completed");

        driver.quit();
    }
}