package testpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectListDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/select.xhtml");

 
        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Choose Course']"));
        searchBox.sendKeys("Appium");
        searchBox.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> options = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.xpath("//ul[contains(@id,'auto-complete_panel')]")
                )
        );

    
        for (WebElement option : options) {
            String text = option.getText();
            System.out.println(text);

            if (text.equals("Appium") || text.equals("Selenium WebDriver") || text.equals("Playwright")) {
                option.click();
                
            }
        }
    	driver.quit();
    }
}