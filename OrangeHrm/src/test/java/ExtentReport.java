import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ExtentReport {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    WebDriver driver;
    @BeforeSuite
    public void setup(){
         htmlReporter = new ExtentHtmlReporter("extent.html");
         extent=new ExtentReports();
        extent.attachReporter(htmlReporter);

    }
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void test1() throws IOException {
        ExtentTest test=extent.createTest("My FirstTest");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        test.pass("Navigated to the url");
        test.log(Status.INFO,"This is step shows the usage of log(status,details)");
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");

    }
    @AfterTest
    public void teardownlast(){
        driver.close();
        driver.quit();
    }
    @AfterSuite
    public  void teardown(){
        extent.flush();

    }
}
