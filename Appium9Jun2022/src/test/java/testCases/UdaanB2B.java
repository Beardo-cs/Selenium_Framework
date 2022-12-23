package testCases;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class UdaanB2B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"device");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage", "com.udaan.android");
		dc.setCapability("appActivity", "com.udaan.android.rn.MainActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(dc);
		Thread.sleep(5000);
		TouchAction tc = new TouchAction(driver);
		AndroidElement viewFiles = driver.findElement(By.linkText("English"));
		tc.tap(tapOptions().withElement(element(viewFiles))).perform();
        System.out.println("Application Started");

	}

}
