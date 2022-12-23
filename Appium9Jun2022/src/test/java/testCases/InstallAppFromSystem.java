package testCases;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAppFromSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fs = new File("src/main/java/QACapital/Appium9Jun2022/");
		File file = new File(fs, "original.apk");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability("appWaitDuration", 3000);
		
		dc.setCapability(MobileCapabilityType.APP,file.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(dc);

	}

}
