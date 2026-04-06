package testpackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

        // click reveal button
        driver.findElement(By.id("reveal")).click();

        // Fluent Wait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class);

        // Wait until element is interactable
        WebElement revealed = wait.until(driver1 -> {
            WebElement element = driver1.findElement(By.id("revealed"));
            if (element.isDisplayed() && element.isEnabled()) {
                return element;
            }
            return null;
        });

        // type text
        revealed.sendKeys("Fluent Wait Example");

        // get typed text
        String text = revealed.getAttribute("value");
        System.out.println("Typed text: " + text);

        driver.quit();
    }
}

