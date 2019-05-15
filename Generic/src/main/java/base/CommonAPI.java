package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static final String USERNAME = "zan14";
    public static final String AUTOMATE_KEY = "Fs7PJAifzJnzs8dFMNxx";
    public static final String BROWSERSTACK_URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final String SAUCE_URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static WebDriver driver = null;


    @Parameters({"platform", "url", "browser", "cloud", "browserVersion"})
    @BeforeMethod
    public static WebDriver setupDriver(String platform, String url, String browser, boolean cloud, String browserVersion) throws MalformedURLException {
        if (cloud) {
            driver = getCloudDriver(url, browser, browserVersion, platform);
        } else {
            driver = getLocalDriver(url, browser, platform);
        }
        driver.get(url);
        return driver;
    }


    public static WebDriver getCloudDriver(String url, String browser, String browserVersion, String platform) throws MalformedURLException {

        //if saucelabs -- write code


        //if browserstack -- below :
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("name", "Cloud Execution");
        capabilities.setCapability("browser", browser);
        capabilities.setCapability("browser_version", browserVersion);
        capabilities.setCapability("os", platform);
        capabilities.setCapability("os_version", "Mojave");
        capabilities.setCapability("resolution", "1024x768");
        WebDriver driver = new RemoteWebDriver(new URL(BROWSERSTACK_URL), capabilities);
        return driver;
    }

    public static WebDriver getLocalDriver(String url, String browser, String platform) {
        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/drivers/chromedriver");
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/drivers/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }


    public static void getScreenshot(WebDriver driver) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        String name = df.format(date);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/screenshots/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void quitDriver() {
        driver.close();
        driver.quit();
    }

    public void sleepFor(int Seconds) {
        try {
            Thread.sleep(Seconds * 1000);
        } catch (Exception e) {
        }
    }
}
