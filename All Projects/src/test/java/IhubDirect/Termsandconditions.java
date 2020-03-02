package IhubDirect;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Termsandconditions {
	public static void main(String[] args) throws InterruptedException {
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
		// Logo
		Thread.sleep(2000);
		WebElement checkbox = driver
				.findElement(By.xpath("//div[@class=\"navbar-header\"]//img[@src=\"dist/images/logo.png\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		WebElement checkbox1 = driver.findElement(By.xpath(
				"//div[@class=\"footer-top\"]//a[@ng-click=\"CustomerServiceview('Terms & Conditions','TERMSANDCONDITIONS')\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", checkbox1);

	}

}