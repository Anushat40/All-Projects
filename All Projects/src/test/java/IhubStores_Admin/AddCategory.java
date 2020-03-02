package IhubStores_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCategory {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]"))
				.click();

		// Categories
		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]//li[@ng-repeat=\"j in i.SubMenus\"][1]"))
				.click();
		// Add New Category
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@ng-show=\"tblCategoryList\"]//input[@value=\"Add New Category\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"CategoryName\"]")).sendKeys("Offices");
		driver.findElement(By.xpath("//textarea[@name=\"Description\"]")).sendKeys("Offices");
		driver.findElement(By.xpath("//input[@name=\"Priority\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"Priority\"]")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"Image\"]"))
				.sendKeys("//home//anusha//Desktop//25manjooWeb-articleLarge.jpg");
		driver.findElement(By.xpath("//select[@name=\"Status\"]//option[@value=\"10\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"Batch Number\"]//option[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"Manufacture Date\"]//option[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"Expiry Date\"]//option[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"IMEI Number\"]//option[@value=\"1\"]")).click();
		// Cancel
		driver.findElement(By.xpath("//div[@ng-show=\"AddVisibility\"]//button[@value=\"Cancel\"]")).click();
		// Save
		driver.findElement(By.xpath("//div[@ng-show=\"AddVisibility\"]//button[@id=\"btnSave\"]")).click();
	}

}