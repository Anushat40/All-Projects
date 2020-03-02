package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS19_TC_127_ForceRegistration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
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
		Thread.sleep(2000);
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Onida']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox1);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"media\"]//button[@class=\"btn buy-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"media\"]//button[@ng-click=\"Add_Product_ToCart(Product)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		Thread.sleep(2000);
		WebElement checkbox0 = driver.findElement(By.xpath("//div[@class=\"cart-total\"]//button[@type=\"button\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
		/* Store address
		WebElement link11 = driver.findElement(By.xpath(
				"//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", link11);
		*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"ForceRegistration\"]//input[@ng-model=\"FullName\"]"))
				.sendKeys("Anusha");
		driver.findElement(By.xpath("//div[@id=\"ForceRegistration\"]//label[@for=\"switch_right\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"ForceRegistration\"]//input[@ng-model=\"EmailID\"]"))
				.sendKeys("anusha.t@inativetech.com");
		driver.findElement(By.xpath("//div[@id=\"ForceRegistration\"]//i[@class=\"check\"]")).click();
		driver.findElement(
				By.xpath("//div[@id=\"ForceRegistration\"]//button[@ng-click=\"Register_User('RegistrationForm')\"]"))
				.click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath(
		// "//div[@id=\"ForceRegistration\"]//div[@class=\"col-sm-offset-5 col-sm-7
		// gutter6\"]//button[@type=\"button\"]"))
		// .click();

	}

}