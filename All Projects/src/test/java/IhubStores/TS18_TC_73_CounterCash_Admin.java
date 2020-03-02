package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_73_CounterCash_Admin {
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
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]//li[@ng-repeat=\"j in i.SubMenus\"][2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-controller=\"CashCounterFilesController\"]//input[@id=\"UnitName\"]"))
				.sendKeys("istore Hyderabad");
		driver.findElement(
				By.xpath("//div[@ng-controller=\"CashCounterFilesController\"]//button[@title=\"SearchOrders\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//select[@ng-change=\"changeorderstatus(i.CounterFiles_ID)\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class=\"ng-confirm-box ng-confirm-hilight-shake ng-confirm-type-animated\"]//button[@class=\"btn btn-red\"]"))
				.click();
	}

}