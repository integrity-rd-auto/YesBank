package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='uid']")

	WebElement username;

	@FindBy(xpath = "//input[@name='password']")

	WebElement password;

	@FindBy(xpath = "//input[@name='btnLogin']")

	WebElement loginBtn;

}
