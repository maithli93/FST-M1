package ProjectActivities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	
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
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void addTask() throws InterruptedException {
     MobileElement newTask=driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]");
     newTask.click();
       Thread.sleep(5000);
       driver.findElementByXPath("//android.widget.EditText[@text=\"New task\"]").sendKeys("Complete Activity with Google Tasks\r\n"
       		+ "");
       driver.findElementById("add_task_done").click();
       Thread.sleep(5000);
       newTask.click();
       Thread.sleep(5000);
       driver.findElementByXPath("//android.widget.EditText[@text=\"New task\"]").sendKeys("Complete Activity with Google Keep\r\n"
            + "");
       Thread.sleep(5000);
       driver.findElementById("add_task_done").click();
       Thread.sleep(5000);
       newTask.click();
       Thread.sleep(5000);
       driver.findElementByXPath("//android.widget.EditText[@text=\"New task\"]").sendKeys("Complete the second Activity Google Keep\r\n"
               + "");
       driver.findElementById("add_task_done").click();
       Thread.sleep(5000);
        
       String task1=driver.findElementByXPath("//android.widget.TextView[@text=\"Complete the second Activity Google Keep\"]").getText();
       String task2=driver.findElementByXPath("//android.widget.TextView[@text=\"Complete Activity with Google Keep\"]").getText();
       String task3=driver.findElementByXPath("//android.widget.TextView[@text=\"Complete Activity with Google Tasks\"]").getText();
       
       Assert.assertEquals(task1, "Complete the second Activity Google Keep");
       Assert.assertEquals(task2, "Complete Activity with Google Keep");
       Assert.assertEquals(task3, "Complete Activity with Google Tasks");
         
    }

 
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

