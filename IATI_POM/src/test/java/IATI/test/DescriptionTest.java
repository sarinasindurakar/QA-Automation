package IATI.test;

import Base.BaseTest;
import Utils.ConstantUtils;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DescriptionTest  extends BaseTest {
    @Test
    public void descriptiontest() throws InterruptedException {
        loginPage.setUsername("testautomate");
        loginPage.setPassword("12345678");
        loginPage.clickloginbutton();
        dashboard.addactivity();
        dashboard.setAddmanuallybutton();
       // Thread.sleep(3000);
        activitypage.setNarrative(fakedata.book().title());
        //Thread.sleep(3000);
        activitypage.setActivityidentifier(fakedata.address().buildingNumber());
        activitydetailpage = activitypage.clicksavebutton();
        descriptionPage=activitypage.clickdescription();
        Thread.sleep(5000);
        descriptionPage.type();
        descriptionPage.setnarrative(fakedata.chuckNorris().fact());
        Thread.sleep(5000);
        //jsexecutor.scroll(locator);
        descriptionPage.setlanguage();

    }
    @Test(priority = 1)
    public void validatedescriptiontitle(){
        assertEquals(descriptionPage.getdescriptiontitle(), ConstantUtils.descriptiontitle);
    }
    @Test(priority = 1)
    public void validatedescription(){
        activitydetailpage.clicksave();
        assertTrue(descriptionPage.descriptiondisplayed(),"It is not shown");
    }
}
