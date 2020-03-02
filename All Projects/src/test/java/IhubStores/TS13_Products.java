package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS13_Products {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://205.147.109.73/iHubMultistoresStoreTRG/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"istorelogin\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"istorelogin\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"istorelogin\"]//button[@ng-click=\"SignIn('LoginForm')\"]"))
				.click();

		// Products
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

		// Related Products
		driver.findElement(By.xpath("//div[@class=\"body-section\"]//a[@class=\"view-details pull-right\"]")).click();
		Thread.sleep(2000);
		String Mainwindow = driver.getWindowHandle();
		java.util.Set<String> s1 = driver.getWindowHandles();
		java.util.Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);

				// driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();
			}
		}

		// driver.findElement(By.xpath("//section[@class=\"product-collection
		// section-info\"]")).click();
		WebElement checkbox6 = driver.findElement(By.xpath("//section[@class=\"product-collection section-info\"]"));
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("arguments[0].click();", checkbox6);
		js6.executeScript("arguments[0].scrollIntoView();", checkbox6);

		// Recent View
		driver.findElement(By.xpath("//div[@class=\"body-section\"]//a[@class=\"view-details pull-right\"]")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);

		String Mainwindow1 = driver.getWindowHandle();
		java.util.Set<String> s2 = driver.getWindowHandles();
		java.util.Iterator<String> i2 = s2.iterator();
		while (i2.hasNext()) {
			String ChildWindow = i2.next();
			if (!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);

			}
		}
		driver.findElement(
				By.xpath("//div[@ng-click=\"Qtyafter()\"]//button[@ng-click=\"Add_Product_ToCart(ProductDetails)\"]"))
				.click();
		// WebElement checkbox60 = driver
		// .findElement(By.xpath("//button[@ng-click=\"Add_Product_ToCart(ProductDetails)\"]"));
		// JavascriptExecutor js60 = (JavascriptExecutor) driver;
		// js60.executeScript("arguments[0].click();", checkbox60);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@name=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);

		WebElement checkbox60 = driver.findElement(By.xpath(
				"//div[@ng-controller=\"ProductDetailsController\"]//section[@ng-if=\"RecentlyViewedProducts.length!=0&&RecentlyViewedProducts!=null&&RecentlyViewedProducts.length!=undefined\"]"));
		JavascriptExecutor js60 = (JavascriptExecutor) driver;
		js6.executeScript("arguments[0].scrollIntoView();", checkbox6);
	}

}