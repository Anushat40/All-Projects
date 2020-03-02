package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS16_HomepageBanner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		Thread.sleep(2000);
		//Exclusive Deals
		WebElement checkbox1 = driver
				.findElement(By.xpath("//div[@class=\"col-xs-12 col-sm-6 col-md-6 col-lg-6 equal-height-cat\"][2]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox1);
		js1.executeScript("window.scrollBy(0,750)");
		
		//Snippets
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
		
		//New Arrivals
		// Logo
		WebElement checkbox12 = driver
				.findElement(By.xpath("//div[@class=\"navbar-header\"]//img[@src=\"dist/images/logo.png\"]"));
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		js12.executeScript("arguments[0].click();", checkbox12);
		Thread.sleep(2000);
		WebElement checkbox13 = driver
				.findElement(By.xpath("//div[@class=\"add-banner container\"][4]"));
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		js13.executeScript("arguments[0].click();", checkbox13);
		Thread.sleep(3000);
		// js1.executeScript("window.scrollBy(0,3000)");
		js1.executeScript("arguments[0].scrollIntoView();", checkbox1);
		/*Thread.sleep(3000);
		WebElement checkbox01 = driver.findElement(By.xpath("//div[@class=\"add-banner container\"][4]"));
		JavascriptExecutor js01 = (JavascriptExecutor) driver;
		js01.executeScript("arguments[0].click();", checkbox01);
*/
		Thread.sleep(3000);
		
		//Shop by brands
		// Logo
		WebElement checkbox14= driver
				.findElement(By.xpath("//div[@class=\"navbar-header\"]//img[@src=\"dist/images/logo.png\"]"));
		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		js14.executeScript("arguments[0].click();", checkbox14);
		Thread.sleep(3000);
		WebElement checkbox15 = driver.findElement(
				By.xpath("//section[@ng-show=\"authentication.BannerShow\"]//data-owl-carousel[@id=\"ShopBrand\"]"));
		JavascriptExecutor js15 = (JavascriptExecutor) driver;
		js15.executeScript("arguments[0].click();", checkbox15);
		js15.executeScript("arguments[0].scrollIntoView();", checkbox15);
	}

}