package ConvertToTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditIndividualTestng extends BaseClass {
	@Test
	public void editIndividual() throws InterruptedException {
		Thread.sleep(2000);
		//		WebElement clk = driver.findElement(By.xpath("//a[@title='Individuals']//span[1]"));
		//		driver.executeScript("arguments[0].click();", clk);
		WebElement name =driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys("Kumar");
		name.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//.sendKeys("Kumars",Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys("Ganesh");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(msg);
		//Verify the first name as 'Ganesh'
		if (msg.contains("Ganesh")) {
			System.out.println("Individual Name Updated");
		}
		else {
			System.out.println("Individual name not updated");
		}
	}


}


