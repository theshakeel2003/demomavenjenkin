package demomavenjenkin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSampleTest {

	
	WebDriver driver;
		
			
		@BeforeTest
		public void setup()
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//			WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
				
				//	String chPath= SeleniumManager.getDriverPath("chromeDriver");
		//	ChromeOptions co = new ChromeOptions();
		//	co.addArguments("--remote-allow-origin=*");
				
		//		driver = new ChromeDriver();
				driver.get("https://www.alramz.ae/");
			    System.out.println("url opened");
					
		}
		
		
		@Test
		public void testcase1() {
			    
		      
		     	    
		        String expectedTitle = "Home | Al Ramz - Al Ramz Corporation PJSC - WE LIVE BY OUR WORD";
		        String originalTitle = driver.getTitle();
		
		        Assert.assertEquals(originalTitle, expectedTitle);
		        System.out.println("testcase1- passed");
						
	}

		@Test
		public void testcase2() {
			    
		       String expectedTitle = "Home | Al Ramz - Al Ramz Corporation PJSC - WE LIVE BY OUR WORD";
		        String originalTitle = driver.getTitle();
		
		        Assert.assertEquals(originalTitle, expectedTitle);
		        System.out.println("testcase2- passed");
	}
		
		
		@Test
		public void testcase3() {
			    
		      
		     
			String expectedTitle = "Home | Al Ramz - Al Ramz Corporation PJSC - WE LIVE BY OUR WORD";
	        String originalTitle = driver.getTitle();
	
	        Assert.assertEquals(originalTitle, expectedTitle);
	        System.out.println("testcase3- passed");
				
	}
		
		
		
		@AfterTest
		public void CloseBrowser() {
			driver.close();
		
		}
		
		
		
}
