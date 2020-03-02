package IhubStores_Admin;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Admin
		driver.get("http://205.147.109.73/iHubMultistoresAdminTRG");
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
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][12]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][12]//li[@ng-repeat=\"j in i.SubMenus\"][3]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@ng-model=\"LinkTypeID\"]//option[@label=\"About Us Store\"]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]"))
				.sendKeys("Text");
	}

}