package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;

public class AppLauncherPage extends BaseClass {
	
	@And("click Individuals from App Launcher")
	public IndividualsHomePage clickIndividuals() {
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		return new IndividualsHomePage();
	}

}
