package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS17_TC_56_NeedHelp {
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
		Thread.sleep(3000);
		WebElement checkbox1 = driver
				.findElement(By.xpath("//div[@class=\"row row-gutter3\"]//h4[contains(text(),'NEED HELP?')]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(3000);
		//Refund Policy
		WebElement checkbox0 = driver
				.findElement(By.xpath("//div[@class=\"row row-gutter3\"]//a[@ng-click=\"CustomerServiceview('Refund Policy','Refund Policy')\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(5000);
		driver.navigate().back();
		//Cancellation Policy
		WebElement checkbox2 = driver
				.findElement(By.xpath("//div[@class=\"row row-gutter3\"]//a[@ng-click=\"CustomerServiceview('Cancellation Policy','Cancellation Policy')\"]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", checkbox2);
		Thread.sleep(5000);
		driver.navigate().back();
		
		//HELP CENTER
		WebElement checkbox3 = driver
				.findElement(By.xpath("//div[@class=\"row row-gutter3\"]//a[@ng-click=\"CustomerServiceview('Help Center','HELP CENTER')\"]"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", checkbox3);
		
	
		
	}

}