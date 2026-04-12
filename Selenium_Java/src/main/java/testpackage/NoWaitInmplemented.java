package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoWaitInmplemented {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.className("dropdown"));
		driver.findElement(By.className("dropdown-content")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Facebook")).click();
		driver.quit();
		

	}

}
