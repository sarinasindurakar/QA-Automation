package Utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class ConstantUtils {
    private WebDriver driver;

  private static Faker fakerdata;


    public ConstantUtils(WebDriver driver) {

        this.driver = driver;
        fakerdata=new Faker();
    }
    public static final String username="Testing";
    //public static final String activityname="dfd";
    public static final String activityidentifier= fakerdata.address().buildingNumber();
    public static final  String activitystatusheading="activity-status";
    public static final  String dashboardheading="Your Activities";
    public static final String descriptiontitle="description";
    public static final String publishing ="Publishing Checklist";
    public static final String aboutus="About IATI Publisher";
    public static final String support="Support";
    public static final String Iatistandard="IATI Standard";
}
