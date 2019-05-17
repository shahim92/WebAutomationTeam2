import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPackages_Flights extends CommonAPI {
    Packages_Flights pf;
    @BeforeMethod
    public void init(){
        pf= PageFactory.initElements(driver, Packages_Flights.class);
        driver.navigate().to("https://travel.hotels.com/?intlid=HOME+%3A%3A+header_main_section");
    }

  /**
    @Test(priority = 1)
    public void testFlightOnlyButton(){
        pf.clickButton("//*[@id='tab-flight-tab-hp']");
        sleepFor(2);
    }

    @Test(priority = 3)
    public void testThigsTodoButton(){
        pf.clickButton("//*[@id='tab-activity-tab-hp']");
        sleepFor(2);
    }**/
  @Test(priority = 2)
  public void testFlightHotelButton(){
      pf.clickButton("//*[@id='tab-package-tab-hp']");
      pf.enterText("//*[@id='package-origin-hp-package']","jfk");
      pf.enterText("//*[@id='package-destination-hp-package']","Algiers");
      sleepFor(2);
  }
}
