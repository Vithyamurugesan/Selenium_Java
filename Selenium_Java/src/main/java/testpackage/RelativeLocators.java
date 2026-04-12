package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement passwordField_above=driver.findElement(By.id("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/div[2]/input"));
	    WebElement emailField_above=driver.findElement(with(By.tagName("input")).above(passwordField_above));
		driver.quit();
	    
	}

}
