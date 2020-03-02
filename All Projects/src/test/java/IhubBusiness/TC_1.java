package IhubBusiness;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import IhubBusiness_DataProvider.Data;
import IhubBusiness_PageObjects.Login;

public class TC_1 extends Baseclass {
	@Test(dataProvider = "Anusha", dataProviderClass = Data.class)
	public void test(String u, String p) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/anushat/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.7.5/iHubbusiness");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Login l = new Login(driver);
		Login.signin(u, p);

		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("IhuBussiness"));

	}
}