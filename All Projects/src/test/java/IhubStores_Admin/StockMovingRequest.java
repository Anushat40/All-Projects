package IhubStores_Admin;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StockMovingRequest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Admin

		driver.get("http://164.52.194.143/iHubBetaAdmin");
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
		// Inventory Management
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]")).click();
		Thread.sleep(2000);
		// Stock Control
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]//li[@ng-repeat=\"j in i.SubMenus\"][2]"))
				.click();
		Thread.sleep(2000);
		// Stock Moving from request
		driver.findElement(By.xpath(
				"//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]//li[@ng-repeat=\"j in i.SubMenus\"][2]//li[@ng-repeat=\"g in j.SubMenus\"][3]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"iH_StockMovingController\"]//select[@id=\"SelSource\"]//option[@value=\"3\"]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"iH_StockMovingController\"]//select[@id=\"SourceID\"]//option[@label=\"Enkoor Store\"]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"iH_StockMovingController\"]//select[@id=\"SelDest\"]//option[@value=\"3\"]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"iH_StockMovingController\"]//select[@id=\"DestID\"]//option[@label=\"Kalluru Store\"]"))
				.click();
		// driver.findElement(By.xpath("//div[@ng-controller=\"iH_StockMovingController\"]//input[@id=\"SKU\"]"))
		// .sendKeys("01818K-2645337");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iH_StockMovingController\"]//input[@ng-click=\"SearchProducts()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class=\"label-wrapper\"]//i[@class=\"check\"]")).click();
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iH_StockMovingController\"]//input[@ng-click=\"MoveProducts()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();
		driver.close();

		// Stores
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://164.52.194.143/iHubStoresBeta");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-click=\"StockMovingRequest()\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//tr[@ng-repeat=\"i in Stock_List\"]//a[@ng-click=\"ViewProductsGrid(i.UnitID,i.ID)\"]"))
				.click();
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Stores_Stock_movingController\"]//a[@ng-click=\"ViewProductsGrid(i.UnitID,i.ID)\"]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> li = driver1.findElements(
				By.xpath("//div[@ng-controller=\"iHub_Stores_Stock_movingController\"]//input[@type=\"checkbox\"]"));
		JavascriptExecutor js = ((JavascriptExecutor) driver1);

		// List<WebElement> li =
		// driver1.findElements(By.xpath("//div[@ng-controller=\"iHub_Stores_Stock_movingController\"]//input[@type=\"checkbox\"]"));
		for (int i = 0; i < li.size(); i++) {
			li.get(i).click();
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Stores_Stock_movingController\"]//input[@ng-click=\"CreateConsignment()\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();
		driver1.close();
		Thread.sleep(2000);
		// logisticadmin
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver2 = new ChromeDriver();
		// Admin

		driver2.get("http://164.52.194.143/iHubBetaAdmin");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("logisticadmin@ihubstores.in");
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][2]"))
				.click();
		Thread.sleep(20000);
		driver2.findElement(By.xpath(
				"//div[@class=\"content-wrapper\"]//div[@ng-show=\"(a.Status=='10')\"]//select[@ng-model=\"StatusChange\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@class=\"ng-confirm-box ng-confirm-hilight-shake ng-confirm-type-animated\"]//button[@class=\"btn btn-green\"]"))
				.click();
		Thread.sleep(20000);
		driver2.findElement(By.xpath(
				"//div[@class=\"content-wrapper\"]//select[@ng-change=\"ChangeStatus(a.ID,StatusChange)\"]//option[@value=\"30\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@class=\"ng-confirm-box ng-confirm-hilight-shake ng-confirm-type-animated\"]//button[@class=\"btn btn-green\"]"))
				.click();
		Thread.sleep(2000);
		driver2.close();

		// Stores
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://164.52.194.143/iHubStoresBeta");
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("kalluru@Ihubstores.In");
		driver3.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver3.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();

		// Consignments
		Thread.sleep(2000);
		driver3.findElement(
				By.xpath("//div[@ng-controller=\"iHub_Consignment_CheckController\"]//a[@title=\"View Consignment\"]"))
				.click();
		Thread.sleep(2000);

		driver3.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@ng-click=\"notRecivedStock()\"]"))
				.click();
		Thread.sleep(1000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		Thread.sleep(1000);
		//
		// List<WebElement> li1 = driver3
		// .findElements(By.xpath("//div[@ng-show=\"ForcePendingOrders\"]//i[@class=\"check\"]"));
		// for (int i = 0; i < 5; i++) {
		// li1.get(i).click();
		// }

	}

}