package IhubStores_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CategoryAttribute {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Admin
		driver.get("http://164.52.194.143/iHubBetaAdmin");
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
		// Categories
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]"))
				.click();
		// Attributes

		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]//li[@ng-repeat=\"j in i.SubMenus\"][2]"))
				.click();

		Thread.sleep(2000);
		// Grocery & Home needs expand
		WebElement checkbox = driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div[1]/div/div/ul/li[18]/i[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		// Grocery expand
		WebElement checkbox0 = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div[1]/div/div/ul/li[18]/div/ul/li[5]/i[1]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(2000);
		// Biscuits
		WebElement checkbox10 = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div[1]/div/div/ul/li[18]/div/ul/li[5]/div/ul/li[4]/i[2]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", checkbox10);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-node-label=\"CategoryName\"]//span[contains(text(),'Cakes & Rolls')]"))
				.click();
		Thread.sleep(2000);
		/*
		 * Add Atribute driver.findElement(By.xpath(
		 * "//form[@name=\"CategoryAttribute\"]//a[@value=\"Add\"]")).click();
		 * driver.findElement(By.xpath("//input[@name=\"name_3\"]")).sendKeys(
		 * "ProductType");
		 * driver.findElement(By.xpath("//input[@name=\"RamValues_3\"]")).
		 * sendKeys("Veg Roll"); Thread.sleep(2000);
		 */
		driver.findElement(By.xpath(
				"//div[@ng-show=\"catattributeshow\"]//button[@ng-click=\"SaveAttributes(CategoryAttributes,'CategoryAttribute')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"navbar-custom-menu\"]//li[@class=\"dropdown user user-menu\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"navbar-custom-menu\"]//div[@ng-click=\"SignOut()\"]")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		// Stores
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://164.52.194.143/iHubStoresBeta");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");

		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(50000);
		driver1.findElement(By.linkText("Grocery")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Grocery')]"))
				.click();
		Thread.sleep(2000);
		WebElement checkbox01 = driver1.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Biscuits & Chocolates')]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver1;
		js0.executeScript("arguments[0].click();", checkbox01);
		// driver1.findElement(
		// By.xpath("//div[@class='category-name
		// text-ellipsis']//p[contains(text(),'Biscuits & Chocolates')]"))
		// .click();
		Thread.sleep(2000);

		WebElement checkbox00 = driver1.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Cakes & Rolls')]"));
		JavascriptExecutor js00 = (JavascriptExecutor) driver1;
		js00.executeScript("arguments[0].click();", checkbox00);

	}

}