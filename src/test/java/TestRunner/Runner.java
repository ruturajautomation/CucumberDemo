package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 @Deprecated
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/Pranay/eclipse-workspace/DemoNew/src/main/java/Seleniumdemo/Features/Login.feature"
		,glue={"StepDefinition"},  
		format= {"pretty","junit:junit_xml/cucumber.xml","html:test-output"},
		strict=true ,
		monochrome =true ,
		dryRun = false
		)
 

public class Runner {

}
 
