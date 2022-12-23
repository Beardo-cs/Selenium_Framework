package testCases;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Zepto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"device");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage", "com.zeptoconsumerapp");
		dc.setCapability("appActivity", "com.zeptoconsumerapp.MainActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(dc);
		Thread.sleep(5000);
		TouchAction tc = new TouchAction(driver);
		AndroidElement enterMob = driver.findElement(By.xpath("*android.widget.EditText"));
		//tc.tap(tapOptions().withElement(element(enterMob))).perform();
		enterMob.sendKeys("9944181956");
		AndroidElement cont = driver.findElement(By.linkText("Continue"));
		tc.tap(tapOptions().withElement(element(cont))).perform();
        System.out.println("Application Started");

	}

}
