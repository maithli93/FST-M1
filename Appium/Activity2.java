package AppiumActivities;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	 // Declare Android driver
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException, InterruptedException {
    	 DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "<Your device name>");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("appPackage", "com.android.chrome");
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<>(appServer, caps);
	        wait = new WebDriverWait(driver, 10);

	        // Navigate to the page
	        driver.get("https://www.training-support.net/");
	        Thread.sleep(10000);
	    }
	    

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(10000);
        String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
    	System.out.println("Title on Homepage: " + pageTitle);
    	
    	// Find About Us button and click it
    	MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@text='About Us']");
    	aboutButton.click();
    	
        // Wait for new page to load
    	wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@text='About Us']")));
    	
        // Get heading on About Us page and print it
    	String newPageTitle = driver.findElementByXPath("//android.view.View[@text='About Us']").getText();
    	System.out.println("Title on new page: " + newPageTitle);
    	
        // Assertions
    	Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    	
        }
    	 @AfterTest
        public void tearDown() {
    	driver.quit();
    	
        }
    }
    
	
