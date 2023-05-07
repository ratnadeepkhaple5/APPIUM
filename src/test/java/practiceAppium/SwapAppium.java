package practiceAppium;

import java.awt.ComponentOrientation;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwapAppium {

	@Test
	public void ApiDemoSwipe() throws Exception {

		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iQOO 7");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "3084601242000P3");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability(MobileCapabilityType.ORIENTATION, "landscape");
		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		URL url =new URL("http://localhost:4723/wd/hub");

		AppiumDriver driver=new AppiumDriver(url, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();

		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

		Thread.sleep(2000);
		 List<WebElement> imageLf = driver.findElements(AppiumBy.xpath("//*[@resource-id='io.appium.android.apis:id/gallery']/android.widget.ImageView"));
		
		 Iterator<WebElement> its = imageLf.iterator();
		while (its.hasNext()) {
				// Java
				(driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
						  "left", 378, "top", 542, "width", 353, "height", 242,
						"elementId", ((RemoteWebElement) its.next()).getId(),	
						"direction", "left",
						"percent", 0.50
						));
		}
//				Thread.sleep(4000);
//				WebElement imageRt = driver.findElement(By.xpath("//android.widget.Gallery[@resource-id='io.appium.android.apis:id/gallery']/android.widget.ImageView[3]"));
//				// Java
//				(driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//					//	  "left", 378, "top", 542, "width", 353, "height", 242,
//						"elementId", ((RemoteWebElement) imageRt).getId(),	
//						"direction", "right",
//						"percent", 0.75
//						));
		
	}
}
