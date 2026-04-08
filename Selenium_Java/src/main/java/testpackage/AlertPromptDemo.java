package testpackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromptDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		WebElement alertmsg=driver.findElement(By.className("ui-button-text ui-c"));
        alertmsg.click();
		
		Alert sa=driver.switchTo().alert();
		sa.sendKeys("John");
		sa.accept();
		

	}

}
