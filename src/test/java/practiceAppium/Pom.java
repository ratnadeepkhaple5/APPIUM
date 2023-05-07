package practiceAppium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class Pom {

	AppiumDriver driver;
	@FindBy(xpath ="//*[@resource-id='io.appium.android.apis:id/gallery']/android.widget.ImageView")
	private WebElement allimages;
	
	public Pom(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getAllimages() {
		return allimages;
	}
	
}
