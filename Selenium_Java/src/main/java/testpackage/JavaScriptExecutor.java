package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        // ✅ SWITCH TO IFRAME (VERY IMPORTANT)
        driver.switchTo().frame("frm1");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // LOCATE ELEMENTS
        WebElement firstName = driver.findElement(By.xpath("//body/div[@id='body-wrapper']/div[@id='content-wrapper']/div[@id='main-wrapper']/div[@class='theiaStickySidebar']/div[@id='main']/div[@id='Blog1']/div[@class='blog-posts hfeed']/div[@class='post-outer']/div[@class='post hentry']/article/div[@id='post-body-299858861183690484']/div[@dir='ltr']/form/div[@class='container'][contains(text(),'Please fill in this form to create an account. or ')]/input[1]"));
        js.executeScript("arguments[0].value='Arun';", firstName);
        WebElement lastName = driver.findElement(By.id("lastName"));
        
        WebElement email = driver.findElement(By.id("email"));

        // SEND VALUES USING JS
       
        js.executeScript("arguments[0].value='Kumar';", lastName);
        js.executeScript("arguments[0].value='arun@test.com';", email);

        // CLICK BUTTON
        WebElement registerBtn = driver.findElement(By.id("registerbtn"));
        js.executeScript("arguments[0].click();", registerBtn);
        driver.close();
    }
}