package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS10_TC_30_Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://205.147.109.73/iHubMultistoresStoreTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		//Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		//Clear
		//driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"button\"]")).click();
		//Electronics
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Electronics")).click();
		 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]")) .click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Televisions')]")) .click(); 
		 Thread.sleep(2000);
		 WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Onida']"));
		 JavascriptExecutor js1 =(JavascriptExecutor) driver; 
		 js1.executeScript("arguments[0].click();",checkbox1);
		 Thread.sleep(2000);
		 WebElement checkbox2 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value=\"43 Inches\"]"));
		 JavascriptExecutor js2 =(JavascriptExecutor) driver; 
		 js2.executeScript("arguments[0].click();",checkbox2);
		 Thread.sleep(2000);
		 WebElement checkbox3 = driver.findElement(By.xpath("//div[@class='filter-list'][4]//input[@value=\"2\"]"));
		 JavascriptExecutor js3 =(JavascriptExecutor) driver; 
		 js3.executeScript("arguments[0].click();",checkbox3);
		 Thread.sleep(2000);
		 WebElement checkbox4 = driver.findElement(By.xpath("//div[@class='filter-list'][5]//input[@value=\"2\"]"));
		 JavascriptExecutor js4 =(JavascriptExecutor) driver; 
		 js4.executeScript("arguments[0].click();",checkbox4);
		 Thread.sleep(2000);
		 WebElement checkbox5 = driver.findElement(By.xpath("//div[@class='filter-list'][6]//input[@value=\"FHD LED\"]"));
		 JavascriptExecutor js5 =(JavascriptExecutor) driver; 
		 js5.executeScript("arguments[0].click();",checkbox5);
		 Thread.sleep(2000);
		 WebElement checkbox6 = driver.findElement(By.xpath("//div[@class='filter-list'][7]//input[@value=\"1 Year\"]"));
		 JavascriptExecutor js6 =(JavascriptExecutor) driver; 
		 js6.executeScript("arguments[0].click();",checkbox6);
		 Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class=\"media\"]//button[@class=\"btn buy-btn\"]")).click();
		   Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("6309765343");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class=\"media\"]//button[@ng-click=\"Add_Product_ToCart(Product)\"]")).click();
			
		
	}

}