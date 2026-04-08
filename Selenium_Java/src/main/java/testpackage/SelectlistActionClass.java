package testpackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;


public class SelectlistActionClass {
	public static void main(String[]args) {

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.leafground.com/select.xhtml"); 
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        Actions actions = new Actions(driver);
		        WebElement dropdown = wait.until(
		        ExpectedConditions.elementToBeClickable( By.xpath("//input[@placeholder='Choose Course']")));
		              
		        
		        actions.moveToElement(dropdown).click().perform();
		        dropdown.sendKeys("Selenium");
		        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy( By.xpath("//ul//li")));
		        for (WebElement option : options) {
		            if (option.getText().equalsIgnoreCase("Selenium WebDriver")) {
		                actions.moveToElement(option).click().perform();
		                break;
		            }
		        }

		        System.out.println("Selected using Actions Class!");
	}
}
		