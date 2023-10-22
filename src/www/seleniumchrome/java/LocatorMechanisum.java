package www.seleniumchrome.java;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorMechanisum {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java selenium\\eclipsejavaprograms\\CreativePrograms\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tutorialspoint.com");
		Thread.sleep(2000);
		 WebElement CodingGround = driver.findElementByLinkText("Coding Ground");
		 CodingGround.click();
		 WebElement  Signupforfree  = driver.findElementByPartialLinkText("Free");
		 Signupforfree.click();
		 // WebElement execute = driver.findElementByLinkText("Execute");
		 //execute.click();
		 Thread.sleep(2000);
		 driver.close();
         driver.quit();
	}
}
