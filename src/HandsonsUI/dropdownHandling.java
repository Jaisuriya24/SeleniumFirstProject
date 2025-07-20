package HandsonsUI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C://Users//hp//Downloads//SeleniumHandsons//SeleniumFirstProject//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        
//        WebElement dropdownSelect=driver.findElement(By.className("ui-selectonemenu"));
//        Select select=new Select(dropdownSelect);
//        select.selectByVisibleText("Selenium");
        
        
        WebElement countrySelect=driver.findElement(By.id("j_idt87:country_label"));
       // countrySelect.click();  
       // WebElement drpVal=driver.findElement(By.id("j_idt87:country_panel"));
        Select select1=new Select(countrySelect);
        select1.selectByVisibleText("USA");
        driver.quit();
	}

}
