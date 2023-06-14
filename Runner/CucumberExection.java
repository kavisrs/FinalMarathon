package Runner;

import StepDefinition.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/features",
				glue="StepDefinition",
				monochrome=true,
				publish=true)
public class CucumberExection extends BaseClass{
	
}
