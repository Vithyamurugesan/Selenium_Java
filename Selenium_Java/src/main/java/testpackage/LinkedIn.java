package testpackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.linkedin.com/login");

        // Enter username
        WebElement element = driver.findElement(By.cssSelector("#username"));
        element.sendKeys("vithyamurugesan0410@gmail.com");

        // Enter password
        WebElement element2 = driver.findElement(By.cssSelector("#password"));
        element2.sendKeys("vithya@44");

        // Click login
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Validation
        if (driver.getCurrentUrl().contains("feed")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        driver.quit();
    }
}