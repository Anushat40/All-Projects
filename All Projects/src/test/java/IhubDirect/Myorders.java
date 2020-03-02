package IhubDirect;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myorders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//li[@class=\"hidden-xs hidden-sm\"]//a[@ng-click=\"SignIn()\"]")).click();
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//input[@name=\"userName\"]")).sendKeys("6309765343");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@class=\"btn btn-prime btn-block\"]")).click();
		driver.findElement(By.xpath(
				"//div[@id=\"mobile-menu\"]//li[@ng-if=\"UserMobileNumber!=undefined&&UserMobileNumber!=''&&UserMobileNumber!=null\"]//a[@ng-click=\"DataToggle()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"mobile-dropdown open\"]//a[@ng-click=\"Buyer_Order_Details()\"]"))
				.click();

		Thread.sleep(2000);
		//view
		WebElement checkbox = driver.findElement(By.xpath("//td[@class=\"text-center\"]//a[@class=\"fc-theme\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		//Cancel
		//driver.findElement(By.xpath("//tr[@ng-repeat=\"y in ViewOrderedProductsList\"]//span[@ng-click=\"CancelOrder(OrderID,y.Product_Id,y)\"]")).click();
		//Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@class='btn btn-red']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@class=\"ng-confirm-buttons\"]")).click();
	
	}
	

}