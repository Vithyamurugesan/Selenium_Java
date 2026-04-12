package testpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List <WebElement> headings=driver.findElements(By.xpath("//table[@id='table1']//td"));
		System.out.println(headings.size());
		for(WebElement heading:headings) {
			System.out.println(heading.getText());
		}
		driver.quit();
	}
}

		
		