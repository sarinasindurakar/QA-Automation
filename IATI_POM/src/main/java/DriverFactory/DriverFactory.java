package DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    WebDriver driver;
    Properties properties;

    public WebDriver initDriver(Properties prop) {
        String browser = prop.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();


        } else {
            System.out.println("Keyword not matched");
        }
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        return driver;
    }

    public Properties initproperties() {
        properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(System.getProperty("src/main/java/Config/config.properties"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return properties;

    }
}
