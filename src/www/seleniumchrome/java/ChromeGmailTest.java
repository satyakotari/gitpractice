package www.seleniumchrome.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeGmailTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java selenium\\eclipsejavaprograms\\CreativePrograms\\drivers\\chromedriver.exe");
		// 1. open chrome browser
		ChromeDriver driver  = new ChromeDriver();
		// 2.maximize the browser
		driver.manage().window().maximize();
		//3.delete all cookies
	 driver.manage().deleteAllCookies();
	 // 4. enter url
	 driver.get("https://www.Gmail.com");
	 Thread.sleep(1000);
	 // 5 identify the elements
	 WebElement username= driver.findElement(By.id("identifierId"));
	 // send test 
	 username.sendKeys("kotarisathya@gmail.com");
	 // 6. click on next
	 Thread.sleep(1000);
     WebElement nxt= driver.findElement(By.id("identifierNext"));
     // perform action
     nxt.click();
      Thread.sleep(1000);
	 driver.close();
	}
}
