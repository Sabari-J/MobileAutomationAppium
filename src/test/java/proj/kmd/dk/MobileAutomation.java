package proj.kmd.dk;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MobileAutomation {

	@Test
	public void runMobile() throws Exception {
		System.out.println("**MobileAutomation**");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		AndroidDriver<AndroidElement> driver;

		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("deviceName", "SABARI_Pixel XL API 30");
		capabilities.setCapability("app",
				"C:\\Users\\sabareesan.j\\Downloads\\Mobile_Automation\\dk.kmd.workzoneApp\\dk.kmd.workzone.apk");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appActivity", "crc64f9cef9d04ec7dcb0.MainActivity");
		capabilities.setCapability("appPackage", "dk.kmd.workzone");
		capabilities.setCapability("automationName", "uiautomator2");
		// capabilities.setCapability("noReset", "true");
		// capabilities.setCapability("fullReset", "false");
		// capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
		capabilities.setCapability("autoGrantPermissions", "true");

		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		System.out.println("Success");
		// LoginPage
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("abcd");
		// Library.SendData(LoginPage.serverUrl,
		// ReadTestData.testData("Loginpage.url"));
		// Library.Click(LoginPage.Next);
	}

}
