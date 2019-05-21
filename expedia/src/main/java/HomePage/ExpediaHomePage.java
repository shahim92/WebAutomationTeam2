package HomePage;

import base.CommonAPI;
import com.sun.org.apache.xpath.internal.XPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpediaHomePage extends CommonAPI {

  @FindBy (xpath = "//*[@id="tab-flight-tab-hp"]/span[2])
   WebElement FlightButton;

    public void CheckFlightButton()
    {

    }

  @FindBy (XPath = "//*[@id=\"tab-hotel-tab-hp\"]/span[1]/span")
  WebElement ExpediaHomePageHotelButton;
  public void setExpediaHomePageHotelButton()
  {
    driver.navigate().to(https://www.expedia.com/);
    ExpediaHomePageHotelButton.click();
  }


}
