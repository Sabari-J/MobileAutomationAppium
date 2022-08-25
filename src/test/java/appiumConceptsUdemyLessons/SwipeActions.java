package appiumConceptsUdemyLessons;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions; //for longPressOptions() -> method under TouchAction object creation
import static io.appium.java_client.touch.offset.ElementOption.element; // for element() -> method under TouchAction object creation
import static java.time.Duration.ofSeconds;

public class SwipeActions extends BaseClass {

	@Test
	public void swippingActions() throws Exception {

		AndroidDriver<AndroidElement> driver = capabilities();

		WebElement viewsOption = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		viewsOption.click();

		WebElement dateWidgetsOption = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Date Widgets\")"));
		dateWidgetsOption.click();

		WebElement inlineOption = driver.findElement(MobileBy.AndroidUIAutomator("text(\"2. Inline\")"));
		inlineOption.click();

		WebElement clickOnNumber = driver.findElementByXPath("//*[@content-desc = '9']");
		clickOnNumber.click();

		// Swipe Mechanism
		TouchAction touchActn = new TouchAction(driver);

		WebElement sourceNumber = driver.findElementByXPath("//*[@content-desc = '15']");

		WebElement DestinationNumber = driver.findElementByXPath("//*[@content-desc = '45']");

		touchActn.longPress(longPressOptions().withElement(element(sourceNumber)).withDuration(ofSeconds(2)))
				.moveTo(element(DestinationNumber)).release().perform();

	}

}
