package testpackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFirstRow {

	public static void main(String[] args) {

				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://omayo.blogspot.com/");
				
				//first row 
				List <WebElement> headings=driver.findElements(By.xpath("//table[@id='table1']//tr[1]"));
				
				//Second row and third column 
				//List <WebElement> headings=driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td[3]"));
			
				System.out.println(headings.size());
				for(WebElement heading:headings) {
					System.out.println(heading.getText());
				}
	}
}