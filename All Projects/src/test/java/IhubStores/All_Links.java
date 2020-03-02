package IhubStores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Links {

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
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		// Telivisons
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Televisions')]"))
				.click();
		Thread.sleep(5000);
		driver.navigate().back();
		/* Washing Machines
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Washing Machines')]"))
				.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Refrigerators')]"))
				.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		WebElement Link0= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Air conditioners')]"));
		 JavascriptExecutor js0 =(JavascriptExecutor) driver; 
		 js0.executeScript("arguments[0].click();",Link0);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		WebElement Link= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Water Dispensers')]"));
		 JavascriptExecutor js =(JavascriptExecutor) driver; 
		 js.executeScript("arguments[0].click();",Link);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		WebElement Link1= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Speaker Systems')]"));
		JavascriptExecutor js1 =(JavascriptExecutor) driver; 
		js1.executeScript("arguments[0].click();",Link1);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		 WebElement checkbox=driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Projectors')]"));
		 JavascriptExecutor js2 =(JavascriptExecutor) driver; 
		 js2.executeScript("arguments[0].click();",checkbox);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		 WebElement checkbox1= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Printer & Accessories')]"));
		 JavascriptExecutor js3 =(JavascriptExecutor) driver; 
		 js3.executeScript("arguments[0].click();",checkbox1);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		 WebElement checkbox2= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Freezers')]"));
		 JavascriptExecutor js4 =(JavascriptExecutor) driver; 
		 js4.executeScript("arguments[0].click();",checkbox2);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		 WebElement checkbox3= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'CD & DVD players')]"));
		 JavascriptExecutor js5 =(JavascriptExecutor) driver; 
		 js5.executeScript("arguments[0].click();",checkbox3);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		WebElement checkbox4= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Office Supplies')]"));
		 JavascriptExecutor js6 =(JavascriptExecutor) driver; 
		 js6.executeScript("arguments[0].click();",checkbox4);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		 WebElement checkbox5= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Cameras')]"));
		 JavascriptExecutor js7 =(JavascriptExecutor) driver; 
		 js7.executeScript("arguments[0].click();",checkbox5);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Cameras')]")).click();
		 WebElement checkbox6= driver.findElement(By.xpath("//div[@class='aside-filter']//div[@class=\"filter-list\"][2]//input[@value=\"Lithium\"]"));
		 JavascriptExecutor js8 =(JavascriptExecutor) driver; 
		 js8.executeScript("arguments[0].click();",checkbox6);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		Thread.sleep(2000);
		 WebElement checkbox9= driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Accessories')]"));
		 JavascriptExecutor js9 =(JavascriptExecutor) driver; 
		 js9.executeScript("arguments[0].click();",checkbox9);
		Thread.sleep(5000);
		driver.navigate().back();
		*/
//Home Appliances
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Home Appliances')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Water Purifiers')]"))
				.click();
		Thread.sleep(5000);
		driver.navigate().back();
		//Store Products
		Thread.sleep(2000);
		driver.findElement(By.linkText("Store Products")).click();
		
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Babies And Infants')]"))
				.click();
		Thread.sleep(5000);
		driver.navigate().back();
		//Women
		Thread.sleep(2000);
		driver.findElement(By.linkText("Store Products")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Women')]"))
				.click();
		Thread.sleep(5000);
		driver.navigate().back();
		//Toys Sports & Games
		Thread.sleep(2000);
		driver.findElement(By.linkText("Store Products")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Toys Sports & Games')]"))
				.click();
		Thread.sleep(5000);
		driver.navigate().back();
		//Girls
		Thread.sleep(2000);
		driver.findElement(By.linkText("Store Products")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Girls')]"))
				.click();
		Thread.sleep(5000);
		driver.navigate().back();
		//Grocery and Home Needs
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Grocery and Home Needs')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Pooja
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Pooja')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Party Supplies And Gifts
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Party Supplies And Gifts')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Electronics And Home Appliances
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics And Home Appliances')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Furniture, Furnishings & Home Decor
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Furniture, Furnishings & Home Decor')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Stationery
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Stationery')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Health And Wellness
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Health And Wellness')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Boys
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Boys')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Mobiles And Computers
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Mobiles And Computers')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Building And Construction
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Building And Construction')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Kitchen,Dining And Home Needs
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Kitchen,Dining And Home Needs')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Travel & Luggage
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Travel & Luggage')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Men
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Men')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
				//Electricals
				Thread.sleep(2000);
				driver.findElement(By.linkText("Store Products")).click();
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electricals')]"))
						.click();
				Thread.sleep(5000);
				driver.navigate().back();
		
	
	}

}