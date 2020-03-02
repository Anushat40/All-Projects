package IhubStores_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialRequest {
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
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Request Product")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("CustomerName")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='MobileNumber'])[3]")).sendKeys("6309765343");
		driver.findElement(By.name("ProductName")).sendKeys("abc");
		driver.findElement(By.name("RequestedQunatity")).sendKeys("5");
		driver.findElement(By.name("Specifications")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name=\"image\"]")).sendKeys("//home//anusha//Desktop//download.jpeg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"Save_Special_Product('ProductRequestForm')\"]")).click();
		// driver.findElement(By.xpath("//button[@ng-click=\"CancelModal()\"]")).click();
		// driver.findElement(By.xpath("//div[@id=\"RequestProductModal\"]//button[@class=\"close-btn\"]")).click();
		Thread.sleep(3000);
		// Signout
		WebElement checkbox00 = driver
				.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"Store_Asst_SignOut()\"]"));
		JavascriptExecutor js00 = (JavascriptExecutor) driver;
		js00.executeScript("arguments[0].click();", checkbox00);
		Thread.sleep(2000);
		driver.close();

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
		driver1.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]")).click();
		Thread.sleep(2000);
		// Special Request
		driver1.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]//li[@ng-repeat=\"j in i.SubMenus\"][9]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@ng-model=\"MobileNumber\"]")).sendKeys("6309765343");
		// driver1.findElement(By.xpath("//select[@ng-model=\"Status\"]//option[@value=\"60\"]")).click();
		driver1.findElement(By.xpath("//form[@name=\"PurchaseOrdersform\"]//input[@id=\"btnSearch\"]")).click();
		driver1.findElement(By.xpath("//select[@ng-model=\"i.Customer_Request_Status\"]//option[@value=\"70\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		driver1.close();

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://164.52.194.143/iHubStoresBeta");
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver3.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver3.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		WebElement checkbox = driver3.findElement(By.xpath("//div[@ng-click=\"GetSpecialRequestedProducts()\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver3;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//div[@ng-show=\"SpecialProductsShow\"]//a[@ng-click=\"DisplayImage(a.Customer_Requested_ID)\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//div[@class=\"ng-confirm-buttons\"]")).click();

	}

}