package mybdcrunner;


import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_b6b.01.07\\Desktop\\week3\\MyDemo_01_Cucumber\\features888\\bdc_01.feature",glue="bdcstepdefinitions",
plugin= {"pretty","html:target/cucumber-html-report,"
		"json:target/ShanDemo-JSON-report"})
public class BDCRunner {

}
