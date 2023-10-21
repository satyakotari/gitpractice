package www.seleniumchrome.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java selenium\\eclipsejavaprograms\\CreativePrograms\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		// 1 . identify the element with By class name
		//WebElement username = driver.findElement(By.id("identifierId"));
		//2. identify the element with By class and By inner class
		//WebElement username = driver.findElement(By.ById.id("identifierId"));
		//3. identify without Byclass and inner By class
		WebElement username = driver.findElementById("identifierId");
		username.sendKeys("satyavenikotari039@gmailcom");
		
		driver.close();
		
	}

}
