package www.seleniumchrome.java;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\java selenium\\eclipsejavaprograms\\CreativePrograms\\drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//RemoteWebDriver driver = new ChromeDriver();
//    SearchContext	driver = new ChromeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://Google.com");
		
	        driver.findElement(By.ById.id("APjFqb")).sendKeys("javatpoint");
	        
		
		driver.close();
		
		
	
	}

}