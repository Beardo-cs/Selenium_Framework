package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//cucumber -> TestNG, Junit
//like groups it is tags testng for running the feature file
//testNG assertion is used, go ahead with TESTNGRUNNER
@CucumberOptions(features="src/test/java/Cucumber",glue="Newselenium.stepDefinition",tags="@Regression",monochrome=true,plugin= {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	//tags = @Tagname in feature file
	//previously it is tag2 or tag 1
	

}
