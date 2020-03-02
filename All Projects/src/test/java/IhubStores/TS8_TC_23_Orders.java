package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS8_TC_23_Orders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://205.147.109.73/iHubMultistoresStoreTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"Open_Manual_Pdf()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"ManualFolders\"]//a[@title=\"Orders\"]")).click();
		driver.findElement(By.xpath("//div[@ng-show=\"HelpManuals\"]//input[@type=\"text\"]")).sendKeys("Text");
		Thread.sleep(2000);
		//Search
		driver.findElement(By.xpath("//div[@ng-show=\"HelpManuals\"]//button[@title=\"Search\"]")).click();
		//Reset
		driver.findElement(By.xpath("//div[@ng-show=\"HelpManuals\"]//input[@id=\"btnReset\"]")).click();
		//Back
		driver.findElement(By.xpath("//div[@ng-show=\"HelpManuals\"]//button[@value=\"Back\"]")).click();

	}

}