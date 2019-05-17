import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@class='xpb__link']")
    public static WebElement flights;

    @FindBy(linkText = "//a[text()='Flight + Hotel']")
    public static WebElement flighthotel;


    public void clickMenuLink(String linktext,String expectedUrl){
       driver.findElement(By.linkText(linktext)).click();
       if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl))
           System.out.println(linktext+" Url is passed");
         else  System.out.println(linktext+" Url is failed");
    }
    public void clickMenuButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }






}
