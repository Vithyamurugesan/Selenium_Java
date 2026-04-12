package testpackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSimpleDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alertmsg=driver.findElement(By.id("j_idt88:j_idt91"));
		alertmsg.click();
		
		Alert sa=driver.switchTo().alert();
		sa.accept();
		System.out.println("Simple Alert Accepted");
		driver.quit();
		
	
		
	}

}
