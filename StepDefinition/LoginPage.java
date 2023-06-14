package StepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {

	@Given("Enter the username as (.*)$")
	public LoginPage enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}

	@And("Enter the password as (.*)$")
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}

	@When("Click on Login button")
	public HomePage clickLogin() {
		driver.findElement(By.id("Login")).click();
		return new HomePage();
	}

	@Then("Verify logon successful")
	public void verifyHomePage() {
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Lightning")) {
			System.out.println("Login Succesful");
		}
		else {
			System.out.println("Logon Denied");

		}
	}
}