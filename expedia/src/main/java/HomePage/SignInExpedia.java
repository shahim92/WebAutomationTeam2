package HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInExpedia {
    @FindBy(id = "//input[@id='gss-signin-email']")
    WebElement email;

    @FindBy (id = "//input[@id='gss-signin-password']")
    WebElement password;

     @FindBy(xpath = "//button[@id='gss-signin-submit']")
    WebElement signinbutton;
     @FindBy(xpath = "//a[@id='gss-go-to-forgot-password']")
     WebElement forgetpasswordbutton;

     public void gotoSignInPage()

     {
         driver.navigate().to("https://www.expedia.com/");
         SignInExpedia.click();
     }

     public void signIn(String username, string password)
     {
         email.sendKeys(username);
         password.sendKeys(password);
         sleepFor(Second 10);
         signinbutton.click();

     }
     public void CheckForgetPassword()
     {
         forgetpasswordbutton.click();
     }


}
