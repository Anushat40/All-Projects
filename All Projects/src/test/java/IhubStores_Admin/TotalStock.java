package IhubStores_Admin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalStock {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
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
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]//li[@ng-repeat=\"j in i.SubMenus\"][2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]//li[@ng-repeat=\"j in i.SubMenus\"][2]//li[@ng-repeat=\"g in j.SubMenus\"][1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"StockAssignController\"]//select[@ng-model=\"DcID\"]//option[@label=\"Hyderabad DC\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"StockAssignController\"]//select[@ng-model=\"unitID\"]//option[@label=\"Kusumachi Warehouse cum store\"]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//tbody/tr/td"));
		for (int i = 0; i <= li.size(); i++) {
			if (li.get(i).getText().equals("Enkoor Store")) {
				li.get(i + 11).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-show=\"showStock\"]//button[@ng-click=\"View_AssignStock(warehousebreadcrum)\"]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@data-tree-model=\"CategoryDataNode\"]//i[@class=\"expanded\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@data-tree-model=\"CategoryDataNode\"]//li[@data-ng-repeat=\"node in CategoryDataNode\"]//i[@class=\"expanded\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@data-tree-model=\"CategoryDataNode\"]//li[@data-ng-repeat=\"node in CategoryDataNode\"]//i[@class=\"expanded\"][1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@data-tree-model=\"CategoryDataNode\"]//li[@data-ng-repeat=\"node in CategoryDataNode\"]//span[contains(text(),'Televisions')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[@ng-repeat=\"stock in unitStock\"]//i[@class=\"check\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"View Assigned Products\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//input[@ng-change=\"checkalldisability(stock.SKU,stock.Quantity)\"]"))
				.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//input[@ng-change=\"checkalldisability(stock.SKU,stock.Quantity)\"]"))
				.sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@ng-click=\"AssignProducts()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-blue\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-blue\"]")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
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
		driver1.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]")).click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]//li[@ng-repeat=\"j in i.SubMenus\"][3]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]//li[@ng-repeat=\"j in i.SubMenus\"][3]//li[@ng-repeat=\"g in j.SubMenus\"][1]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@id=\"SelSource\"]//option[@value=\"1\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@id=\"SourceID\"]//option[@label=\"Hyderabad DC\"]"))
				.click();
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@id=\"SelDest\"]//option[@value=\"3\"]"))
				.click();
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@id=\"DestID\"]//option[@label=\"Enkoor Store\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//a[@ng-click=\"ViewProductsGrid(i.UnitID,i.ID,1)\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//input[@ng-model=\"SkuCode\"]"))
				.sendKeys("099D-2593229");
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@id=\"SelDest\"]//option[@value=\"U\"]"))
				.click();
		driver1.findElement(
				By.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//button[@id=\"btnSearch\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//i[@class=\"check\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//input[@value=\"Create Consignment\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();
		driver1.close();

		// Logistics admin
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://164.52.194.143/iHubBetaAdmin");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//div[@ng-controller=\"loginController\"]//input[@name=\"userName\"]"))
				.sendKeys("logisticadmin@ihubstores.in");
		driver2.findElement(By.xpath("//div[@ng-controller=\"loginController\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		driver2.findElement(
				By.xpath("//div[@ng-controller=\"loginController\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][2]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(
				By.xpath("//div[@class=\"content-wrapper\"]//select[@ng-model=\"source\"]//option[@value=\"1\"]"))
				.click();
		Thread.sleep(7000);
		driver2.findElement(
				By.xpath("//div[@ng-controller=\"iH_ConsignmentsViewController\"]//input[@id=\"btnSearch\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//select[@ng-model=\"StatusChange\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(4000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();
		Thread.sleep(8000);
		driver2.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//select[@ng-model=\"StatusChange\"]//option[@value=\"30\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();

		driver2.close();
		Thread.sleep(2000);

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver3 = new ChromeDriver();

		driver3.get("http://164.52.194.143/iHubStoresBeta");
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("enkoor@ihubstores.in");
		driver3.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@ng-click=\"SignIn('LoginForm')\"]")).click();

		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Consignment_CheckController\"]//a[@ng-click=\"ViewConsignment(a.ID,a.Remarks)\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@ng-click=\"notRecivedStock()\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();

	}

}