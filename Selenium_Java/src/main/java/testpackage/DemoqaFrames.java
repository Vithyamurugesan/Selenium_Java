package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoqaFrames {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://demoqa.com/frames");
			
			WebElement iframeElement=driver.findElement(By.id("frame1"));
			driver.switchTo().frame(iframeElement);
			String Frame_1=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println("Switch by locators :"+Frame_1);
			
			//switch back to main window
			driver.switchTo().defaultContent();
			String mainPage=driver.findElement(By.xpath("//*id='framesWrapper/h1")).getText();
			System.out.println("Back to mainpage :"+mainPage);
			
			
			//switch iframe using index
			driver.switchTo().frame(1);
			String Frame_2=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println("Switch by index :"+Frame_2);
			
			driver.quit();
			
			
			
			
			
			
			
	}

}
