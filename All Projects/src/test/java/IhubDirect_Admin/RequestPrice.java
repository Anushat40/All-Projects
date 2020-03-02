package IhubDirect_Admin;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RequestPrice {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://164.52.194.143/iHubStoresBeta");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(30000);
		driver.findElement(By.linkText("Categories")).click();
		Thread.sleep(4000);

		WebElement checkbox = driver.findElement(
				By.xpath("//div[@class=\"header-menu\"]//a[contains(text(),'Building And Construction')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(3000);
		WebElement checkbox1 = driver
				.findElement(By.xpath("//div[@class=\"home-body clearfix\"]//p[contains(text(),'Cement & Concrete')]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@ng-click=\"Request_Product_Price(Product)\"]")).click();
		WebElement checkbox0 = driver.findElement(By.xpath("//button[@ng-click=\"Request_Product_Price(Product)\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;

		js0.executeScript("arguments[0].click();", checkbox0);
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

		driver.findElement(By.xpath(
				"//div[@id=\"RequestPriceModal\"]//div[@class=\"modal-footer\"]//button[@ng-click=\"SaveRequestedProducts('RequestForm')\"]"))
				.click();
		driver.close();

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		// Admin

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
		driver1.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]")).click();
		Thread.sleep(2000);
		// Special Request
		driver1.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]//li[@ng-repeat=\"j in i.SubMenus\"][6]"))
				.click();
		Thread.sleep(2000);
		// driver1.findElement(By.xpath("//input[@ng-model=\"MobileNumber\"]")).sendKeys("6309765343");
		// driver1.findElement(By.xpath("//select[@ng-model=\"Status\"]//option[@value=\"60\"]")).click();
		driver1.findElement(By.xpath("//form[@name=\"PurchaseOrdersform\"]//input[@id=\"btnSearch\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"Price_CategoryController\"]//select[@ng-model=\"i.CustomerRequestStatus\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		driver1.close();

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://164.52.194.143/iHubStoresBeta");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver2.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		driver2.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(40000);
		WebElement checkbox2 = driver2.findElement(By.xpath("//div[@ng-click=\"GetRequestedProducts()\"]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver2;
		js2.executeScript("arguments[0].click();", checkbox2);

	}

}