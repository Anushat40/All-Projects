package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS7_TC_22_Changepwd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://205.147.109.73/iHubMultistoresStoreTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.321");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"Store_Asst_ChangePassword()\"]"))
				.click();
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@name=\"OldPassword\"]"))
				.sendKeys("Store.321");
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@name=\"NewPassword\"]"))
				.sendKeys("Store.123");
		driver.findElement(By.xpath("//div[@class=\"modal-dialog change-password\"]//input[@name=\"ConfirmPassword\"]"))
				.sendKeys("Store.123");
		Thread.sleep(2000);
		/*
		 * Cancel driver.findElement( By.xpath(
		 * "//div[@class=\"modal-content\"]//button[@ng-click=\"Cancel_Change_Password_Form()\"]"
		 * )) .click();
		 */
		/*Close
		driver.findElement(By.xpath("//div[@class=\"modal-dialog change-password\"]//button[@class=\"close-btn\"]"))
				.click();
				*/
		 driver.findElement(By.xpath("//div[@class=\"modal-dialog change-password\"]//button[@ng-click=\"Store_Asst_Confirm_ChangePassword('StoreChangePasswordForm')\"]")).click();
	}

}
