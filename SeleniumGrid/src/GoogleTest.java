import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class GoogleTest {
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setBrowserName("chrome");
//	caps.setPlatform(Platform.windows);
//	caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);

			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.81.18:4444"), caps); // portno and IPwhere
																								// hub present

}
