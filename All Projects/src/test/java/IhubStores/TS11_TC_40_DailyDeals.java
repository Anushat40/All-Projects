package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS11_TC_40_DailyDeals {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.7.5/iHubstoressqlQA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
	
		driver.findElement(By.linkText("Daily Deals")).click();
		/*Dynamic Data
		List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=3;i++) {
			lc.get(i).click();
			Thread.sleep(2000);}
		List<WebElement> items = (List<WebElement>) driver.findElements(By.xpath("//img[@class='product-img']"));
		Thread.sleep(500);
		System.out.println(items.size());
		*/
		
	}

}