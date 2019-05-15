package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.CheckingAcc;
import regression.HomePage;

public class TestPOM extends CommonAPI {

    HomePage homePage;
    CheckingAcc checkingAcc;
    @BeforeMethod
    public void init(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        checkingAcc = PageFactory.initElements(driver,CheckingAcc.class);
    }

    @Test
    public void careers() {
        homePage.clickCareers();
    }
}
