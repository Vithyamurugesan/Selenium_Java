package testpackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaNewWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/browser-windows");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set <String> allwindowhandles=driver.getWindowHandles();
		System.out.println("Count of windows: "+allwindowhandles.size());
		
		driver.findElement(By.id("windowButton")).click();
		
		Set <String> newallwindowhandles=driver.getWindowHandles();
		System.out.println("New Count of windows: "+newallwindowhandles.size());
		
		//get the details of parent and child windows
		String parentHandle=driver.getWindowHandle();
		System.out.println("Parent window : "+ parentHandle);
		
		//get details of parent and child windows
		Iterator<String> iterator=newallwindowhandles.iterator();
		String mainWindow=iterator.next();
		String childWindow=iterator.next();
		System.out.println("Parent window:"+mainWindow);
		System.out.println("Child window:"+childWindow);	
		
		//switch control to child window
		driver.switchTo().window(childWindow);
		
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println("Child_Title:"+text.getText());
		
		//close the child window
		driver.close();
		
		driver.switchTo().window(parentHandle);
		System.out.println("Parent_title: "+driver.getTitle());
		
		driver.quit();
		
		
		

	}

}
