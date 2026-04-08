package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("vithya@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("vithya@44");
	
		WebElement sumitclick=driver.findElement(By.id("submit"));
		sumitclick.click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
        int rowCount = rows.size();


        List<WebElement> cols = driver.findElements(By.xpath("//table//tr[1]/th"));
        int colCount = cols.size();
     

        for (int i = 0; i < rowCount; i++) {

            List<WebElement> data;

            if (i == 0) {
                data = rows.get(i).findElements(By.tagName("th")); 
            } else {
                data = rows.get(i).findElements(By.tagName("td")); 
            }

            for (WebElement cell : data) {
                System.out.print(cell.getText() + "  ");
            }
            System.out.println();
        }

        driver.quit();
    }
}

