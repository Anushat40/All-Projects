package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS9_TC_28_RequestPrice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.7.5/iHubstoressqlQA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
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
		js.executeScript("arguments[0].click();", checkbox1);
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
		/*
		 * Cancel driver.findElement(By.xpath(
		 * "//div[@id=\"RequestPriceModal\"]//div[@class=\"modal-footer\"]//button[@ng-click=\"CancelModal()\"]"
		 * )).click();
		 */
		/*
		 * Close driver.findElement(By.xpath(
		 * "//div[@id=\"RequestPriceModal\"]//button[@class=\"close-btn\"]")).click();
		 */
		driver.findElement(By.xpath(
				"//div[@id=\"RequestPriceModal\"]//div[@class=\"modal-footer\"]//button[@ng-click=\"SaveRequestedProducts('RequestForm')\"]"))
				.click();

	}

}