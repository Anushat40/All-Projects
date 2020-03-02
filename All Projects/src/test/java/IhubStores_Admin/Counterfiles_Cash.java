package IhubStores_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counterfiles_Cash {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://164.52.194.143/iHubStoresBeta");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"ToCounterFiles()\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"CashCounterType('CASH')\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"CounterfilesController\"]//button[@ng-click=\"GenerateNewCashCounterFile()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"GenerateCashCounterFileShow\"]//input[@ng-model=\"Date\"]"))
				.sendKeys("10/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"GenerateCashCounterFileShow\"]//input[@ng-model=\"DateTo\"]"))
				.sendKeys("31/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"GenerateCashCounterFileShow\"]//input[@ng-model=\"Amount\"]"))
				.sendKeys("500");
		driver.findElement(By.xpath(
				"//div[@ng-show=\"GenerateCashCounterFileShow\"]//select[@ng-model=\"type\"]//option[@value=\"Collected\"]"))
				.click();
		// Collected
		driver.findElement(
				By.xpath("//div[@ng-show=\"GenerateCashCounterFileShow\"]//input[@ng-model=\"CollectedName\"]"))
				.sendKeys("Test");
		/*
		 * Deposited driver.findElement(By.xpath(
		 * "//div[@ng-show=\"GenerateCashCounterFileShow\"]//select[@ng-model=\"type\"]//option[@value=\"Deposited\"]"
		 * )) .click();
		 */
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@ng-show=\"GenerateCashCounterFileShow\"]//input[@ng-model=\"filename\"]"))
				.sendKeys("//home//anusha//Desktop//download.jpeg");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"CounterfilesController\"]//input[@ng-click=\"SaveCashCounterFile('CashCounterForm')\"]"))
				.click();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.close();

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://164.52.194.143/iHubBetaAdmin");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver1.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver1.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]")).click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]//li[@ng-repeat=\"j in i.SubMenus\"][2]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-controller=\"CashCounterFilesController\"]//input[@id=\"UnitName\"]"))
				.sendKeys("Enkoor Store");
		driver1.findElement(
				By.xpath("//div[@ng-controller=\"CashCounterFilesController\"]//button[@title=\"SearchOrders\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//select[@ng-change=\"changeorderstatus(i.CounterFiles_ID)\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@class=\"ng-confirm-box ng-confirm-hilight-shake ng-confirm-type-animated\"]//button[@class=\"btn btn-red\"]"))
				.click();
		driver1.close();

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://164.52.194.143/iHubStoresBeta");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver2.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver2.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver2.findElement(By.xpath("//div[@ng-click=\"ToCounterFiles()\"]")).click();
		Thread.sleep(4000);
		driver2.findElement(By.xpath("//div[@ng-click=\"CashCounterType('CASH')\"]")).click();
	}

}