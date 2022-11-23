import Orange.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage=new LoginPage(driver);
       // loginPage.setUsernameField("admin");



    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}

