package IhubBusiness;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
public class Baseclass {

	public static WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports report;

	@DataProvider(name = "test")
	public Object[][] dp() throws IOException {
		FileInputStream fis = new FileInputStream("/home/anushat/Desktop/testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		System.out.println(sh.getLastRowNum());
		for (int i = 2; i <= sh.getLastRowNum(); i++) {
			return new String[][] { new String[] { sh.getRow(i).getCell(1).getStringCellValue(),
					sh.getRow(i).getCell(2).getStringCellValue() } };
		}
		return dp();
	}

	@BeforeSuite
	public void suite() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/extent report.html");
		report = new ExtentReports();
		report.attachReporter(reporter);
	}

	@AfterMethod
	public void endtest(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			String temp = Utility.getScreenshot(driver);
			test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		driver.quit();
		report.flush();
	}

	@AfterSuite
	public void afterSuite() throws InterruptedException, IOException {

		report.flush();
//	 WebDriver driver= new ChromeDriver();
//	  System.setProperty("WebDriver.chrome.driver", System.getProperty("user+dir")+"//Drivers/chromedriver_linux64.exe");
//	  ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//	  driver.get("https://webmail.123-reg.co.uk/login/");
//	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//	  driver.manage().window().maximize();
//	
//	  driver.findElement(By.xpath("//input[@class=\"input input-big\"]")).sendKeys("vikasavarma.n@inativetech.com");
//	  driver.findElement(By.id("password-id")).sendKeys("Inative@135");
//	  driver.findElement(By.xpath("//button[@class=\"cta cta--primary\"]")).click();
//	  Thread.sleep(30000);
//	  driver.findElement(By.xpath("//a[@data-action=\"compose\"]")).click();
//	  Thread.sleep(1000);
// //  driver.switchTo().alert().accept();
//  	
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@class=\"token-input tt-input\"])[1]")).sendKeys("dubbaprasannakumar@inativetech.com");
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//a[@data-type='cc']")).click();
////		Thread.sleep(1000);
////		driver.findElement(By.xpath("(//input[@class='token-input tt-input'])[2]")).sendKeys("phanesh.k@inativetech.com");
////		Thread.sleep(3000);
//		
////		driver.findElement(By.xpath("//input[@name=\"subject\"]")).sendKeys("string sub");
//		
//	//	String image=System.getProperty("user.dir")+"//Scren Shorts/"+System.currentTimeMillis()+".png";
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@class=\"btn btn-link\"])[4]")).sendKeys("/home/vikas/Downloads/IMG_20190115_173630.jpg");
//       Thread.sleep(5000);
//    //   Runtime.getRuntime().exec("/home/vikas/Downloads/IMG_20190115_173630.jpg");
//		
//		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
//	
//  // d.findElement(By.xpath("//a[@data-action=\"compose\"]")).click();
//   //System.out.print("successfully login to webmail123....");
//   //d.findElement(By.id("background-loader")).click(); 
////driver.findElement(By.xpath("(//div[@class=\"contact-picture\"])[1]")).click();
////driver.findElement(By.xpath("//a[@data-name=\"logout\"]")).click();
	}

	public static class Utility {

		public static String getScreenshot(WebDriver driver) {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File src = ts.getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir") + "//Scren Shorts/" + System.currentTimeMillis() + ".png";

			File destination = new File(path);

			try {
				FileUtils.copyFile(src, destination);
			} catch (IOException e) {
				System.out.println("Capture Failed " + e.getMessage());
			}

			return path;
		}

	}
}