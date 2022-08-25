package appiumConceptsUdemyLessons;

import static io.appium.java_client.touch.TapOptions.*; // for tapOptions() -> method under TouchAction object creation 
import static io.appium.java_client.touch.offset.ElementOption.element; // for element() -> method under TouchAction object creation

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions; //for longPressOptions() -> method under TouchAction object creation
import static java.time.Duration.ofSeconds; //for ofSeconds() -> method
import base.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class touchAction extends BaseClass {

	@Test
	public void tapOptionsMethods() throws Exception {

		AndroidDriver<AndroidElement> driver = capabilities();

		WebElement viewsOption = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		viewsOption.click();

		WebElement expandablesLists = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");

		TouchAction touchActns = new TouchAction(driver);
		touchActns.tap(tapOptions().withElement(element(expandablesLists))).perform();

		WebElement customAdapterOption = driver
				.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		customAdapterOption.click();

		WebElement pplNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touchActns.longPress(longPressOptions().withElement(element(pplNames)).withDuration(ofSeconds(2))).release()
				.perform();
	}

	@Test
	public void longPressMethod() throws Exception {
		AndroidDriver<AndroidElement> driver = capabilities();

	}
}
