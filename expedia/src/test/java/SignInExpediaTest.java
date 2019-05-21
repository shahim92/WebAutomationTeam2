import HomePage.SignInExpedia;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInExpediaTest {

    SignInExpedia sign;
    @BeforeTest
    public void initializationSignInPage()
    {
       sign = PageFactory.initElements(driver,SignInExpedia.class);
    }
    @Test
    public void gotoSignInPageTest()
    {
        sign.gotoSignInPage();
    }

    @Test
    public void signinValidTest()
    {
        sign.gotoSignInPage();
        sign.signIn("sam@gamil.com","sam1234546");
        sleepFor(Second 10);
    }
    @Test
    public void signinValidTest()
    {
        sign.gotoSignInPage();
        sign.signIn("tim@gmail.com","tim12345");

    }
    @Test
    public void CheckForgetPasswordTest()
    {
        sign.gotoSignInPage();
        sign.CheckForgetPassword();
    }



}
