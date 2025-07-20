package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

	@FindBy(name="email")
	public static WebElement EmailAddress;

	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@id='submitBTN']")
	public static WebElement submit;
}
