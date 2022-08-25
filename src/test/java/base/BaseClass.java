package base;

import java.net.URL;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class BaseClass {

	AndroidDriver<AndroidElement> driver;

	@Test
	public AndroidDriver<AndroidElement> capabilities() throws Exception {

		// AndroidDriver<AndroidElement> driver;

		DesiredCapabilities desiredCap = new DesiredCapabilities();
		desiredCap.setCapability("app",
				"C:\\Users\\sabareesan.j\\Downloads\\UDEMY- APPIUM_Mobile Automation\\Basic\\ApiDemos-debug.apk");
		desiredCap.setCapability("deviceName", "SABARI_Pixel XL API 30");
		desiredCap.setCapability("automationName", "uiautomator2");

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCap);
		System.out.println("DesiredCapabilities setup - Success");
		return driver;

	}

}
