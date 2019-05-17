import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void SBbutton(){
        homePage.ask();
        sleepFor(6);
    }

    @Test(priority = 2)
    public void CommercialButton(){
        homePage.clickcommercial();
        sleepFor(4);
    }
}
