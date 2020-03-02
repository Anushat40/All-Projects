package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS4_TC_12_Myorders {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//i[@class=\"fa ion-iphone icn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@name=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]//a[@ng-click=\"Buyer_Order_Details()\"]"))
				.click();
		driver.findElement(By.xpath("//div[@id=\"datePicker\"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id=\"datePicker\"]//input[@type=\"text\"]")).sendKeys("57368286");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"search-btn\"]//input[@type=\"button\"][1]")).click();
		/*
		 * view invoice WebElement checkbox =
		 * driver.findElement(By.xpath("//td[@title=\"View Invoice\"]"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();", checkbox); Thread.sleep(2000);
		 */
		// driver.findElement(By.xpath("//div[@class=\"box-container\"]//span[contains(text(),'Back')]")).click();
		Thread.sleep(2000);

		// Payment details
		driver.findElement(By.xpath("//a[@ng-click=\"ViewPaymentDetails(i.Orders_Main_ID)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id=\"BuyerPayementDetails\"]//div[@class=\"modal-content\"]//div[@class=\"modal-header\"]//button[@data-dismiss=\"modal\"]"))
				.click();
		Thread.sleep(2000);
		// view
		driver.findElement(By.xpath(
				"//table[@class=\"table table-bordered table-condensed table-striped\"]//a[@ng-click=\"ViewOrderedProducts(i.Order_Number,i)\"]"))
				.click();
		Thread.sleep(2000);
		/*
		 * Cancel driver.findElement(By.xpath(
		 * "//span[@ng-click=\"CancelOrder(OrderID,y.Product_Id)\"]")).click();
		 * Thread.sleep(2000); //
		 * driver.findElement(By.xpath("//button[@class='btn btn-red']")).click();
		 * driver.findElement(By.xpath("//button[@class='btn btn-theme']")).click();
		 * driver.findElement(By.xpath("ng-click=\"BackToOrders()\"]")).click();
		 */
		// Back
		driver.findElement(By.xpath("//input[@ng-click=\"BackToOrders()\"]")).click();
	}

}