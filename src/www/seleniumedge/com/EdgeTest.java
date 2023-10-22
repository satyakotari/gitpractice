package www.seleniumedge.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","D:\\java selenium\\eclipsejavaprograms\\JavaandSeleniumPrograms\\drivers\\msedgedriver.exe");

		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElementById("APjFqb");
		search.sendKeys("https://www.gmail.com");
		search.submit();
		
		WebElement letter = driver.findElementByName("Google");
		letter.click();
		Thread.sleep(7000);
		driver.close();
	}

}
