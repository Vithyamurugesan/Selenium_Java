package testpackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestleafWindow2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.leafground.com/window.xhtml");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set <String> allwindowhandles=driver.getWindowHandles();
		System.out.println("Count of windows: "+allwindowhandles.size());
		
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		
		Set <String> newallwindowhandles=driver.getWindowHandles();
		System.out.println("New Count of windows: "+newallwindowhandles.size());
		
		for(String id:newallwindowhandles) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Alert")) {
				driver.close();
			}
			else if(driver.getTitle().equals("input")) {
				driver.close();
				
			}
			else if(driver.getTitle().equals("dashboard")) {
				driver.close();
			}
			
			
		}
		driver.switchTo().window(parentwindow);
		
		Set <String> newallwindowhandles1=driver.getWindowHandles();
		System.out.println("Count of windows: "+newallwindowhandles1.size());
		
		
		
		
		
	}

}
