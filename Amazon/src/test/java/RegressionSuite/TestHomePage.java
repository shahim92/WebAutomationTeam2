package RegressionSuite;

import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends HomePage {

    @Test
    public void loginWithValidPass() {
        clickAccount();
        writePass();
        writeUsername("user");

    }

    @Test
    public void loginWithInvalidPass() {
        clickAccount();
        writePass();
        writeUsername("user");
    }
}
