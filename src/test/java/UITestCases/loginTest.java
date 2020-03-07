package UITestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

public class loginTest extends TestBase {

	public loginTest() throws IOException {
		super();

	}

	@BeforeMethod

	public void setUp() {

		initialization();

	}

	@Test

	public void login() {

		WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='btnLogin']"));

		username.sendKeys("mngr249314");

		password.sendKeys("tUgErAh");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@AfterMethod
	
	public void termination() {
		
		driver.quit();
	}

}
