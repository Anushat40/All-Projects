package IhubStores_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chequefilesadmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://164.52.194.143/iHubBetaAdmin");
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(5000);
		driver3.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(5000);
		driver3.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]")).click();
		Thread.sleep(2000);
		driver3.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]//li[@ng-repeat=\"j in i.SubMenus\"][1]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@ng-controller=\"ChequeOrderController\"]//input[@ng-model=\"UnitName\"]"))
				.sendKeys("Chandrugonda Store");
		driver3.findElement(
				By.xpath("//div[@ng-controller=\"ChequeOrderController\"]//button[@title=\"SearchOrders\"]")).click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//DIV[@ng-controller=\"ChequeOrderController\"]//select[@ng-model=\"i.CounterFile_Status\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
	}

}