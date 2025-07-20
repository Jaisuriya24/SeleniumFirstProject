package HandsonsUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class FirstAutomation {

    public static void main(String[] args) {
        // Set the path to the WebDriver executable (Make sure ChromeDriver is in your PATH)
        System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//SeleniumHandsons//SeleniumFirstProject//chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website (Google)
	        driver.get("https://www.google.com");

        // Find the search box by its name attribute and type in a search term
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium Java");

        // Press the Enter key to perform the search
        searchBox.sendKeys(Keys.RETURN);

        // Wait for the results to load and get the page title
        try {
            Thread.sleep(3000); // Optional: sleep for 3 seconds to ensure the page is loaded
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

