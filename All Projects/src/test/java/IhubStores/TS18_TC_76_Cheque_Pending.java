package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_76_Cheque_Pending {

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
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"ToCounterFiles()\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-click=\"PaymentTypeForCheque()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-click=\"ChequePaymentStatus('Cheque', 'Completed')\"]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-controller=\"CompletedCounterFilesController\"]//input[@ng-model=\"OrderID\"]"))
				.sendKeys("");
		driver.findElement(By
				.xpath("//div[@ng-controller=\"CompletedCounterFilesController\"]//input[@ng-model=\"OrderDateFrom\"]"))
				.sendKeys("01/12/2019");
		driver.findElement(
				By.xpath("//div[@ng-controller=\"CompletedCounterFilesController\"]//input[@ng-model=\"OrderDateTo\"]"))
				.sendKeys("31/12/2019");
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"CompletedCounterFilesController\"]//input[@ng-click=\"Search(PaymentType,'Completed')\"]"))
				.click();
	}

}