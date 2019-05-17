import base.CommonAPI;
import org.openqa.selenium.By;
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
    }
  @Test(priority = 2)
  public void testFlightHotelButton(){
      pf.clickButton("//*[@id='tab-package-tab-hp']");
      pf.enterText("//*[@id='package-origin-hp-package']","New York, NY (JFK-John F. Kennedy Intl.)");
      pf.enterText("//*[@id='package-destination-hp-package']","Algiers, Algeria");
      pf.enterText("//*[@id='package-departing-hp-package']","12/03/2019");
      pf.enterText("//*[@id='package-returning-hp-package']","02/03/2020");
      pf.clickButton("//*[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']");
      if(driver.findElement(By.xpath("//*[@class='traveler-selector-room-data target-clone-field']")).isDisplayed())
          System.out.println("displayed");
      pf.checkBox("//*[@id='partialHotelBooking-hp-package']");
      pf.selectclasstype("f");
      pf.clickButton("//*[@id='search-button-hp-package']");
      sleepFor(4);
  }

  @Test(priority = 4)
    public void testimglinkTodaysTopDeal(){
      pf.imglink("//a[@href='https://travel.hotels.com/g/dd/dailydeals?langid=1033?MDPCID=HCOM-US.TPS.BRAND.DailyPackageDeals.PACKAGE']");
      sleepFor(4);
  }

  @Test(priority = 5)
    public void testimglinknypackages(){
      pf.imglink("//a[@href='https://travel.hotels.com/g/pt/nychighgateoct2018?langid=1033?MDPCID=HCOM-US.TPS.BRAND.NYCHighGate.PACKAGE']");
      sleepFor(2);
  }

  @Test(priority = 6)
    public void testimglinkThingstdinvegas(){
      pf.imglink("//a[@href='http://travel.hotels.com/things-to-do/?location=Las%20Vegas,%20Nevada']");
  }**/
    //Explore morelinks
  @Test(priority = 7)
    public void testTop50cities(){
        pf.clickLink("Top 50 Cities","https://www.hotels.com/alltop50cities/");
        sleepFor(1);
  }
  @Test(priority = 8)
    public void testAllcontries(){
      pf.clickLink("All countries","https://www.hotels.com/allcountries/");
      sleepFor(1);
  }
    @Test(priority = 9)
    public void testAllHotel(){
        pf.clickLink("All hotels","https://www.hotels.com/");
        sleepFor(1);
    }
    @Test(priority = 10)
    public void testHotels(){
     pf.clickLink("Hotels","https://www.hotels.com/");
     sleepFor(1);
    }
    @Test(priority = 11)
    public void testTravelGuide(){
      pf.clickLink("Travel Guides","http://www.hotels.com/articles/");
      sleepFor(1);
    }
  @Test(priority = 12)
    public void testTravelBlog(){
      pf.clickLink("Travel Blog","http://www.hotels.com/blog/");
      sleepFor(1);
  }
  @Test(priority = 13)
    public void testAboutUs(){
      pf.clickLink("About Us","http://www.hotels.com/customer_care/about_us.html");
      sleepFor(1);
  }
  @Test(priority = 14)
    public void testContactUs(){
      pf.clickLink("Contact Us","http://customercare.hotels.com/app/home/locale/en_US");
      sleepFor(1);
  }




}
