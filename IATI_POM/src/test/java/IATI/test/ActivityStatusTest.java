package IATI.test;

import Base.BaseTest;
import Utils.ConstantUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ActivityStatusTest extends BaseTest {
    @BeforeTest
    public void activitystatusSetup() throws InterruptedException {
        loginPage.setUsername("testautomate");
        loginPage.setPassword("12345678");
        loginPage.clickloginbutton();
        dashboard.addactivity();
        dashboard.setAddmanuallybutton();
        Thread.sleep(3000);
        activitypage.setNarrative(fakedata.book().title());
        //Thread.sleep(3000);
        activitypage.setActivityidentifier(fakedata.address().buildingNumber());
        activitydetailpage = activitypage.clicksavebutton();

        activitydetailpage.clickactivitystatus();
       activitydetailpage.findactivitystatusddropdown();
       activitydetailpage.selectfromactivitystatusDropdown();


    }

    @Test(priority = 1)
    public void validateactivitystatusheading() {
        assertEquals(activitydetailpage.activitystatus(), ConstantUtils.activitystatusheading);
    }

    @Test(priority = 1)
    public void validateactivitystatusshown(){
        activitydetailpage.clicksave();
        assertTrue(activitydetailpage.getactivitystatus(),"Ït is not shown");
    }
    @Test(priority = 1)
     public void youractivities(){
        activitydetailpage.clickyouractivites();
        assertEquals(activitydetailpage.getheading(),ConstantUtils.dashboardheading);
     }
}

