package ConvertToTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIndividualTestng extends BaseClass{
	@Test
	public void deleteIndividual() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("//a[@title='Individuals']//span[1]"));
		driver.executeScript("arguments[0].click();", clk);
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys("Kumars");
		name.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement pop = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", pop);////div[@class='uiPopupTrigger']
		//Thread.sleep(2000);
		WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(msg);
		if (msg.contains("Kumars")) {
			System.out.println("Individual Deleted successfully");
		}
		else {
			System.out.println("Individual not deleted successfully");
		}
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Kumars",Keys.ENTER);
		Thread.sleep(3000);
		String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		System.out.println(verify);
		//Verify Whether Individual is Deleted using Individual last name"
	}


}


