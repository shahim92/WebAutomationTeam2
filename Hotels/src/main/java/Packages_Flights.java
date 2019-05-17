import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Packages_Flights extends CommonAPI {

    public void clickButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void enterText(String xpath, String text){
        WebElement e= driver.findElement(By.xpath(xpath));
        e.clear();
        e.sendKeys(text);
    }

}
