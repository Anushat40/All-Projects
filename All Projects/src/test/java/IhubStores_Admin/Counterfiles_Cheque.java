package IhubStores_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counterfiles_Cheque {
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
		Thread.sleep(5000);
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
		driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"cheque\"]//input[@name=\"ChequeNumber\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@id=\"cheque\"]//input[@name=\"Name\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//div[@id=\"cheque\"]//select[@name=\"BankName\"]//option[@label=\"HDFC\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@id=\"cheque\"]//button[@ng-click=\"GetStoreOTP_Valid('ChequePaymentForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"SOTP\"]")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@class=\"InvoiceBtn
		// print-hide\"]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//i[@ng-click=\"Store_User_SignOut()\"]")).click();
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
		driver.close();
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://164.52.194.143/iHubStoresBeta");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver1.findElement(By.xpath("//div[@ng-click=\"ToCounterFiles()\"]")).click();
		Thread.sleep(4000);
		driver1.findElement(By.xpath("//div[@ng-click=\"PaymentTypeForCheque()\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-click=\"ChequePaymentStatus('Cheque', 'PENDING')\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-controller=\"CounterfilesController\"]//input[@ng-model=\"OrderID\"]"))
				.sendKeys(ee);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"CounterfilesController\"]//input[@ng-click=\"SearchCounterFiles(PaymentType,'PENDING')\"]"))
				.click();
		driver1.findElement(
				By.xpath("//div[@ng-controller=\"CounterfilesController\"]//input[@ng-checked=\"isChecked\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-show=\"CreateChequeCounterFiles\"]//input[@id=\"checkfileforcheque\"]"))
				.sendKeys("//home//anusha//Desktop//download.jpeg");
		Thread.sleep(2000);
		driver1.findElement(By
				.xpath("//div[@ng-show=\"CreateChequeCounterFiles\"]//button[@ng-click=\"SaveChequeCounterFile(i)\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@class=\"istore category-header inner\"]//a[@ng-click=\"PaymentTypeForCheque()\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//section[@ng-show=\"ChequeCounterFilesShow\"]//div[@ng-click=\"ChequePaymentStatus('Cheque', 'Completed')\"]"))
				.click();
		driver1.close();
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://164.52.194.143/iHubBetaAdmin");
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]")).click();
		Thread.sleep(2000);
		driver3.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]//li[@ng-repeat=\"j in i.SubMenus\"][1"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//DIV[@ng-controller=\"ChequeOrderController\"]//input[@ng-model=\"OrderID\"]"))
				.sendKeys(ee);
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@ng-controller=\"CashCounterFilesController\"]//input[@id=\"UnitName\"]"))
				.sendKeys("Enkoor Store");
		driver3.findElement(
				By.xpath("//div[@ng-controller=\"CashCounterFilesController\"]//button[@title=\"SearchOrders\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//DIV[@ng-controller=\"ChequeOrderController\"]//select[@ng-model=\"i.CounterFile_Status\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
	}

}