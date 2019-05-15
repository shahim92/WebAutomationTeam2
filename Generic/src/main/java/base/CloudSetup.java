package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudSetup {

    public static final String USERNAME = "zan14";
    public static final String AUTOMATE_KEY = "Fs7PJAifzJnzs8dFMNxx";
    public static final String BROWSERSTACK_URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final String SAUCE_URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("name", "Cloud Execution - 2");
        capabilities.setCapability("browser", "Chrome");
        capabilities.setCapability("browser_version", "74.0");
        capabilities.setCapability("os", "OS X");
        capabilities.setCapability("os_version", "Mojave");
        capabilities.setCapability("resolution", "1024x768");

        WebDriver driver = new RemoteWebDriver(new URL(BROWSERSTACK_URL), capabilities);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }

}
