package testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestReportingExtent {

	public static void main(String[] args) {
		ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("extentReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlreport);
		WebDriver driver=new ChromeDriver();
		ExtentTest test=extent.createTest("Google Search test");
		
		try {
			driver.get("https://www.google.com");
			test.pass("Navigated to google");
		}
		catch(Exception e) {
			test.fail("Test Failed due to exception: "+e.getMessage());
		}
	    finally {
			driver.quit();
			extent.flush();	
			}
		}
	}
