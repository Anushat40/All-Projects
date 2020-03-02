package IhubDirect;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//li[@class=\"hidden-xs hidden-sm\"]//a[@ng-click=\"RegisterModal()\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"FullName\"]")).sendKeys("T.Anusha");
		driver.findElement(By.xpath(
				"//div[@ng-class=\"{'has-error':RegistrationForm.gender.$invalid && !RegistrationForm.gender.$pristine}\"]//label[@for=\"switch_right\"]"))
				.click();
		driver.findElement(By.xpath(
				"//form[@name=\"RegistrationForm\"]//div[@class=\"form-group row row-gutter6\"]//input[@name=\"MobileNumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//input[@name=\"EmailID\"]")).sendKeys("anusha.t@inativetech.com");
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath(
				"//div[@class=\"form-group row row-gutter6\"]//div[@class=\"col-sm-7 gutter6\"]//input[@name=\"ConfirmPassword\"]"))
				.sendKeys("Store.123");
		driver.findElement(By.xpath("//div[@class=\"TermsCond\"]//i[@class=\"check\"]")).click();
		driver.findElement(By.xpath("//button[@ng-click=\"Register_User('RegistrationForm')\"]")).click();
		driver.findElement(By.xpath("//form[@name=\"OtpForm\"]//input[@name=\"OTP\"]")).click();

		 driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		 driver.findElement(By.xpath("//div[@class=\"col-sm-6gutter6\"]//button[@ng-click=\"Cancel()\"]")).click();

	}

}
