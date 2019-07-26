package case4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/case4/case4.feature",plugin="json:target\\jsonreport.json")
public class case4Runner {

}
