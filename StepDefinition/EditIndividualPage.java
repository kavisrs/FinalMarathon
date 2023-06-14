package StepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditIndividualPage extends BaseClass {
	
	public String fName;
	
	@And("Select the salutation as Mr")
	public EditIndividualPage selectSalutationAsMR() {
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
		return this;
	}
	
	@Given("Enter the firstname as (.*)$")
	public EditIndividualPage enterTheFirstname(String fName) {
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys(fName);
		return this;
	}
	
	@When("Click on Save in Edit individual screen")
	public IndividualsHomePage clickOnSaveEditIndividualScreen() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return new IndividualsHomePage();
	}
}
