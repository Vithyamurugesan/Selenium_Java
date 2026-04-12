package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBlazeLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.demoblaze.com/");

		
		driver.findElement(By.cssSelector("a#login2")).click();
		
		WebElement username = driver.findElement(By.id("loginusername"));
	    username.sendKeys("vithyakm");
	    
	    WebElement password=driver.findElement(By.id("loginpassword"));
	    password.sendKeys("123456");
	    
	    driver.findElement(By.cssSelector("button.btn.btn-primary[onclick='logIn()']")).click();

	    System.out.println("Logged in Successfully");
	    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 // Wait for welcome text
	 WebElement welcomeText = wait.until(
	     ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))
	 );

	 String text = welcomeText.getText();

	 if (text.equals("Welcome vithyakm")) {
	     System.out.println("Welcome text verified: " + text);
	 } else {
	     System.out.println("Welcome text not correct: " + text);
	 }

	 // Wait for logout button
	 WebElement logoutBtn = wait.until(
	     ExpectedConditions.visibilityOfElementLocated(By.id("logout2"))
	 );

	 if (logoutBtn.isDisplayed()) {
	     System.out.println("Logout button is displayed");
	 }
		
		driver.quit();
	}


}
