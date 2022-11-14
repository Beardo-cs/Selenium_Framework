package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics4 {
	
	@Test
	public void MobileLoginPersonalloan() {
		System.out.println("It is a MobileLoginPersonalloan");
	}
	@Test
	public void WebLoginPersonalloan() {
		System.out.println("It is a WebLoginPersonalloan");
	}
	@Parameters({"URL","API"})
	@Test
	public void APILoginPersonalloan(String urlname,String api) {
		System.out.println("It is a APILoginPersonalloan");
		System.out.println(urlname);
		System.out.println(api);
	}

}
