package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_70_StockMovingRequests {
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
		/*Consignments
		driver.findElement(By.xpath("//a[@ng-show=\"a.Damagesconsigment\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(
				By.xpath("//div[@ng-show=\"Damagesconsigment\"]//input[@value=\"Consignment not yet received \"]"))
				.click();
		driver.findElement(
				By.xpath("//div[@aria-labelledby=\"ng-confirm-box781452\"]//span[@class=\"ng-confirm-btn-text\"]"))
				.click();
		Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for (int i = 0; i < 5; i++) {
			li.get(i).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"ng-confirm-btn-text\"]")).click();
		Thread.sleep(2000);
		*/
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-click=\"StockMovingRequest()\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@ng-controller=\"iHub_Stores_Stock_movingController\"]//select[@ng-model=\"UnitID\"]")).click();
		driver.findElement(By.xpath("//tr[@ng-repeat=\"i in Stock_List\"]//a[@ng-click=\"ViewProductsGrid(i.UnitID,i.ID)\"]")).click();
		
	}

}