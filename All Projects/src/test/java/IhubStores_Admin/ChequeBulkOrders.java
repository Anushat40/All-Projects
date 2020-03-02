package IhubStores_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChequeBulkOrders {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Vendor product
		// create bulk orders
		// Raise bulk orders
		// counter files
		// operations team
		// logistic admin
		// superadmin
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();
		// Admin
		driver.get("http://164.52.194.143/iHubBetaAdmin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Bulk Order
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][7]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][7]//li[@ng-repeat=\"j in i.SubMenus\"][4]"))
				.click();
		Thread.sleep(2000);
		// Ihub
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"bulkordersController\"]//div[@ng-show=\"Treeview\"]//li[@data-ng-repeat=\"node in UnitDataNode\"]/i[2]"))
				.click();
		Thread.sleep(2000);
		// Hyderabad DC
		driver.findElement(By.xpath(
				"//li[@data-ng-repeat=\"node in node.children\"]//i[@data-ng-click=\"tree01.selectNodeHead(node)\"][2]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@data-ng-repeat=\"node in node.children\"][3]//i[@class=\"expanded\"]"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div/div/ul/li/div/ul/li[1]/div/ul/li[3]/div/ul/li[1]/i[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div/div/ul/li/div/ul/li[1]/div/ul/li[3]/div/ul/li[1]/div/ul/li[12]/span/span"))
				.click();

		driver.findElement(By.xpath(
				"//div[@class=\"col-sm-8 col-md-8 col-lg-9 col-xl-9\"]//form[@name=\"Registration_Form\"]//input[@ng-model=\"Buyer_Mobile_Number\"]"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(
				"//div[@class=\"col-sm-8 col-md-8 col-lg-9 col-xl-9\"]//form[@name=\"Registration_Form\"]//input[@ng-model=\"Buyer_Mobile_Number\"]"))
				.sendKeys("6309765343");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@ng-repeat=\"address in
		// BuyerAddress_List\"][1]//div[@class=\"media-left\"]")).click();
		WebElement checkbox = driver.findElement(By.xpath(
				"//div[@ng-repeat=\"address in BuyerAddress_List\"][1]//div[@class=\"media-left\"]//i[@for=\"check-\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"BulkOrderSKUShow\"]//textarea[@name=\"SKUsearch\"]"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@ng-show=\"BulkOrderSKUShow\"]//textarea[@name=\"SKUsearch\"]"))
				.sendKeys("099B-101023");
		driver.findElement(By.xpath("//div[@ng-show=\"BulkOrderSKUShow\"]//input[@value=\"Search\"]")).click();
		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@ng-change=\"ChangeBulkSP(Productslist)\"]"))
				.sendKeys("180");
		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@name=\"Quantity0\"]")).clear();
		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@name=\"Quantity0\"]")).sendKeys("10");
		Thread.sleep(2000);
		// Booking amount
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[2]/div/form[3]/div[2]/table/tbody/tr[1]/td/div[1]/label[1]/i"))
				.click();

		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@name=\"bookpay\"]")).sendKeys("800");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@value=\"Raise Bulk Order\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-green\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		driver.close();
		Thread.sleep(2000);

		// Stores Bulk Orders

		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://164.52.194.143/iHubStoresBeta");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Chandrugonda@ihubstores.in");
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		driver1.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@ng-click=\"SignIn('LoginForm')\"]")).click();
		Thread.sleep(4000);
		WebElement checkbox1 = driver1.findElement(By.xpath("//div[@ng-click=\"getBulkOrders()\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver1;
		js1.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(4000);
		// Raised bulk orders
		WebElement checkbox12 = driver1
				.findElement(By.xpath("//div[@ng-click=\"AllRaisedBulkOrders('Raised Bulk Orders')\"]"));
		JavascriptExecutor js12 = (JavascriptExecutor) driver1;
		js12.executeScript("arguments[0].click();", checkbox12);
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");

		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-click=\"SearchOrders(Orders,orderPaymentmode)\"]"))
				.click();
		Thread.sleep(2000);
		// Order Id
		driver1.findElement(By.xpath("(//tbody/tr/td)[5]")).click();

		driver1.findElement(By.xpath("//div[@ng-show=\"raisedgrid\"]//span[@value=\"Cancel\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@ng-show=\"allraisedgrid\"]//button[@ng-click=\"AddRaisedBulkOrderedProducts()\"]"))
				.click();
		Thread.sleep(2000);
		// driver1.findElement(By.xpath("//div[@id=\"myOrdersModal\"]//div[@ng-show=\"cashandcard\"]//label[1]")).click();
		// driver1.findElement(By.xpath("//div[@id=\"myOrdersModal\"]//input[@ng-show=\"GetOTPShow\"]")).click();
		driver1.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//input[@name=\"ChequeNumber\"]"))
				.sendKeys("123321");
		driver1.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//input[@name=\"Name\"]")).sendKeys("Text");
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@class=\"payment-opt-tab\"]//select[@name=\"BankName\"]//option[@label=\"HDFC\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@id=\"cheque\"]//button[@ng-click=\"GetStoreOTP_Valid('ChequePaymentForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//form[@name=\"StoreOtpForm\"]//input[@name=\"SOTP\"]")).sendKeys("123456");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
		Thread.sleep(2000);
		driver1.close();
		Thread.sleep(2000);

		// Create bulk orders
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver12 = new ChromeDriver();
		driver12.get("http://164.52.194.143/iHubStoresBeta");
		driver12.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver12.manage().window().maximize();
		driver12.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Chandrugonda@ihubstores.in");
		driver12.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		driver12.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@ng-click=\"SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(4000);
		WebElement checkbox121 = driver12.findElement(By.xpath("//div[@ng-click=\"getBulkOrders()\"]"));
		JavascriptExecutor js121 = (JavascriptExecutor) driver12;
		js121.executeScript("arguments[0].click();", checkbox121);
		Thread.sleep(4000);
		Thread.sleep(4000);
		WebElement checkbox11 = driver12
				.findElement(By.xpath("//div[@ng-click=\"CreatedBulkOrders('Created Bulk Orders', 'Total')\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver12;
		js11.executeScript("arguments[0].click();", checkbox11);
		Thread.sleep(2000);
		driver12.findElement(By.xpath("//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]")).click();
		Thread.sleep(2000);
		// Orderid
		driver12.findElement(
				By.xpath("//*[@id=\"top\"]/div/div[5]/ng-view/div/div[3]/div[4]/div[2]/table/tbody/tr[2]/td[2]"))
				.click();
		// Product Location
		driver12.findElement(By.xpath("//a[@ng-click=\"NewToggleGroup(y,y.Product_Id)\"]")).click();
		Thread.sleep(2000);
		driver12.findElement(By.xpath("//button[@ng-click=\"BulkOrderMakepay(ViewOrderedProductsList)\"]")).click();
		// Make payment
		Thread.sleep(2000);

		driver12.findElement(By.xpath("//div[@id=\"myOrdersModal\"]//div[@ng-show=\"cashandcard\"]//label[1]")).click();
		driver12.findElement(By.xpath("//div[@id=\"myOrdersModal\"]//input[@ng-show=\"GetOTPShow\"]")).click();

		Thread.sleep(2000);
		driver12.findElement(By.xpath("//form[@name=\"StoreOtpForm\"]//input[@name=\"SOTP\"]")).sendKeys("123456");
		Thread.sleep(2000);

		driver12.findElement(
				By.xpath("//div[@id=\"myOrdersModal\"]//button[@ng-click=\"Confirm_OTP('StoreOtpForm')\"]")).click();
		Thread.sleep(2000);
		driver12.close();
		Thread.sleep(2000);
		// Create counter files
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver4 = new ChromeDriver();
		driver4.get("http://164.52.194.143/iHubStoresBeta");
		driver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver4.manage().window().maximize();
		driver4.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Chandrugonda@ihubstores.in");
		driver4.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		driver4.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver4.findElement(By.xpath("//div[@ng-click=\"ToCounterFiles()\"]")).click();
		Thread.sleep(2000);
		driver4.findElement(By.xpath("//div[@ng-click=\"PaymentTypeForCheque()\"]")).click();
		Thread.sleep(2000);
		driver4.findElement(By.xpath("//div[@ng-click=\"ChequePaymentStatus('Cheque', 'PENDING')\"]")).click();
		Thread.sleep(2000);
		driver4.close();
		driver4.findElement(
				By.xpath("//div[@ng-controller=\"CounterfilesController\"]//input[@ng-checked=\"isChecked\"]")).click();
		driver4.findElement(
				By.xpath("//div[@ng-controller=\"CounterfilesController\"]//input[@ng-model=\"checkfileforcheque\"]"))
				.sendKeys("//home//anusha//Desktop//download.jpeg");
		driver4.findElement(By.xpath(
				"//div[@ng-controller=\"CounterfilesController\"]//button[@ng-click=\"SaveChequeCounterFile(i)\"]"))
				.click();
		// admin counter files
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver30 = new ChromeDriver();
		driver30.get("http://164.52.194.143/iHubBetaAdmin");
		driver30.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver30.manage().window().maximize();
		driver30.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver30.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver30.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver30.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver30.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]")).click();
		Thread.sleep(2000);
		driver30.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][10]//li[@ng-repeat=\"j in i.SubMenus\"][1]"))
				.click();
		Thread.sleep(2000);
		driver30.findElement(By.xpath("//div[@ng-controller=\"ChequeOrderController\"]//input[@ng-model=\"UnitName\"]"))
				.sendKeys("Chandrugonda Store");
		driver30.findElement(
				By.xpath("//div[@ng-controller=\"ChequeOrderController\"]//button[@title=\"SearchOrders\"]")).click();
		Thread.sleep(2000);
		driver30.findElement(By.xpath(
				"//DIV[@ng-controller=\"ChequeOrderController\"]//select[@ng-model=\"i.CounterFile_Status\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver30.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver30.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		Thread.sleep(2000);

		driver30.close();
		// operationsteam
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver2 = new ChromeDriver();
		// Admin
		driver2.get("http://164.52.194.143/iHubBetaAdmin");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("operationsteam@ihubstores.in");
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// DC nd Vendor orders
		driver2.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][11]"))
				.click();
		Thread.sleep(2000);
		// Vendor orders inbound
		driver2.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][11]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][1]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@class=\"content-wrapper\"]//select[@ng-model=\"source\"]//option[@label=\"Kusumachi Warehouse cum store\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//button[@title=\"SearchOrders\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@class=\"content-wrapper\"]//tr[@ng-repeat=\"row in Ordered_Products\"]//input[@value=\"InBound Quantity\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//input[@value=\"Inbound Stock\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//div[@class=\"ng-confirm-buttons\"]")).click();
		Thread.sleep(2000);
		// pending DC orders
		driver2.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][11]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][2]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@class=\"content-wrapper\"]//input[@ng-click=\"UpdateToPacked(row)\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//div[@class=\"ng-confirm-buttons\"]")).click();
		// Inventory Management
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][3]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][3]//li[@ng-repeat=\"g in j.SubMenus\"][1]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SelSource\"]//option[@value=\"1\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SourceID\"]//option[@label=\"Hyderabad DC\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SelDest\"]//option[@value=\"2\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"DestID\"]//option[@label=\"Kusumachi Warehouse cum store\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//a[@ng-click=\"ViewProductsGrid(i.UnitID,i.ID,1)\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By
				.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//input[@ng-model=\"MobileNumber\"]"))
				.sendKeys("6309765343");
		Thread.sleep(2000);
		driver2.findElement(
				By.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//button[@id=\"btnSearch\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@ng-show=\"consignment\"]//i[@class=\"check\"]")).click();
		driver2.findElement(By.xpath(
				"//div[@ng-controller=\"Create_DC_ConsignmentController\"]//input[@value=\"Create Consignment\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//div[@class=\"ng-confirm-buttons\"]")).click();
		Thread.sleep(2000);
		driver2.close();

		// Logistic Admin
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver3 = new ChromeDriver();
		// Admin
		driver3.get("http://164.52.194.143/iHubBetaAdmin");
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("logisticadmin@ihubstores.in");
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][2]")).click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//select[@ng-model=\"source\"]//option[@value=\"1\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//select[@ng-model=\"sourceID\"]//option[@label=\"Hyderabad DC\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//select[@ng-model=\"heirarchy\"]//option[@value=\"2\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//select[@ng-model=\"destinationID\"]//option[@label=\"Kusumachi Warehouse cum store\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//select[@ng-model=\"Status\"]//option[@value=\"10\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(
				By.xpath("//div[@ng-controller=\"iH_ConsignmentsViewController\"]//input[@id=\"btnSearch\"]")).click();
		Thread.sleep(2000);
		// Picked
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//div[@class=\"table-responsive\"]//select[@ng-model=\"StatusChange\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//select[@ng-model=\"Status\"]//option[@value=\"20\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(
				By.xpath("//div[@ng-controller=\"iH_ConsignmentsViewController\"]//input[@id=\"btnSearch\"]")).click();
		Thread.sleep(2000);
		// Delivered
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"iH_ConsignmentsViewController\"]//div[@class=\"table-responsive\"]//select[@ng-model=\"StatusChange\"]//option[@value=\"30\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-green\"]")).click();

		// Store Login
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver5 = new ChromeDriver();
		driver5.get("http://164.52.194.143/iHubStoresBeta");
		driver5.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver5.manage().window().maximize();
		driver5.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Chandrugonda@ihubstores.in");
		driver5.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		driver5.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@ng-click=\"SignIn('LoginForm')\"]")).click();
		Thread.sleep(4000);
		driver5.findElement(By.xpath(
				"//div[@ng-controller=\"iHub_Consignment_CheckController\"]//tr[@ng-repeat=\"a in Consignment_List \"]//a[@title=\"View Consignment\"]"))
				.click();
		Thread.sleep(2000);
		driver5.findElement(By.xpath(
				"//td[@ng-if=\"Cons_Status==30\"]//i[@ng-class=\"isGroupShown(a) ? 'fa-minus-square' : 'fa-plus-square'\"]"))
				.click();
		driver5.findElement(By.xpath("//tr[@ng-repeat=\"details in Inventory_List\"]//i[@class=\"check\"]")).click();
		Thread.sleep(2000);
		driver5.findElement(By.xpath("//div[@id=\"myModal\"]//input[@value=\"Consignment not yet received \"]"))
				.click();

		Thread.sleep(2000);
		driver5.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();

		Thread.sleep(2000);
		driver5.findElement(
				By.xpath("//div[@ng-controller=\"iHub_Consignment_CheckController\"]//a[@title=\"View Consignment\"]"))
				.click();
		Thread.sleep(2000);
		driver5.findElement(By.xpath(
				"//td[@ng-if=\"Cons_Status==30\"]//i[@ng-class=\"isGroupShown(a) ? 'fa-minus-square' : 'fa-plus-square'\"]"))
				.click();
		Thread.sleep(2000);
		driver5.findElement(By.xpath("//tr[@ng-repeat=\"details in Inventory_List\"]//i[@class=\"check\"]")).click();
		Thread.sleep(2000);
		driver5.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@ng-click=\"Accept_Consignment()\"]"))
				.click();

		Thread.sleep(2000);
		driver5.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();

	}

}