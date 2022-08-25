package appiumConceptsUdemyLessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingToElement extends BaseClass {

	@Test
	public void scrollingMethod() throws Exception {
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement viewsOption = driver.findElementByAndroidUIAutomator("text(\"Views\")");
				
				//.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")"));
					viewsOption.click();

		WebElement webViewOption = driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");

	}
}
