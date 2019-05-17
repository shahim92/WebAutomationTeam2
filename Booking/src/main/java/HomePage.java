import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id='question']")
    public static WebElement question;

    public void clickSmallBusiness(){
        driver.findElement(By.linkText("Small Business")).click();
        String expectedUrl="https://www.tdbank.com/net/selectstate.aspx?ref=/net/small_business.aspx";
        if(expectedUrl.equalsIgnoreCase(driver.getCurrentUrl()))
            System.out.println(" small buisness passed");
        else System.out.println("small buisness failed");

    }
    public void clickcommercial(){
        driver.findElement(By.linkText("Commercial")).click();
        String expectedUrl="https://www.tdbank.com/net/corporate_services.aspx";
        if(expectedUrl.equalsIgnoreCase(driver.getCurrentUrl()))
            System.out.println(" commercial passed");
        else System.out.println("commercial failed");

    }
    public void clickInvestingWealth(){
        driver.findElement(By.linkText("Investing & Wealth")).click();
        String expectedUrl="https://www.td.com/us/en/investing/";
        if(expectedUrl.equalsIgnoreCase(driver.getCurrentUrl()))
            System.out.println(" Investing and wealth passed");
        else System.out.println("Investing and walth failed");

    }
    public void ask(){
        question.sendKeys("what");
    }

}
