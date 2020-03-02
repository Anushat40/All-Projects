package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS12_TC_42_MonthlyPay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.7.5/iHubstoressqlQA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Schemes")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"offer-badge\"]//h4[contains(text(),'iHub Monthly Pay')]")).click();
		Thread.sleep(2000);
		String Mainwindow = driver.getWindowHandle();
		java.util.Set<String> s1 = driver.getWindowHandles();
		java.util.Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();

		// Full Amount
		// driver.findElement(By.xpath("//input[@value=\"10\"]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"10\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);

		Thread.sleep(2000);
		WebElement checkbox0 = driver.findElement(By.xpath("//div[@class=\"cart-total\"]//button[@ng-click=\"CheckOut()\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
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
		driver.findElement(By.xpath("//button[@ng-click=\"GetStoreOTP_Valid('CashPaymentForm')\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"SOTP\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"InvoiceBtn print-hide\"]")).click();

	}
}