package appiumConceptsUdemyLessons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends BaseClass {

	@Test
	public void dragAndDropmethod() throws Exception {
		AndroidDriver<AndroidElement> driver = capabilities();

		WebElement viewsOption = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		viewsOption.click();

		WebElement dragandDrop = driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")");
		dragandDrop.click();
		
		WebElement
		
		TouchActions touchActns = new TouchActions(driver);
		
		
	}
}
