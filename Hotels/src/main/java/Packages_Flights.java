import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Packages_Flights extends CommonAPI {
    @FindBy(id = "package-advanced-preferred-class-hp-package")
    public static WebElement classtype;

    public void clickButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void enterText(String xpath, String text){
        WebElement e= driver.findElement(By.xpath(xpath));
        e.clear();
        e.sendKeys(text);
    }
    public void checkBox(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void selectclasstype(String value){
        Select cls= new Select(classtype);
        cls.selectByValue(value);
    }

}
