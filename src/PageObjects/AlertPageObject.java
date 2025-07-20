package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class AlertPageObject {

//	public AlertPageObject(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		PageFactory.initElements(driver, this);
//	}

	@FindBy(id="j_idt88:j_idt91")
	public static WebElement showBtn;

	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@id='submitBTN']")
	public static WebElement submit;
}