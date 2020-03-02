package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS3_TC_008_Register {

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

		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-if=\"User_Mobile_Number==undefined||User_Mobile_Number==''||User_Mobile_Number==null\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(3000);
		WebElement checkbox0 = driver
				.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"RegisterModal()\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-body\"]//input[@id=\"FullName\"]")).sendKeys("Text");
		driver.findElement(By.xpath("//div[@class=\"modal-body\"]//label[@for=\"switch_left\"]")).click();
driver.findElement(By.xpath("//div[@class=\"modal-body\"]//input[@id=\"RigMobileNumber\"]")).sendKeys("8186814540");
driver.findElement(By.xpath("//div[@class=\"modal-body\"]//input[@name=\"EmailID\"]")).sendKeys("anusha.t@inativetech.com");
driver.findElement(By.xpath("//div[@class=\"modal-body\"]//input[@id=\"Password\"]")).sendKeys("Store.123");
driver.findElement(By.xpath("//div[@class=\"modal-body\"]//input[@id=\"ConfirmPassword\"]")).sendKeys("Store.123");

driver.findElement(By.xpath("//div[@class=\"modal-body\"]//i[@class=\"check\"]")).click();
driver.findElement(By.xpath("//div[@class=\"modal-body\"]//button[@ng-click=\"Register_User('RegistrationForm')\"]")).click();
//driver.findElement(By.xpath("//div[@class=\"modal-body\"]//div[@class=\"col-sm-6 gutter6\"]//button[@ng-click=\"Cancel()\"]")).click();
//OTP
driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@value=\"Continue\"]")).click();
driver.findElement(By.xpath("//div[@class=\"modal-content\"]//a[@ng-click=\"GetStoreOTP('OtpForm')\"]")).click();



	}

}