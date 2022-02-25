package ProjectActivities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 {
	// Declare Android driver
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void addKeepNote() throws InterruptedException {
    	MobileElement addNoteButton= driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"New text note\"]");
    	addNoteButton.click();
    	Thread.sleep(5000);
    	driver.findElementByXPath("//android.widget.EditText[@text=\"Title\"]").sendKeys("Add Notes");
    	Thread.sleep(5000);
    	driver.findElementByXPath("//android.widget.EditText[@text=\"Note\"]").sendKeys("Keep adding notes here!");
    	Thread.sleep(5000);
    	driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Reminder\"]").click();
    	Thread.sleep(5000);
    	driver.findElementByXPath("//android.widget.TextView[@text=\"Later today\"]").click();
    	
    	String reminder=driver.findElementById("reminder_chip").getText();
    	Assert.assertEquals(reminder, "Today, 6:00 PM");
      
    	
    }
}
