package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_68_PartialConsignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		/*Consignments
		driver.findElement(By.xpath("//a[@ng-show=\"a.consignmetnshow\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Consignment_CheckController\"]//div[@ng-show=\"consignmetnshow\"]//input[@ng-if=\"Cons_Status==30\"]"))
				.click();
		driver.findElement(
				By.xpath("//div[@aria-labelledby=\"ng-confirm-box146817\"]//span[@class=\"ng-confirm-btn-text\"]"))
				.click();
				*/
		driver.findElement(By.xpath("//div[@ng-click=\"NewConsignmentsDamages()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-controller=\"iHub_Consignment_DamagesController\"]//input[@ng-model=\"ConsName\"]")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-controller=\"iHub_Consignment_DamagesController\"]//input[@ng-model=\"CreatedDate\"]"))
				.sendKeys("12/12/2019");
		driver.findElement(By.xpath("//div[@ng-controller=\"iHub_Consignment_DamagesController\"]//select[@ng-change=\"Get_Source_Units(source)\"]//option[@value=\"1\"]"))
		.click();
		driver.findElement(By.xpath("//div[@ng-controller=\"iHub_Consignment_DamagesController\"]//select[@ng-options=\"l.iHub_Unit_ID as l.Unit_Name for l in Dc_List\"]"))
				.click();
		// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
		driver.findElement(By.xpath("//div[@ng-controller=\"iHub_Consignment_DamagesController\"]//input[@ng-click=\"Search()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-controller=\"iHub_Consignment_DamagesController\"]//input[@ng-click=\"Reset()\"]")).click();
	}

}