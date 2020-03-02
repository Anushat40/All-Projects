package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS9_Categories {
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
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();

		// Products
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		// Telivisons
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Televisions')]"))
				.click();
		WebElement checkbox = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Onida']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		WebElement checkbox1 = driver
				.findElement(By.xpath("//div[@class='aside-filter']//input[@value=\"43 Inches\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(2000);
		WebElement checkbox2 = driver.findElement(By.xpath("//div[@class='filter-list'][4]//input[@value=\"2\"]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox2);
		Thread.sleep(2000);
		WebElement checkbox3 = driver.findElement(By.xpath("//div[@class='filter-list'][5]//input[@value=\"2\"]"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox3);
		Thread.sleep(2000);
		WebElement checkbox4 = driver
				.findElement(By.xpath("//div[@class='filter-list'][6]//input[@value=\"FHD LED\"]"));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox4);
		Thread.sleep(2000);
		WebElement checkbox5 = driver.findElement(By.xpath("//div[@class='filter-list'][7]//input[@value=\"1 Year\"]"));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox5);
		Thread.sleep(2000);

		// Sort by
		driver.findElement(By.xpath("//ul[@class=\"sort-by list-inline\"]//select[@ng-change=\"filterBysort()\"]"))
				.click();
		Thread.sleep(2000);
		// Discount
		driver.findElement(By.xpath(
				"//ul[@class=\"sort-by list-inline\"]//select[@ng-change=\"filterBysort()\"]//option[@value=\"D\"]"))
				.click();
		/*
		 * Low To High driver.findElement(By.xpath(
		 * "//ul[@class=\"sort-by list-inline\"]//select[@ng-change=\"filterBysort()\"]//option[@value=\"L\"]"
		 * )) .click(); //High To Low driver.findElement(By.xpath(
		 * "//ul[@class=\"sort-by list-inline\"]//select[@ng-change=\"filterBysort()\"]//option[@value=\"H\"]"
		 * )) .click();
		 */

		// Request Price
		driver.findElement(By.linkText("Categories")).click();
		Thread.sleep(4000);

		WebElement checkbox11 = driver.findElement(
				By.xpath("//div[@class=\"header-menu\"]//a[contains(text(),'Building And Construction')]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", checkbox11);
		Thread.sleep(3000);
		WebElement checkbox12 = driver
				.findElement(By.xpath("//div[@class=\"home-body clearfix\"]//p[contains(text(),'Cement & Concrete')]"));
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		js12.executeScript("arguments[0].click();", checkbox12);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"Request_Product_Price(Product)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class=\"modal-content\"]//form[@name=\"RequestForm\"]//input[@name=\"CustomerName\"]"))
				.sendKeys("Text");
		driver.findElement(
				By.xpath("//div[@class=\"modal-content\"]//form[@name=\"RequestForm\"]//input[@name=\"MobileNumber\"]"))
				.sendKeys("9999999999");
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"RequestForm\"]//input[@name=\"RequestedQunatity\"]"))
				.sendKeys("1");
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"RequestForm\"]//textarea[@name=\"Specifications\"]"))
				.sendKeys("Sample");
		// Cancel
		driver.findElement(By.xpath(
				"//div[@id=\"RequestPriceModal\"]//div[@class=\"modal-footer\"]//button[@ng-click=\"CancelModal()\"]"))
				.click();
		// Close
		driver.findElement(By.xpath("//div[@id=\"RequestPriceModal\"]//button[@class=\"close-btn\"]")).click();
		// Save
		driver.findElement(By.xpath(
				"//div[@id=\"RequestPriceModal\"]//div[@class=\"modal-footer\"]//button[@ng-click=\"SaveRequestedProducts('RequestForm')\"]"))
				.click();

		// Admin
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
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
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]")).click();
		Thread.sleep(2000);
		// Price Request
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]//li[@ng-repeat=\"j in i.SubMenus\"][6]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@ng-model=\"MobileNumber\"]")).sendKeys("9848194614");
		driver.findElement(By.xpath("//select[@name=\"Status\"]//option[@value=\"10\"]")).click();
		Thread.sleep(3000);
		WebElement checkbox13 = driver
				.findElement(By.xpath("//form[@name=\"PurchaseOrdersform\"]//input[@id=\"btnSearch\"]"));
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		js13.executeScript("arguments[0].click();", checkbox13);

	}

}