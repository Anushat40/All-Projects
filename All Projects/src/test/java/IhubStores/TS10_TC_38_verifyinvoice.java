package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS10_TC_38_verifyinvoice {
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"InvoiceBtn print-hide\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//i[@ng-click=\"Store_User_SignOut()\"]")).click();
	
		// driver.close();
	}

}