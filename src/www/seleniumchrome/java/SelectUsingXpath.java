package www.seleniumchrome.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectUsingXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java selenium\\eclipsejavaprograms\\CreativePrograms\\drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//RemoteWebDriver driver = new ChromeDriver();
//    SearchContext	driver = new ChromeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement  create= driver.findElementByLinkText("Create new account");
		create.click();
       WebElement element=driver.findElement(By.xpath("//select[@id=\"month\"]/option"));
       Select select = new Select(element);
       WebElement element1=driver.findElement(By.xpath("//select[@id=\"month\"]/option[7]"));
       element1.click();
       
	}
}
