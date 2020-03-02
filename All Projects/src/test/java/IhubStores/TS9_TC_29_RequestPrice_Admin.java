package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS9_TC_29_RequestPrice_Admin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Admin

		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]")).click();
		Thread.sleep(2000);
		// Special Request
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]//li[@ng-repeat=\"j in i.SubMenus\"][9]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model=\"MobileNumber\"]")).sendKeys("6309765343");
		driver.findElement(By.xpath("//select[@ng-model=\"Status\"]//option[@value=\"60\"]")).click();
		driver.findElement(By.xpath("//form[@name=\"PurchaseOrdersform\"]//input[@id=\"btnSearch\"]")).click();
	}

}