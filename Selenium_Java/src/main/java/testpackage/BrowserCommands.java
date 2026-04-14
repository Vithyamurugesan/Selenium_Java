package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The Tile:"+driver.getTitle());
		System.out.println("The currenturl :" +driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().to("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.quit();
		

	}

	
}