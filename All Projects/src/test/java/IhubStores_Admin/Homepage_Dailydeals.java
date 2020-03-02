package IhubStores_Admin;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage_Dailydeals {
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][12]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][12]//li[@ng-repeat=\"j in i.SubMenus\"][4]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-ng-repeat=\"node in CategoryDataNode\"]//i[@class=\"expanded\"]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div[1]/div/div/ul/li/div/ul/li[15]/i[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div[1]/div/div/ul/li/div/ul/li[15]/div/ul/li[3]/i[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div[1]/div/div/ul/li/div/ul/li[15]/div/ul/li[3]/div/ul/li[1]/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"prdtlist\"]//input[@id=\"SKU\"]")).sendKeys("01717G-2630003");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"prdtlist\"]//input[@value=\"Search\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"prdtlist\"]//input[@ng-model=\"x.Selected\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"prdtlist\"]//button[@ng-click=\"SaveSelectedProducts()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@id=\"OrderDateFrom\"]"))
				.sendKeys("17/12/19");
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@id=\"OrderDateTo\"]"))
				.sendKeys("31/12/19");
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@ng-model=\"BulkDiscountPercentage\"]"))
				.sendKeys("20");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class=\"modal-content\"]//input[@ng-click=\"ApplyAll(BulkDiscountPercentage)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@ng-click=\"Apply('DiscountsZone')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		Thread.sleep(2000);
		driver.close();

		// Store
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
		WebElement checkbox = driver1.findElement(By.linkText("Daily Deals"));
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//li[@ng-repeat=\"b in ProductTypes_list\"]//i[@class=\"check\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//h4[@ng-click=\"RedirecttoProductDetail(c)\"]")).click();

		String Mainwindow = driver1.getWindowHandle();
		java.util.Set<String> s1 = driver1.getWindowHandles();
		java.util.Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver1.switchTo().window(ChildWindow);
			}
		}
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@class=\"container-fluid\"]//button[@ng-click=\"Add_Product_ToCart(ProductDetails)\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@name=\"MobileNumber\"]"))
				.sendKeys("6309765343");
		driver1.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@class=\"container-fluid\"]//button[@ng-click=\"Add_Product_ToCart(ProductDetails)\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		// Full Amount
		// driver.findElement(By.xpath("//input[@value=\"10\"]")).click();
		WebElement checkbox1 = driver1.findElement(By.xpath("//input[@value=\"10\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver1;
		js1.executeScript("arguments[0].click();", checkbox1);

		Thread.sleep(2000);
		WebElement checkbox0 = driver1.findElement(By.xpath("//div[@class=\"cart-total\"]//button[@type=\"button\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver1;
		js0.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(2000);
		// Store address
		WebElement link11 = driver1.findElement(By.xpath(
				"//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver1;
		js11.executeScript("arguments[0].click();", link11);
		Thread.sleep(2000);

		driver1.findElement(By.xpath("//div[@class=\"text-center\"]//button[@type=\"button\"]")).click();

		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@id=\"cash\"]//button[@ng-click=\"GetStoreOTP_Valid('CashPaymentForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name=\"SOTP\"]")).sendKeys("123456");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//a[@class=\"InvoiceBtn print-hide\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@id=\"mobile-menu\"]//li[@class=\"mobile-dropdown open no-padding\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@id=\"mobile-menu\"]//li[@class=\"mobile-dropdown open no-padding\"]//a[@ng-click=\"Buyer_Order_Details()\"]"))
				.click();
		driver1.findElement(
				By.xpath("//div[@ng-show=\"BuyerOrderDetailsShow\"]//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-show=\"BuyerOrderDetailsShow\"]//a[@ng-click=\"ViewOrderedProducts(i.Order_Number,i)\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@ng-show=\"OrderedProductDetailsShow\"]//button[@ng-click=\"BackToOrders()\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-show=\"BuyerOrderDetailsShow\"]//a[@title=\"View Invoice\"]")).click();
	}

}