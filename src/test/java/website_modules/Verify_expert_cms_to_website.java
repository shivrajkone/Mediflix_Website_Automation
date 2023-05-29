package website_modules;
 
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Credentials;

public class Verify_expert_cms_to_website extends Credentials
{
	
	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	Credentials C1 =new Credentials();
	
	String expert_name2="Dr.Anderson";
	String expert_slug2="ABCC";
	String expert_bio2="Dr Anderson is also one of the best doctors in Pediatric Anesthesiology around the world.";
	String expert_tagcount2;
	WebElement searchbox4;
	
	String search_expert="Meet our Experts";
	
	
//	@Test (enabled = false)
	@Test (priority=1)
	public void Verify_CMS_Credentials() throws IOException, InterruptedException
	{
		C1.CMS_Login();
	}
	
//   @Test (enabled = false)
     @Test (priority=2)
	  public void Create_New_Expert() throws InterruptedException
	  {
		  	driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/experts");
		  	driver.manage().window().maximize();
	    	
	    	Thread.sleep(3000);
	    	// load
	    	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
			load.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-colindex='0']"))).click();
	    	
		
			System.out.println("Expert -> Verifying Verifying Create New Expert With All Information**************");
			Reporter.log("Expert ->Verifying Create New Expert With All Information");
			
			WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();

			WebDriverWait create_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
			create_expert.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Create Expert']"))).click();
		
			Thread.sleep(1000);
			 
		    driver.findElement(By.id("expert-name")).sendKeys(expert_name2);
		        
//		 // headshot image select
//		    WebElement headshot = driver.findElement(By.xpath("//p[text()='Expert Headshot']"));
//		    headshot.click();
//		    
//		    WebDriverWait wait_hs = new WebDriverWait(driver, Duration.ofSeconds(30));
//		    wait_hs.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[13]/div/div/p")));
//		    
//		    
//		    WebElement select_img = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[13]/div/div/p"));
//		    select_img.click();
//		
//		    WebElement select_button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/button[2]"));
//		    select_button.click();
//		    
//		    //wideshot image select
//		    
//		    WebElement wideshot = driver.findElement(By.xpath("//p[text()='Expert Wideshot']"));
//		    wideshot.click();
//		    
//		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div/img")));
//		  
//		    WebElement select_img2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div/img"));
//		    select_img2.click();
//		
//		    WebElement select_button2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/button[2]"));
//		    select_button2.click();
		
			driver.findElement(By.id("slug")).sendKeys(expert_slug2);
		    
		     
		    //expert pick collection 
		    // click  
		    WebDriverWait click_pick = new WebDriverWait(driver, Duration.ofSeconds(30));
		    click_pick.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='expert-pick-list']"))).click();
				    
		    // select 
			WebDriverWait select_pick = new WebDriverWait(driver, Duration.ofSeconds(30));
			select_pick.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/ul/li[1]"))).click();
		
		    //bio
			driver.findElement(By.id("expert-bio")).sendKeys(expert_bio2);
			
			// tag
		    WebElement tag_button = driver.findElement(By.xpath("//p[text()='Tags']"));
	        tag_button.click();
		    
	        Thread.sleep(1000);
	       
		    WebElement tag_topic = driver.findElement(By.xpath("//label[text()='Stage']"));
		    tag_topic.click();
		    
		    Thread.sleep(1000);
		    
		    WebElement selectbutton = driver.findElement(By.xpath("//button[text()='Select']"));
		    selectbutton.click();
			
		    Thread.sleep(1000);
			
			 // tags count
		     expert_tagcount2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div/div[7]/div/button")).getText();
			 System.out.println("the tag count is __________________"+expert_tagcount2); 
			
			 Thread.sleep(1000);
			    
			 WebElement zip_click = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div/div[8]/div/div"));
			 zip_click.click();
			 
			 WebElement zip_select = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]"));
			 zip_select.click();
			 
			 Thread.sleep(5000);
			 
			 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
			 save.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
			
			 
			 Thread.sleep(10000);
		//	 driver.quit();
			

	
	 }
//   @Test (enabled = false)
     @Test (priority=3)
      public void Add_Expert_In_Collection() throws InterruptedException
      {
//    	 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
    	 
    	 WebElement click_collection = driver.findElement(By.xpath("//button[@aria-label='Collections']"));
    	 click_collection.click();
    	 
 		 driver.manage().window().maximize();
 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		 
 		 
 		 
 		    
 		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
 		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
 		    
 		 System.out.println("Search the 'meet our expert' and add the expert in same");
		 Reporter.log("Search the 'meet our expert' and add the expert in same");
		 
		 WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		 coll_searchbox.sendKeys(search_expert);
		 
		Thread.sleep(4000);
		           
		 WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		 Thread.sleep(3000);
 		 
		 //click expert  
		 
		 WebElement click_expert=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[5]/div/div/input"));
		 click_expert.sendKeys(expert_name2);
 		 
		 WebDriverWait select_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
		 select_expert.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
		 
		 Thread.sleep(3000);
		
		 WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/h2/p"))).click();
			    	
		 Thread.sleep(3000);
		 
		 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
		
		 
		 Thread.sleep(10000);
		 driver.quit();
      }
      
      
      
	  
//		@Test (enabled = false)
		@Test (priority=4)
		public void Verify_WebSite_Login() throws InterruptedException
		{
			
			C1.Website_Login();
			
		}
		
		
		
	  
//		@Test (enabled = false)
		@Test (priority=5)
		public void Verify_The_Created_Expert() throws InterruptedException
		{
//					driver.get("https://client-portal.us-east-1.dev.mediflix.com/advice");
			
					WebElement click_advice = driver.findElement(By.xpath("//a[normalize-space()='Advice']"));
					click_advice.click();
					
					driver.manage().window().maximize();

					//click search 
			
					System.out.println("Verify the created expert and in website********************");
					Reporter.log("Verify the created expert and in website");
					
					WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(60));
				    load1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[1]/div/div/div[1]/button")));
						
				    //scroll down
				    JavascriptExecutor js = (JavascriptExecutor)driver; 
				    js.executeScript("window.scrollBy(0,400)");
				    
				    WebElement click_arrow =driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/button[2]"));
				    click_arrow.click();
				    
				    Thread.sleep(4000);
				    
				    //click expert    
				    
				    WebDriverWait select_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
					select_expert.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[10]/div/div/div[1]"))).click();

					Thread.sleep(4000);
					//load   
					WebDriverWait load_expert_page = new WebDriverWait(driver, Duration.ofSeconds(30));
					load_expert_page.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"))).click();
					 
					//verify
					
					//name
					String expert =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
				    System.out.println("expert name is __________________"+expert);
				    
				    if(expert.equals(expert_name2))
					{
						System.out.println("Expert name is same");
						AssertJUnit.assertEquals(expert, expert_name2);
					}
					else
					{
						System.out.println("Expert name is not same");
						AssertJUnit.assertEquals(expert, expert_name2);
						Reporter.log( "[ERROR] -> Browse -> Advice -> Expert page -> Expert Name Is Not Same.");
					}
					
					//bio
					
				    String bio =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/p[2]")).getText();
				    System.out.println("expert bio is __________________"+expert_bio2);
				    
				    if(bio.equals(expert_bio2))
					{
						System.out.println("Expert bio is same");
						AssertJUnit.assertEquals(bio, expert_bio2);
					}
					else
					{
						System.out.println("Expert expert_bio2 is not same");
						AssertJUnit.assertEquals(bio, expert_bio2);
						Reporter.log( "[ERROR] -> Browse -> Topic -> Expert page -> Expert Bio Is Not Same.");
					}
					
				    
				    driver.quit();
		} 
	
	
	

}
