package testpackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoSeleniumDev {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.cssSelector("input#adder")).click();
		WebElement element=driver.findElement(By.cssSelector("div#box0"));
		System.out.println(element.getAttribute("class"));
		driver.quit();
	}

}