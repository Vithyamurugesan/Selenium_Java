package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSeleniumDev2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		//locate revealed text box  and click reveal the new input button.
		driver.findElement(By.cssSelector("input#reveal")).click();
		//type some text in the revealed text box
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
		
		//access the typed text and display
	    driver.findElement(By.id("revealed")).sendKeys("Hello");

        // get typed text
        String text = driver.findElement(By.id("revealed")).getAttribute("value");

        // print text
        System.out.println("Typed text is: " + text);

		
		//close the driver resource
		driver.close();
		

	}

}















