package IATI.test;

import Base.BaseTest;
import Utils.ConstantUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HeaderTest extends BaseTest {
    @Test(priority = 2)
    public void TestHeader() throws InterruptedException {
       // Thread.sleep(3000);
       // headerPage.hoveroverelment();
       headerPage.publishingchecklist();

    }
    @Test(priority = 1)
    public void testAbout(){
        headerPage.about();
    }
    @Test(priority = 1)
    public void validateAbout(){
        assertEquals(headerPage.gettext(),ConstantUtils.aboutus);
    }
    @Test(priority = 2)
    public void validatingpublishing(){
       assertEquals(headerPage.gettext(),ConstantUtils.publishing);
    }
    @Test(priority = 3)
    public void testiati(){
        headerPage.iati();
    }
    @Test(priority = 3)
    public void validateiati(){
        assertEquals(headerPage.gettext(),ConstantUtils.Iatistandard);
    }
    @Test(priority = 4)
    public void testsupport(){
        headerPage.support();
    }
    @Test(priority = 4)
    public void validatesupport(){
        assertEquals(headerPage.gettext(),ConstantUtils.support);
    }





}
