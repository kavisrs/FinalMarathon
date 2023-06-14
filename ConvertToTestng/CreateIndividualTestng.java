package ConvertToTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateIndividualTestng extends BaseClass{
	@Test
	public void createIndividual() {
		
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
		WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
		driver.executeScript("arguments[0].click();", clk);
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(message);
		//verify Individuals Name
		if (message.contains("Kumar")) {
			System.out.println("Individual Created");
		}
		else {
			System.out.println("Individual not created");
		}
		

	}
	
}
