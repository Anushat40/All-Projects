package IhubDirect;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AgricultureEquipments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://205.147.109.73/iHubDirectUAT");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		 Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
			a.moveToElement(driver.findElement(By.linkText("Agriculture And Equipments"))).perform();
			driver.findElement(By.linkText("Motor Pumps & Pipes")).click();
//			Motor Pumps & Pipes
//			Agri Implements
//			Sprayers
			Thread.sleep(500);
			List<WebElement> lb = (List<WebElement>) driver.findElements(By.xpath("//div[@class='shopnow-btn']"));
			for(int v=0;v<lb.size();v++) {//123..
			lb.get(v).click();
			Thread.sleep(1000);
			Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
			s.selectByVisibleText("Discount");
			
			Thread.sleep(500);
			List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
			Thread.sleep(500);
			for(int i=0;i<=2;i++) {
				lc.get(i).click();
				Thread.sleep(2000);}
			driver.navigate().back();
			Thread.sleep(1000);}
	  }
	
		/*a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Agriculture And Equipments"))).perform();
		driver.findElement(By.linkText("Tarpaulin")).click();
//		Tarpaulin
//		Milking Machines
//		Oil Making Machince
//		Agriculture Tools
//		Brush Cutters
//		Gardening
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			lc.get(i).click();
			Thread.sleep(1000);
			*/
	}

