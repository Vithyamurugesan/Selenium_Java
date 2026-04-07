package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source=driver.findElement(By.id("drap"));
		WebElement target=driver.findElement(By.id("drop"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source,target).perform();
		action.click().perform();
	}
}
