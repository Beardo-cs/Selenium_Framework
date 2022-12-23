package testCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import  static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollIntoView {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RMX1851");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		dc.setCapability(MobileCapabilityType.NO_RESET, "true");
		String filename = "/home/qqa0407/eclipse-workspace/Appium9Jun2022/src/" + "testName" + ".jpg";
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(dc);
		TouchAction tc = new TouchAction(driver);
		AndroidElement viewFiles = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		//viewFiles.click();
		tc.tap(tapOptions().withElement(element(viewFiles))).perform();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(filename), true);	
		

	}

}
