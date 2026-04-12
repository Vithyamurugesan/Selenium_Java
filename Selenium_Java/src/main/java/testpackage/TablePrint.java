package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TablePrint {
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
			
			
			for(int r=1;r<=rowcount;r++) {
				for(int c=1;c<=columncount;c++) {
					WebElement data;
					//for header row,use <th> elements  
					if(r==1) {
						data=driver.findElement(By.xpath("//table[@id='table1']//tr[" + r + "]//th[" + c + "]"));
					}
					else {
						data=driver.findElement(By.xpath("//table[@id='table1']//tr[" + r + "]//td[" + c + "]"));
					}
					System.out.print(data.getText());
					
				}
				System.out.println();
			}
			driver.quit();
		}
}
