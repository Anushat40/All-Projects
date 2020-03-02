package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS9_TC_27_Sortby {
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
		// Low To High
		driver.findElement(By.xpath(
				"//ul[@class=\"sort-by list-inline\"]//select[@ng-change=\"filterBysort()\"]//option[@value=\"L\"]"))
				.click();
		// High To Low
		driver.findElement(By.xpath(
				"//ul[@class=\"sort-by list-inline\"]//select[@ng-change=\"filterBysort()\"]//option[@value=\"H\"]"))
				.click();
	}

}