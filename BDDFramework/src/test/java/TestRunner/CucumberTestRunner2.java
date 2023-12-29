package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke and @regression and not@performance", 
features = {"/src/test/resources/FeatureWithTag"},
glue= {"StepDefinations"}, 
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunner2 extends AbstractTestNGCucumberTests {

}
 