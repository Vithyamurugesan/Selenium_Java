package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableColumSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List <WebElement> headingscolumn=driver.findElements(By.xpath("//table[@id='table1']//th"));
		int columncount=headingscolumn.size();
		

		List <WebElement> row=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int rowcount=row.size();
		
		
		System.out.println(columncount);
		System.out.println(rowcount);
		driver.quit();
		

	}

}
