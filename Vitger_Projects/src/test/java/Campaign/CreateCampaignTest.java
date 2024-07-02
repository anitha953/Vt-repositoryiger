package Campaign;

    import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import objectRepository.CreateCampaignsPage;
import objectRepository.HomePage;

	//@Listeners(Generic_Utilities.ListenerImp.class)
	public class  CreateCampaignTest extends BaseClass {

		@Test(groups = "smokeTest")
		public void createCampaignTest() throws Throwable {
			HomePage home = new home(driver);
	        home.clickMoreLink();
	        home.clickCampaignLink();
	     
	        CreateCampaignsPage campPage = new CreateCampaignTest(driver);
			
	        campPage.clickCampPlusSign();
	        int ranNum = jlib.getRandomNumber();
	        
	        String campaginName = elib.readExcelDataUsingDataFormatter("Campaign", 0, 0)+ranNum;
	        campPage.enterCampName(campaginName);
	        
	        TakesScreenshot tss = (TakesScreenshot)driver;
			File src = tss.getScreenshotAs(OutputType.FILE);
		//	File dest = new File("./ScreenShot.png");
			File dst = new File("./ScreenShots/"+"pic6"+".png");
				try {
					FileUtils.copyFile(src, dst);
				} catch (IOException e) {
					e.printStackTrace();
				}
	        
				 Assert.assertEquals(false, true);	
	            campPage.clickOnSaveButton();

	       
//	        ValidationAndVerification campvalidate = new ValidationAndVerification(driver);
//	        campvalidate.campData(driver, campaginName);

	  String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
	  
	 
	  //Assert.assertEquals(actData, campaginName);
	      
	  //Assert.assertTrue(actData.contains(campaginName));
	  
	 // Assert.assertTrue(actData.contains(campaginName),campaginName+"campaign name is not verified");
	  
	//  SoftAssert soft = new SoftAssert();
	//  soft.assertEquals(actData, campaginName);
	//  soft.assertAll();
		
		}

	}
	 
}
