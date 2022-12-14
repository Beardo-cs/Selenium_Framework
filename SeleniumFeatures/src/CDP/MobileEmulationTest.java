package CDP;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileEmulationTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devtools = driver.getDevTools();
		
		devtools.createSession();
		
		devtools.send(Emulation.setDeviceMetricsOverride(500, 100, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Library']")).click();

	}

}
