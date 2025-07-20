package HandsonsUI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;



public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "C://Users//hp//Downloads//SeleniumHandsons//SeleniumFirstProject//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String OldWindow=driver.getWindowHandle();
		driver.get("https://www.leafground.com/window.xhtml");
		WebElement Open=driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		Open.click();
		Set<String>handles=driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement checkBox=driver.findElement(By.xpath("//*[@id=\'j_idt107\']/div[2]"));
		checkBox.click();
		Thread.sleep(3000);
		//driver.close();
		driver.switchTo().window(OldWindow);
		
	}

}
