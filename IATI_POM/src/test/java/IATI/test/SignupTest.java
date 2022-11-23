package IATI.test;

import Base.BaseTest;
import Pages.AdminInfoPage;
import Pages.SignupPage;
import Utils.ConstantUtils;
import Utils.JavaExecutorUtils;
import io.netty.util.Constant;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {
    @Test
    public void  testSignup() throws InterruptedException {
      SignupPage Sn= loginPage.clicksignupbutton();
      Thread.sleep(3000);
      Sn.clickregister();

      Sn.fillPublisherform("AIDSPAN","aidspan","32-0060251");

      Sn.finddropdownelement();
      Sn.selectFromDropDown();

      Thread.sleep(5000);
      //Adminform

      //AdminInfoPage admin=Sn.clicknextstep();
     // Thread.sleep(3000);
      //admin.setform("Hello","testautomate","shakyaanjana82@gmail.com","12345678","12345678");
     // admin.clickbutton();


    }

}
