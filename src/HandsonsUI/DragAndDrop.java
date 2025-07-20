package HandsonsUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","C://Users//hp//Downloads//SeleniumHandsons//SeleniumFirstProject//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement drag=driver.findElement(By.id("form:drag_content"));
		WebElement drop=driver.findElement(By.id("form:drop_content"));
		Actions action=new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).build().perform();

	}

}
