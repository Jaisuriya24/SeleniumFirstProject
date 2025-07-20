package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPageObject;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C://Users//hp//Downloads//SeleniumHandsons//SeleniumFirstProject//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		PageFactory.initElements(driver,LoginPageObject.class);
		LoginPageObject.EmailAddress.sendKeys("user@phptravels.com");
		LoginPageObject.Password.sendKeys("demouser");
		LoginPageObject.submit.click();

	}

}
