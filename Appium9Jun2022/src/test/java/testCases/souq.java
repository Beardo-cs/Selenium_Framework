package testCases;


import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class souq {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		


		        DesiredCapabilities dc = new DesiredCapabilities();
				
				dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
				dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
				dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Infinix");
				dc.setCapability(MobileCapabilityType.UDID,"05265320A1001770");
				dc.setCapability("appPackage", "com.marwaeltayeb.souq");
				dc.setCapability("appActivity", "com.marwaeltayeb.souq.view.SplashActivity");
				dc.setCapability(MobileCapabilityType.NO_RESET, "true");
				
				AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(dc);
				Thread.sleep(1000);
//				TouchAction tc = new TouchAction(driver);
//				AndroidElement viewFiles = driver.findElement(By.xpath("//*[@resource-id='com.marwaeltayeb.souq:id/textViewSignUp']"));
//				//viewFiles.click();
//				tc.tap(tapOptions().withElement(element(viewFiles))).perform();
				driver.findElement(By.xpath("//*[@resource-id='com.marwaeltayeb.souq:id/textViewSignUp']")).click();
		        System.out.println("Application Started");
			

		


	}

}
