package www.seleniumchrome.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sun.awt.windows.ThemeReader;

public class Dropdowntest {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement DayDD=driver.findElement(By.id("day"));
        Select select =new Select(DayDD);
        select.selectByIndex(7);
		Thread.sleep(3000);
		
		WebElement monthele=driver.findElement(By.id("month"));
		
		Select select1= new Select(monthele);
		select1.selectByValue("7");
		Thread.sleep(3000);
		
		WebElement yearele=driver.findElement(By.id("year"));
		Select select2 = new Select(yearele);
		select2.selectByVisibleText("2023");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
