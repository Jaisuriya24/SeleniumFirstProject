package HandsonsUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import PageObjects.AlertPageObject;

public class AlertHandling {
	WebDriver driver;
	@BeforeMethod
	public  void launchBrowser() {
	// TODO Auto-generated method stub
			System.setProperty("webdriver.driver.chromedriver","C://Users//hp//Downloads//SeleniumHandsons//SeleniumFirstProject//chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://www.leafground.com/alert.xhtml");
	}
	@Test
	   public void simpleDialog() {
		//WebElement showBtn=driver.findElement(By.id("j_idt88:j_idt91"));
		AlertPageObject.showBtn.click();
		Alert showAlert=driver.switchTo().alert();
		showAlert.accept();		
		String AlertText=driver.findElement(By.id("simple_result")).getText();
		System.out.println(AlertText);
		}
	@Test
	   public void confirmDialog() {
			WebElement showBtn2=driver.findElement(By.id("j_idt88:j_idt93"));
			showBtn2.click();
			Alert ConfirmDialogAccept=driver.switchTo().alert();
			ConfirmDialogAccept.accept();	
			String ConfirmDialogAcceptTxt=driver.findElement(By.id("result")).getText();
			System.out.println(ConfirmDialogAcceptTxt);
			}
	@Test
	   public void Dismiss() {
		   WebElement showBtn2=driver.findElement(By.id("j_idt88:j_idt93"));
			showBtn2.click();
			//showBtn2.click();
			Alert ConfirmDialogDismiss=driver.switchTo().alert();
			ConfirmDialogDismiss.dismiss();	
			String ConfirmDialogDismissTxt=driver.findElement(By.id("result")).getText();
			System.out.println(ConfirmDialogDismissTxt);

			}
	@Test
	   public void SweetAlert() {
	   WebElement showBtn3=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']"));
		showBtn3.click();
		WebElement Sweetdismiss=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[1]"));
		Sweetdismiss.click();
		
		showBtn3.click();
		WebElement SweetCloseBtn=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt96\']/div[1]/a/span"));
		SweetCloseBtn.click();
	   }
	@Test
	   public void SweetModelDialog() {
		WebElement showBtn4=driver.findElement(By.name("j_idt88:j_idt100"));
		showBtn4.click();
		WebElement SweetModal=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt101\']/div[1]/a/span"));
		SweetModal.click();
	   }
	@AfterMethod
	   public void closeBrowser() {
		
		   driver.close();
	   }
		
		
	}

