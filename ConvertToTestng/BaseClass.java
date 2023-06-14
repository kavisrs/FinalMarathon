package ConvertToTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ChromeDriver driver;
	
	@Parameters({"URL", "username", "password"})
	@BeforeMethod
	public void preCondition(String url, String uname, String pwd) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		driver = new ChromeDriver(option);

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();

	}
}
