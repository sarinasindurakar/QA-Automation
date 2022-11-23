package IATI.test;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ActivityTest extends BaseTest {
    @Test(priority = 1)
    public void  TestAddActivity() throws InterruptedException {
       loginPage.setUsername("testautomate");
        loginPage.setPassword("12345678");
      loginPage.clickloginbutton();
        Thread.sleep(3000);
        dashboard.addactivity();
        dashboard.setAddmanuallybutton();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void activityform() throws InterruptedException {
        activitypage.setNarrative(fakedata.book().title());
        Thread.sleep(3000);
        activitypage.setActivityidentifier(fakedata.address().buildingNumber());
        activitypage.clicksavebutton();
        Thread.sleep(4000);
    }


    /*
    @Test(priority = 2)
    public void validateactivity (){
        assertEquals(accpgae.activityname(), ConstantUtils.activityname);
   }

     */

}
