package testCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import  static io.appium.java_client.touch.TapOptions.tapOptions;
import  static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.File;
import java.io.IOException;
import static java.time.Duration.ofSeconds;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RMX1851");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		dc.setCapability(MobileCapabilityType.NO_RESET, "true");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(dc);
		TouchAction tc = new TouchAction(driver);
		AndroidElement viewFiles = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		//viewsFile.click();
		tc.tap(tapOptions().withElement(element(viewFiles))).perform();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		
		AndroidElement number15 = driver.findElement(By.xpath("//*[@content-desc='15']"));
		AndroidElement number45 = driver.findElement(By.xpath("//*[@content-desc='45']"));
		tc.longPress(longPressOptions().withElement(element(number15)).withDuration(ofSeconds(2))).moveTo(element(number45)).release().perform();
		
		

	}

}
