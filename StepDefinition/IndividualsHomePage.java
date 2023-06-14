package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualsHomePage extends BaseClass {

	@And("Click on Dropdown icon in the Individuals tab")
	public IndividualsHomePage individualsDropdownIcon() {
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none'])[15]")).click();
		return this;
	}

	@And("Click on New Individual")
	public NewIndividualPage clickOnNewIndividual() {
		WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
		driver.executeScript("arguments[0].click();", clk);
		return new NewIndividualPage();

	}

	@Then("Verify Individual created as (.*)$")
	public IndividualsHomePage verifyIndividualCreated(String lName) {
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(message);
		//verify Individuals Name
		if (message.contains(lName)) {
			System.out.println("Individual Created");
		}
		else {
			System.out.println("Individual not created");
		}
		return this;
	}

	@Given("Enter data in the searchbox - Individuals tab as (.*)$")
	public IndividualsHomePage enterDataInSearchBox(String lName) {
		WebElement name =driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys(lName);
		name.sendKeys(Keys.ENTER);
		return this;
	}
	@When("Click on dropdown icon against first displayed name")
	public void clickOnDropdownAgainstFirstDisplayedName() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
	}
	@And("Select the option Edit")
	public EditIndividualPage selectTheOptionEdit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		return new EditIndividualPage();
	}
	
	@Then("Verify individual is edited successfully as (.*)$")
	public void verifyIndividualIsEditedSuccessfully(String fName) {
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(msg);
	   //Verify the first name as 'Ganesh'
		if (msg.contains(fName)) {
			System.out.println("Individual Name Updated");
		}
		else {
			System.out.println("Individual name not updated");
		}
	}
	
	@And("Select the option Delete")
	public IndividualsHomePage selectTheOptionDelete() {
		WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);
		return this;
	}
	
	@And("Click on Delete in the displayed popup")
	public IndividualsHomePage clickOnDeleteInPopupWindow() {
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		return this;
	}
	
	@Then("Verify individual is deleted successfully using last name as (.*)$")
	public void verifyIndividualDeletedSuccessfully(String lName) throws InterruptedException {
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		 System.out.println(msg);
		 if (msg.contains(lName)) {
			 System.out.println("Individual Deleted successfully");
		}
		 else {
			 System.out.println("Individual not deleted successfully");
		}
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(lName,Keys.ENTER);
		Thread.sleep(3000);
		String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		System.out.println(verify);

	}
	
	
	
	
	
}

