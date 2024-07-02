package Generic_Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.VtigerLoginPage;

public class BaseClass {

	public  WebDriver driver;
	public File_Utility flib =new File_Utility() ;
	public WebDriver_utility wlib =new WebDriver_utility() ;
	public Java_utility jlib= new Java_utility();
	public Excel_Utility elib = new Excel_Utility();
    public DataBaseUtility dlib=new DataBaseUtility();
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void bs() throws Throwable
	{
		dlib.dataBaseConnection(driver);
		System.out.println("DataBase Connection");
	}
	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void bt()
	{
		System.out.println("parallel execution");
	}
	@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void bc(String BROWSER) throws Throwable
	{
	// String BROWSER = flib.getKeyAndValueData("browser");
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
		System.out.println("Browser launched");
	}
	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void bm() throws Throwable
	{
	     String URL = flib.getKeyAndValueData("url");
		  String USERNAME = flib.getKeyAndValueData("username");
		  String PASSWORD = flib.getKeyAndVa lueData("password");
				
		  WebDriver_utility wlib = new WebDriver_utility();
		  wlib.maximizeWindow(driver);
		  wlib.waitForElementToLoad(driver);
				
		  driver.get(URL);
		  VtigerLoginPage login = new VtigerLoginPage(driver);
	     login.loginToApp(USERNAME, PASSWORD);
		System.out.println("login to Application");
	}
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void am()
	{
		
		HomePage home = new HomePage(driver);
		 home.logOut(driver);
		System.out.println("logout from application");
	}
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void ac()
	{
		driver.quit();
		System.out.println("close browser");
	}
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void at()
	{
		System.out.println("parallel execution done");
	}
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void as() throws Throwable
	{
		dlib.dataBaseClose();
		System.out.println("close database");
	}
}
 
//public class BaseClass {
//	@BeforeSuite
	//public void bs() {
		//System.out.println("Database connection");
	//}

	//@BeforeTest
	//public void bt() {
		//System.out.println("parallel execution");
	//}

	//@BeforeClass
	//public void bc() {
		//System.out.println("Browser launched");
	//}

	//@BeforeMethod
	//public void bm() {
		//System.out.println("login application");
	//}

  //	@AfterMethod
	//public void am() {
		//System.out.println("logout application");
	//}

//}
