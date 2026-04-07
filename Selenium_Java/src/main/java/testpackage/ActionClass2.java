package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsmenuElement=driver.findElement(By.id("blogsmenu"));
		Actions action=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		action.doubleClick(doubleclick).perform();
		action.click().perform();
	}
}
