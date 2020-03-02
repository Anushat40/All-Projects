package IhubStores_Admin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Consignment {
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

		// Electronics
		Thread.sleep(2000);
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Televisions')]"))
				.click();
		Thread.sleep(20000);
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='TCL']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox1);

		// Cart
		Thread.sleep(2000);
		WebElement checkbox0 = driver.findElement(
				By.xpath("//section[@class=\"product-listing\"]//button[@ng-click=\"Add_Product_ToCart(Product)\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@name=\"MobileNumber\"]")).sendKeys("6309765343");
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//section[@class=\"product-listing\"]//button[@ng-click=\"Add_Product_ToCart(Product)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		Thread.sleep(2000);
		// Full Amount
		// driver.findElement(By.xpath("//input[@value=\"10\"]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"10\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);

		Thread.sleep(2000);
		WebElement checkbox00 = driver.findElement(By.xpath("//div[@class=\"cart-total\"]//button[@type=\"button\"]"));
		JavascriptExecutor js00 = (JavascriptExecutor) driver;
		js00.executeScript("arguments[0].click();", checkbox00);
		Thread.sleep(2000);
		// Store address
		WebElement link11 = driver.findElement(By.xpath(
				"//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", link11);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class=\"text-center\"]//button[@type=\"button\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"cash\"]//button[@ng-click=\"GetStoreOTP_Valid('CashPaymentForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"SOTP\"]")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@class=\"InvoiceBtn print-hide\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//i[@ng-click=\"Store_User_SignOut()\"]")).click();
		Thread.sleep(2000);
		String ee = driver.findElement(By.xpath("(//div/table/tbody/tr/td)[2]")).getText();
		System.out.println(ee);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open()");
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		Thread.sleep(1000);
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("operationsteam@Ihubstores.In");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
		driver.findElement(By.linkText("DC and Vendor Management")).click();
		driver.findElement(By.xpath("(//li/ul/li/a/i)[65]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys(ee);
		driver.findElement(By.xpath("//button[@ng-click=\"SearchOrders()\"]")).click();
		Thread.sleep(2000);
		String store = driver.findElement(By.xpath("(//tbody/tr/td)[2]")).getText();
		driver.findElement(By.xpath("(//input[@value=\"Packed\"])[1]")).click();
		driver.findElement(By.xpath("(//div/button/span)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button/span")).click();
		Thread.sleep(1000);
		// inventory
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][3]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][3]//li[@ng-repeat=\"g in j.SubMenus\"][1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SelSource\"]//option[@value=\"1\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SourceID\"]//option[@label=\"Hyderabad DC\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SelDest\"]//option[@value=\"3\"]"))
				.click();
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.xpath("(//div/select)[4]")));
		s.selectByVisibleText(store);
		Thread.sleep(2000);
		driver.findElement(By.linkText(store)).click();
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//tbody/tr/td"));
		for (int i = 0; i < li.size(); i++) {
			String vi = li.get(i).getText();
			if (vi.contentEquals(ee)) {
				li.get(i - 2).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Create Consignment\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button/span")).click();
		jse.executeScript("window.open()");
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		Thread.sleep(1000);
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("logisticadmin@Ihubstores.In");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
		driver.findElement(By.linkText("Consignments")).click();// select[@ng-model="source"]
		Thread.sleep(1000);
		Select ss = new Select(driver.findElement(By.xpath("(//select[@ng-required=\"true\"])[1]")));
		ss.selectByVisibleText("Enkoor Store");
		Thread.sleep(1000);
		Select s1 = new Select(driver.findElement(By.xpath("(//select[@ng-required=\"true\"])[5]")));
		s1.selectByVisibleText("Picked Up");
		Thread.sleep(1000);
		s1.selectByVisibleText("delivered");
	}

}