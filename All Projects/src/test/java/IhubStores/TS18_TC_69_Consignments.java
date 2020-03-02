package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS18_TC_69_Consignments {

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
		driver.findElement(By.xpath("//div[@ng-click=\"NewConsignments()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iHub_Consignment_Controller\"]//input[@ng-model=\"ConsName\"]"))
				.sendKeys("");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iHub_Consignment_Controller\"]//input[@ng-model=\"CreatedDate\"]"))
				.sendKeys("12/12/2019");
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Consignment_Controller\"]//select[@ng-change=\"Get_Source_Units(source)\"]//option[@value=\"1\"]"))
				.click();
//		driver.findElement(
//				By.xpath("//div[@ng-controller=\"iHub_Consignment_Controller\"]//select[@ng-model=sourceID\"]"))
//				.click();
		/*New
		 driver.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Consignment_Controller\"]//select[@ng-model=\"Status\"]//option[@value=\"10\"]"))
				.click(); 
		 */
		/*Picked Up
		 driver.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Consignment_Controller\"]//select[@ng-model=\"Status\"]//option[@value=\"20\"]"))
				.click(); 
		 */
		//Deliverd
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Consignment_Controller\"]//select[@ng-model=\"Status\"]//option[@value=\"30\"]"))
				.click();
				
		/*Recieved
		 driver.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Consignment_Controller\"]//select[@ng-model=\"Status\"]//option[@value=\"40\"]"))
				.click(); 
		 */
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iHub_Consignment_Controller\"]//input[@ng-click=\"Search()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iHub_Consignment_Controller\"]//input[@ng-click=\"Reset()\"]"))
				.click();
	}

}