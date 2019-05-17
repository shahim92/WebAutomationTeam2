import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends CommonAPI {

    @FindBy(id="qf-0q-compact-occupancy")
    public static WebElement rooms;


    public void clickMenuLink(String linktext,String expectedUrl){
       driver.findElement(By.linkText(linktext)).click();
       if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl))
           System.out.println(linktext+" Url is passed");
         else  System.out.println(linktext+" Url is failed");
    }
    public void clickButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
   public void enterText(String xpath, String text){
       WebElement e= driver.findElement(By.xpath(xpath));
       e.clear();
        e.sendKeys(text);
   }
   public void selectroom(String value){
       Select room= new Select(rooms);
       room.selectByVisibleText(value);
   }





}
