package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS16_TC_52_Snippets {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://205.147.109.73/iHubMultistoresStoreTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		// Logo
		WebElement checkbox = driver
				.findElement(By.xpath("//div[@class=\"navbar-header\"]//img[@src=\"dist/images/logo.png\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		
		driver.findElement(By.linkText("Categories")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Store Products")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Kitchen")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Women")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Grocery")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Daily Deals")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Schemes")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Request Product")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"RequestProductModal\"]//button[@class=\"close-btn\"]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
	}

}