package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics1 {
	@BeforeClass 
	public void bfclass(){
		System.out.println("okay then enter into the class");
	}
	 @AfterClass
	public void afclass(){
		System.out.println("okay then last class");
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("It is the TestNG framework which use Java as a compiler");
//
//	}
	
	//If we remove main method and use Test annotation to run the Java program that time TestNG will run as compiler
	@AfterTest
	public void demo() {
		System.out.println("Now TestNG will act as a complier without Main method.");
	}

	@AfterSuite
	public void afsuite() {
		System.out.println("I'm the last one");
	}
	@BeforeMethod
	public void bfmethos() {
		System.out.println("It is the first method");
	}
	@Parameters({"URL","API"})
	@AfterMethod
	public void afmethod(String urlname,String api) {
		System.out.println("It is a Last method");
		System.out.println(urlname);
		System.out.println(api);
	}
	@Test(groups= {"smoke"})
	public void secondTest() {
		System.out.println("The second one Test cases and sanity group");
	}
	@Test(dependsOnMethods= {"secondTest"},timeOut=4000)
	public void thirdTest() {
		System.out.println("The third one Test cases");
	}
}
