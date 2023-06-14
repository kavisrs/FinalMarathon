package StepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass{
	
	
	@When("Click on toggle menu button")
	public HomePage clickOnToggleButton() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}
	
	@And("click View All")
	public AppLauncherPage clickViewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new AppLauncherPage();
	}
	

}
