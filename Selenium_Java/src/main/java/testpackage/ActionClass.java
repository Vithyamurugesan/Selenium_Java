package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsmenuElement=driver.findElement(By.id("blogsmenu"));
		Actions act=new Actions(driver);
		act.moveToElement(blogsmenuElement).perform();
		
		WebElement option2=driver.findElement(By.xpath("//a[@href='http://www.selenium-by-arun.blogspot.com']"));
		act.moveToElement(option2).click().perform();
		
		act.click().perform();
		driver.quit();
		
		
		

	}

}
