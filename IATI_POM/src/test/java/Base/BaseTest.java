package Base;

import Pages.*;
import com.github.javafaker.Faker;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    private WebDriver driver;
    public LoginPage loginPage;

    public DashBoardPage dashboard;
    public ActivityDetailPage activitydetailpage;
    public DescriptionPage descriptionPage;

    public Faker fakedata;
   public ActivityPage activitypage;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://iatipublisher-dev.yipl.com.np/");

       loginPage = new LoginPage(driver);
       dashboard=new DashBoardPage(driver);
       activitypage=new ActivityPage(driver);
        activitydetailpage=new ActivityDetailPage(driver);
        descriptionPage=new DescriptionPage(driver);
        fakedata=new Faker();

    }

    @AfterSuite
    public void tearDown(){

        driver.quit();
    }


}

