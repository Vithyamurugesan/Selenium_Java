package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsmenuElement=driver.findElement(By.id("blogsmenu"));
		Actions act=new Actions(driver);
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@name='q']"));
		act.contextClick(searchfield).perform();
		act.click().perform();
		

	}

}
