package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS6_TC_20_EMISlabadmin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
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
		// EMI Slab configure(Masters)
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][3]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][3]//li[@ng-repeat=\"j in i.SubMenus\"][7]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iH_Emi_Slab_Configuration_Controller\"]//input[@value=\"Save\"]"))
				.click();
		Thread.sleep(2000);
		// signout
		driver.findElement(By.xpath("//div[@class=\"navbar-custom-menu\"]//li[@class=\"dropdown user user-menu\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"navbar-custom-menu\"]//div[@ng-click=\"SignOut()\"]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}