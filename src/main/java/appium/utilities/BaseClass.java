package appium.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public AndroidDriver driver;

	@BeforeSuite
	public void beforeConfiguration() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iQOO 7");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "3084601242000P3");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		URL url =new URL("http://localhost:4723/wd/hub");

		driver=new AndroidDriver(url, desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
