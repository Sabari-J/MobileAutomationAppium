package appiumConceptsUdemyLessons;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomator extends BaseClass {

	@Test
	public void uiAutomatorMethods() throws Exception {

		AndroidDriver<AndroidElement> driver = capabilities();

		//Method 1
		int noOfClickableItems = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)")).size();
		System.out.println(noOfClickableItems);
		
		//Method 2
		WebElement prefOption = driver.findElementByAndroidUIAutomator("text(\"Preference\")");
		prefOption.click();

		WebElement prefDependenciesOption = driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']");

		prefDependenciesOption.click();

		WebElement wifiCheckbox = driver.findElementById("android:id/checkbox");
		wifiCheckbox.click();

		// Alternative -->
		// driver.findElementsByXPath("android.widget.RelativeLayout").get(2);
		WebElement wifiSettings = driver.findElementByXPath("(//android.widget.RelativeLayout)[2]");
		wifiSettings.click();

		WebElement wifiTextbox = driver.findElementById("android:id/edit");
		wifiTextbox.sendKeys("SABARI");

		WebElement wifiSettingsButton = driver.findElementById("android:id/button1");
		wifiSettingsButton.click();

	}
}
