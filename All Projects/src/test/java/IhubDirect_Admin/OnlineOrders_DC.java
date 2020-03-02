package IhubDirect_Admin;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineOrders_DC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anushat/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("hyderabad@ihubdc.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Categories
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]"))
				.click();
		driver.findElement(
				By.xpath("//div[@ng-controller=\"WHOnline_OrdersController\"]//input[@ng-model=\"MobileNumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(
				By.xpath("//div[@ng-controller=\"WHOnline_OrdersController\"]//button[@title=\"SearchOrders\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"WHOnline_OrdersController\"]//a[@ng-click=\"ViewOrderedProducts(i.Order_Number,i)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//select[@name=\"Status\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
	driver.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@class=\"close\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@ng-controller=\"WHOnline_OrdersController\"]//span[@ng-click=\"getShortInvoice(i.Order_Number,i,'O')\"]")).click();
	}

}