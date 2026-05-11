package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITFileUploadUsingSendkeys {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://pdf2doc.com/");
        WebElement upload = driver.findElement(
                By.xpath("//input[@type='file']"));
        upload.sendKeys("C:\\Users\\vithy\\Downloads\\Offer Letter.pdf");
        System.out.println("File Uploaded Successfully Using the sendKeys");
        driver.quit();
        
    }
}  