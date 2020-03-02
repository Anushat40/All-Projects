package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS6_TC_19_EMIApprovaladmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://205.147.109.73/iHubMultistoresAdminTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("emiadmin@Ihubstores.In");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"Admin_SignIn('LoginForm')\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		//EMI approval request
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNo\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
		Thread.sleep(2000);
		/*
		driver.findElement(By.xpath("//input[@id=\"btnReset\"]")).click();
		driver.findElement(By.xpath("//span[@title=\"Edit\"]")).click();
		Thread.sleep(2000);
		/*Tenure
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-change=\"ChangeChildOffer(OfferSubChildID)\"]")));
		s.selectByValue("number:1");
		//min
		driver.findElement(By.xpath("//input[@name=\"min\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"min\"]")).sendKeys("1");
		//max
		driver.findElement(By.xpath("//input[@name=\"max\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"max\"]")).sendKeys("2");
		//Expire Time
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"editList.Approved_Time_Limit\"]")));
		s.selectByValue("number:6");
		Select s1=new Select(driver.findElement(By.xpath("//select[@ng-model=\"editList.EMI_Config_Status\"]")));
		Thread.sleep(2000);
		s1.selectByValue("20");
		
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
	//	driver.findElement(By.xpath("//input[@value=\"Cancel\"]")).click();
	  */
	 
				driver.findElement(By.xpath("//li[@class=\"dropdown user user-menu\"]")).click();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//div[@ng-click=\"ChangePassword()\"]")).click();
			driver.findElement(By.xpath("//div[@ng-click=\"SignOut()\"]")).click();
	}

}