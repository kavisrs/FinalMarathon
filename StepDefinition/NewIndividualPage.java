package StepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NewIndividualPage extends BaseClass{

	@Given("Enter the Lastname as (.*)$")
	public NewIndividualPage enterLastName(String lName) {
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lName);
		return this;
	}

	@When("Click on Save in the new Individual add screen")
	public IndividualsHomePage clickSaveinAddIndividual() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return new IndividualsHomePage();

	}
}

