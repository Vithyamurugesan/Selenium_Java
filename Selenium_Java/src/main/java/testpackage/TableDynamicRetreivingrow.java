package testpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamicRetreivingrow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("vithya@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("vithya@44");
	
		WebElement submitclick=driver.findElement(By.id("submit"));
		submitclick.click();
		
		List <WebElement> data=driver.findElements(By.xpath("//table[@id='myTable']/tr/td[2]"));//for retriving names
		String expectedname="ajay a";
		int count=data.size();
		System.out.println("Total count in the table:"+count);
		for(WebElement name:data) {
			System.out.println(name.getText());
		}
		int i=1;
		for(WebElement name:data) {
			if(name.getText().equals(expectedname)) {
				List<WebElement> actualdata=driver.findElements(By.xpath("//table[@id='myTable']/tr["+i+"]"));
				for(WebElement row:actualdata) {
					System.out.println(row.getText());
				}
			}
			i++;
		}
		driver.quit();
	}

}



































