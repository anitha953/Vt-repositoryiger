package DDT;
	import java.io.FileInputStream;
import java.util.Properties;

//org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class FetchingDataFromProperties_File {

		public static void main(String[] args) throws Throwable {
			
			WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
	        
	        //HardCoding
			driver.get("https://www.saucedemo.com/v1/");
	     driver.findElement(http://By.id("user-name")).sendKeys("standard_user");
	     driver.findElement(http://By.id("password")).sendKeys("secret_sauce");
	     driver.findElement(http://By.id("login-button")).click();*/
	    
	    //fetching data from Properties file
	     
	     //step1:-get the java representation object of the physical file
	     FileInputStream fis = new FileInputStream("/.src/test/resources/FileCommonData.properties");

	     //step2:-Create an object to properties class to load all the keys
	    Properties pro = new Properties();
	    pro.load(fis);
	    
	    //step3:-
	   String URL = pro.getProperty("url");
	   String USERNAME = pro.getProperty("username");
	   String PASSWORD = pro.getProperty("password");
		
	   driver.get(URL);
	   driver.findElement(http://By.id("user-name")).sendKeys(USERNAME);
	   driver.findElement(http://By.id("password")).sendKeys(PASSWORD);
	   driver.findElement(http://By.id("login-button")).click();
		
		
		
		
		
		}

	}
	 
}
