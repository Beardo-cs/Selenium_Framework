package testCases;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        DesiredCapabilities dc = new DesiredCapabilities();
				
				dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
				dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
				dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RMX1851");
				dc.setCapability(MobileCapabilityType.UDID,"1e9dd3ae");
				dc.setCapability("appPackage", "com.coloros.calculator");
				dc.setCapability("appActivity", "com.android.calculator2.Calculator");
				dc.setCapability(MobileCapabilityType.NO_RESET, "true");
				
				AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(dc);
		        System.out.println("Application Started");
			

		


	}

}
