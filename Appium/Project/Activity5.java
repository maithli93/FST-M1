package ProjectActivities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity5 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	String msg;
	MobileElement expmsg;

	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "<Your device name>");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<>(appServer, caps);
		wait = new WebDriverWait(driver, 10);

		driver.get("https://www.training-support.net/selenium");
		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement login = driver.findElementByXPath("//android.view.View[6]/android.view.View");

		for (int i = 0; i < 2; i++) {
			driver.findElement(
					MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));

		}

		login.click();
	}

	@Test(priority = 0)
	public void validCredentials() throws InterruptedException {

		MobileElement username = driver.findElementByXPath(
				"//android.view.View[@text='Username']/following-sibling::android.widget.EditText[1]");
		username.sendKeys("admin");
		Thread.sleep(5000);
		MobileElement password = driver.findElementByXPath(
				"//android.view.View[@text='Password']/following-sibling::android.widget.EditText[1]");
		password.sendKeys("password");
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
		expmsg = driver.findElementByXPath("//android.view.View[@text='Welcome Back, admin']");
		Assert.assertEquals(expmsg.getText(), "Welcome Back, admin");

	}

	@Test(priority = 1)
	public void invalidCredentials() throws InterruptedException {

		MobileElement username = driver.findElementByXPath(
				"//android.view.View[@text='Username']/following-sibling::android.widget.EditText[1]");
		username.sendKeys("admin123");
		Thread.sleep(5000);
		MobileElement password = driver.findElementByXPath(
				"//android.view.View[@text='Password']/following-sibling::android.widget.EditText[1]");
		password.sendKeys("password123");
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
		expmsg = driver.findElementByXPath("//android.view.View[@text='Invalid Credentials']");
		Assert.assertEquals(expmsg.getText(), "Invalid Credentials");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
