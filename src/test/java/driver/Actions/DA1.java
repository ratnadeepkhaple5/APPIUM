package driver.Actions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import appium.utilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class DA1 extends BaseClass{
	
	@Test
	public void actions() throws InterruptedException {
		Thread.sleep(3000);
		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();
		//terminate app
		driver.terminateApp("io.appium.android.apis");
		
		//install app
		driver.installApp("‪F:\\APPIUM\\ApiDemos-debug.apk");
		
		//run app in background
		driver.runAppInBackground(Duration.ofSeconds(10));
		System.out.println(driver.queryAppState("Api demos="+"io.appium.android.apis"));
		
		//activate other app
		driver.activateApp("put app package here");
		System.out.println(driver.queryAppState("Api demos="+"io.appium.android.apis"));
	}

}
