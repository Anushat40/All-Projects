package IhubStores_Admin;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProductMgmt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		/* Admin
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Product mgmt
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][5]"))
				.click();
		Thread.sleep(2000);
		// products
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[5]/ul/li[1]/a")).click();
		 Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//div/div/div/ul/li/i[2]")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//div/div/div/ul/li/div/ul/li[18]/i[2]")).click();
		Thread.sleep(2000);
		for (int i = 14; i <= 14; i++) {// category
			driver.findElement(By.xpath("(//div/div/div/ul/li/div/ul/li)[" + i + "]/i[2]")).click();
			List<WebElement> lb = (List<WebElement>) driver
					.findElements(By.xpath("(//div/div/div/ul/li/div/ul/li/div/ul)[" + i + "]/li/i[2]"));
			System.out.println(lb.size());
			for (int j = 0; j < 1; j++) {// sub category
				lb.get(j).click();
				driver.findElement(By.xpath("((//div/div/div/ul/li/div/ul/li/div/ul)[" + i + "]/li/div/ul/li/span)[4]"))
						.click();// + 1 to 32
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@value=\"Upload New Products\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@id=\"fileInput\"]"))
						.sendKeys("//home//anusha//Desktop//Ihub//Zeven.xlsx");
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//button[@value=\"Save\"])[1]")).click();
				Thread.sleep(2000);
				Actions a = new Actions(driver);
				a.sendKeys(Keys.CONTROL + "T").perform();
			}
		}

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open()");
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		*/
		  Thread.sleep(3000);
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name=\"userName\"])[1]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");

		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
	  Thread.sleep(3000);
		
		driver.findElement(By.linkText("Categories")).click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Men"))).perform();
		driver.findElement(By.linkText("Footwear")).click();
		Thread.sleep(2000);

		WebElement checkbox = driver.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Cakes & Rolls')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		// Clothing
		// Footwear
		// Accessories
		// School Supplies
		Thread.sleep(500);
		/*
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//div[@class='shopnow-btn']"));
		for (int v = 1; v < 2; v++) {// 123..
			li.get(v).click();
			Thread.sleep(1000);
			Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
			s.selectByVisibleText("Discount");
			Thread.sleep(500);
			List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
			Thread.sleep(500);
			for (int k = 11; k < 11; k++) {
				lc.get(k).click();
				Thread.sleep(2000);
			}
			// driver.navigate().back();
			Thread.sleep(1000);
		}
		// search
		
		  @Test public void add() throws InterruptedException, IOException {
		 driver.findElement(By.id("myInput")).sendKeys("watches"); Actions a = new
		 Actions(driver); a.sendKeys(Keys.ENTER).perform();
		 
		driver.findElement(By.xpath("//div[@class=\"media\"]//button[@class=\"btn buy-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"media\"]//button[@ng-click=\"Add_Product_ToCart(Product)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		Thread.sleep(2000);
		
		// Delete
		 driver.findElement(By.
		  xpath("//div[@class=\"col-sm-6 col-md-8 col-lg-8\"]//tr[@ng-repeat=\"item in cartItems\"]//a[@class=\"remove\"]"
		  )).click(); Thread.sleep(2000); //Yes
		 driver.findElement(By.xpath("//button[@class=\"btn btn-red\"]")).click();
		 //No
		  //driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
		 
	
		// Full Amount
		// driver.findElement(By.xpath("//input[@value=\"10\"]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"10\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		
		 // Booking Amount 
		Thread.sleep(2000);
		  //driver.findElement(By.xpath("//input[@value=\"20\"]")).click(); 
		WebElement checkbox10 = driver.findElement(By.xpath("//input[@value=\"20\"]"));
		  JavascriptExecutor js10=(JavascriptExecutor) driver;
		 js10.executeScript("arguments[0].click();",checkbox10); //EMI
		 Thread.sleep(2000); WebElement checkbox0 =
		  driver.findElement(By.xpath("//input[@id=\"EMI-0\"]")); JavascriptExecutor
		  js0=(JavascriptExecutor) driver;
		  js0.executeScript("arguments[0].click();",checkbox0);
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"CheckOut()\"]")).click();
		// Store address
		WebElement link11 = driver.findElement(By.xpath(
				"//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", link11);
		Thread.sleep(2000);
	
		  Personal Address WebElement link10= driver.findElement(By.
		  xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"5054\"]"
		  )); JavascriptExecutor js10 =(JavascriptExecutor) driver;
		  js10.executeScript("arguments[0].click();",link10);
	
		
		 // Add New Address
		 driver.findElement(By.xpath("//div[@class=\"add-address\"]")).click();
		  driver.findElement(By.xpath(
		  "//div[@ng-show=\"addAddressShow\"]//input[@name=\"FullName\"]")).sendKeys(
		 "Lasya"); driver.findElement(By.xpath(
		 "//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Housenumber\"]")).
		 sendKeys("Madhapur"); driver.findElement(By.xpath(
		  "//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Street\"]")).sendKeys(
		  "Jublihilss"); driver.findElement(By.xpath(
		  "//div[@ng-show=\"addAddressShow\"]//input[@name=\"PinCode\"]")).sendKeys(
		  "500018"); driver.findElement(By.xpath(
		  "//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).clear()
		  ; driver.findElement(By.xpath(
		 "//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).
		  sendKeys("8186814540"); driver.findElement(By.xpath(
		  "//div[@class=\"inline-block\"]//input[@id=\"btnSave\"]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"text-center\"]//button[@type=\"button\"]")).click();
		Thread.sleep(2000);
		// Card types
		driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
		// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Card\"]")).click();
		// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
		// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"CCavenue\"]")).click();
		// Payment types
		// driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MAESTRO\"]")).click();
		
		  driver.findElement(By.xpath(
		  "//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MasterCard\"]"
		  )).click(); driver.findElement(By.xpath(
		  "//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Rupay\"]"
		  )).click(); driver.findElement(By.xpath(
		  "//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Visa\"]"
		 )).click();
		 
		// driver.findElement(By.xpath("//input[@name=\"CardNumber\"]")).sendKeys("4646");
		driver.findElement(By
				.xpath("//div[@class=\"tab-content\"]//div[@class=\"text-center\"]//button[@class=\"btn btn-prime\"]"))
				.click();
		*/

	}

}