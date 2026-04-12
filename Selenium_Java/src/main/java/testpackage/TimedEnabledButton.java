package testpackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimedEnabledButton {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#timerButton")));

        driver.findElement(By.cssSelector("input#timerButton")).click();
        
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#alert2")));

        driver.findElement(By.cssSelector("input#alert2")).click();
        
    	driver.quit();
        
        
      
        
    }
}