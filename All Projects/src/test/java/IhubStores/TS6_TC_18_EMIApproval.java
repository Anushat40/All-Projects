package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS6_TC_18_EMIApproval {

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
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"EMIconfig()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"EMIconfig()\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		

		/*Create EMI Approval Request
		WebElement checkbox = driver.findElement(
				By.xpath("//div[@class=\"box-container\"]//input[@value=\"Create EMI Approval Request\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//input[@name=\"MobileNumber\"]")).sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//input[@id=\"Min\"]")).sendKeys("0");
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//input[@id=\"Max\"]")).sendKeys("2");
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//select[@name=\"SelectTenure\"]//option[@value=\"number:2\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//textarea[@name=\"Description\"]")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@ng-click=\"Save_EMIdetails('BuyerEMIsettingsForm')\"]")).click();
		//driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[@class=\"modal-footer\"]//button[@class=\"btn btn-light btn-block\"]")).click();
		
		 */
		 // Mobile number 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"box-container\"]//input[@name=\"MobileNumber\"]")).sendKeys(Keys.ENTER); 
		driver.findElement(By.xpath("//div[@class=\"box-container\"]//input[@name=\"MobileNumber\"]")).sendKeys("6309765343"); 
		driver.findElement(By.xpath("//div[@class=\"box-container\"]//input[@ng-click=\"SearchEMIRequest()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]")).click();
	
		Thread.sleep(2000);
		WebElement checkbox11 = driver
				.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li/span/ul/li[8]/a"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", checkbox11);
	
		
	}
	

}