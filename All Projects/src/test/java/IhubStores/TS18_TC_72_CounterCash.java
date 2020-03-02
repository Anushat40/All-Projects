package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_72_CounterCash {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
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
		driver.findElement(By.xpath("//div[@ng-click=\"ToCounterFiles()\"]")).click();
	}

}