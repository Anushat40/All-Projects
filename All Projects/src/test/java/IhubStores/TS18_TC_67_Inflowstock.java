package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_67_Inflowstock {

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
		driver.findElement(By.xpath("//div[@ng-click=\"INFlowStockCount(1)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"OutFlowProductsShow\"]//input[@ng-model=\"OrderDateFrom\"]"))
				.sendKeys("02/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"OutFlowProductsShow\"]//input[@ng-model=\"OrderDateTo\"]"))
				.sendKeys("31/12/2019");
		//driver.findElement(By.xpath("//div[@ng-show=\"OutFlowProductsShow\"]//input[@ng-model=\"OrderIDs\"]")).sendKeys("");
		//driver.findElement(By.xpath("//div[@ng-show=\"OutFlowProductsShow\"]//input[@ng-model=\"SkuCode\"]")).sendKeys("");
		 driver.findElement(By.xpath("//div[@ng-show=\"OutFlowProductsShow\"]//select[@ng-model=\"RequestStatus\"]//option[@value=\"20\"]")).click();
		//driver.findElement(By.xpath("//div[@ng-show=\"OutFlowProductsShow\"]//select[@ng-model=\"SourceID3\"]")).click();
		 driver.findElement(By.xpath("//div[@ng-show=\"OutFlowProductsShow\"]//input[@value=\"Search\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"OutFlowProductsShow\"]//input[@value=\"Reset\"]")).click();
	}

}