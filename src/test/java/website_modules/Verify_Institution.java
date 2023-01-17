package website_modules;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Credentials;

public class Verify_Institution extends Credentials
{

	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	Credentials C1 =new Credentials();
	
//	String inst_name2="Cornell";
//	String inst_desc2="University is a private institution that was founded in 1865";
	String inst_slug2="198ndhd";
	
	String search_key="impact";
	
	String search_key_coll="Meet our Institutions";
	String institution_name="Cornell";
	
//	@Test (enabled = false)
	@Test (priority=1)
	public void Verify_CMS_Credentials() throws IOException
	{
		
		C1.CMS_Login();
		
	}
	
//	@Test (enabled = false)
	@Test (priority=2)
	public void Create_Institution() throws InterruptedException, IOException
	{
//		 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/institutions");
		 WebElement click_institution = driver.findElement(By.xpath("//button[@aria-label='Institutions']"));
		 click_institution.click();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		 
		 FileInputStream objfile = new FileInputStream("C:\\Users\\Prasad_aute\\git\\Website_automation2\\src\\test\\resources\\Properties\\Website.properties");
		 prop.load(objfile);	
		    
		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Institution -> Verifying Create New Institution With All Information");
		 Reporter.log("Institution -> Verifying Create New Institution With All Information");
		 
		 WebElement create_institute_button = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div/button"));
		 create_institute_button.click();
		 
		 Thread.sleep(3000);
		 				 
		//institute name
		WebElement name= driver.findElement(By.id("institution-name"));
		name.sendKeys(prop.getProperty("inst_name2"));
		 
		 // inst logo
		 															
		  WebDriverWait logo2_click = new WebDriverWait(driver, Duration.ofSeconds(30));
		  logo2_click.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[3]/button"))).click();
			   				 								
		  WebDriverWait wait_logo2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait_logo2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[1]/div/img")));
			    		 
		  WebElement logo_select2=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[1]/div/img"));
		  logo_select2.click();
		
		  WebElement select_button1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/button[2]"));
		  select_button1.click();
		 
		  // inst image
		  
		  WebElement image2=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[4]/button"));
		  image2.click();
		 
		  WebDriverWait wait_img2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait_img2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div/img")));
			    		 
		  WebElement img_select2=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div/img"));
		  img_select2.click();
		
		  WebElement select_button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/button[2]"));
		  select_button.click();
		  
		// desc and slug
		  WebElement desc= driver.findElement(By.id("description"));
		  desc.sendKeys(prop.getProperty("inst_desc2"));
			
		  WebElement slug =driver.findElement(By.id("slug"));
		  slug.sendKeys(inst_slug2);
			
			Thread.sleep(3000);
			// expert
			WebElement expert2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[7]/div/div/div"));
			expert2.click(); 
			
			Thread.sleep(3000);
			
			WebElement expert_select = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[16]"));
			expert_select.click();
			
			WebElement m1=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/h2/p"));
		    m1.click();
			
		    Thread.sleep(3000);
		    
			//collection 
		    WebElement collection2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[9]/div/div/input"));
			collection2.click();
			
			collection2.sendKeys(search_key);
			
			Thread.sleep(3000);
			
			WebElement coll_select = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li"));
			coll_select.click();
			
			Thread.sleep(3000);
			
			//click ramdom
			WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
			click_ramdom.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();		                           
			 
			Thread.sleep(3000);
			// videos
			WebElement videos2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[10]/div/div/div/input"));
			videos2.click();
			
			Thread.sleep(3000);
			
			WebElement videos_select = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]"));
			videos_select.click();
			
			Thread.sleep(3000);
			
			//zip
			WebElement zipcode2 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[11]/div/div"));
			zipcode2.click();
			
			Thread.sleep(3000);
			
			WebElement zip_select = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]"));
			zip_select.click();
			
			//tags
		     WebElement tab_button = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[8]/div/button"));
		     tab_button.click();
			    
		     Thread.sleep(1000);
		     													
		     WebElement tab_topic = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div[6]/div[1]/div[1]/label"));
			 tab_topic.click();
						  
			 Thread.sleep(1000);
			    
			 WebElement selectbutton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/button[2]"));
			 selectbutton.click();                                  
			    
			 Thread.sleep(5000);
			 
			 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
			 save.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Save']"))).click();		                           
			 
			 Thread.sleep(10000);
	
			 //go to collection and add the institution in "meet our institution" collection
			 
	}
	
	
 //   @Test (enabled = false)
      @Test (priority=3)
     public void Add_Institution_In_Collection() throws InterruptedException
     {
   	 	 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Search the 'meet our institution' and add the institution in same");
		 Reporter.log("Search the 'meet our institution' and add the institution in same");
		 
		 WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		 coll_searchbox.sendKeys(search_key_coll);
		 
		 Thread.sleep(5000);
		           
		 WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		 Thread.sleep(3000);
		 
		 
		//scroll
		 JavascriptExecutor js = (JavascriptExecutor)driver; 
		 js.executeScript("window.scrollBy(0,400)");
		 
		 
		 // click institution   
		 
		 WebElement click_institution=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[6]/div/div/input"));
		 click_institution.sendKeys(institution_name);
 		 
		 
		 Thread.sleep(2000);
		 
		 WebDriverWait select_institution = new WebDriverWait(driver, Duration.ofSeconds(30));
		 select_institution.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[7]/div/ul/li"))).click();
		 																				
		 Thread.sleep(2000);
		
		 WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
			    	
		 Thread.sleep(3000);
		 
		 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
		
		 Thread.sleep(10000);
		 driver.quit();
		 
     }
    
//	@Test (enabled = false)
	@Test (priority=4)
	public void Verify_WebSite_Login() throws InterruptedException
	{
		
		C1.Website_Login();
		
	}
	
//	@Test (enabled = false)
	@Test (priority=5)
	public void Verify_The_Created_Institution() throws InterruptedException
	{
			//driver.get("https://client-portal.us-east-1.dev.mediflix.com/advice");
			WebElement click_channels = driver.findElement(By.xpath("//a[normalize-space()='Channels']"));
			click_channels.click();	
		    
			driver.manage().window().maximize();

			System.out.println("Verify the created Institution and in website********************");
			Reporter.log("Verify the created Institution and in website");
				
			WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(60));
			load1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/a")));
					
			//scroll down
		    JavascriptExecutor js = (JavascriptExecutor)driver; 
		    js.executeScript("window.scrollBy(0,400)");
			
		    //load
		    WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
			load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[5]/div/div")));
																			 
			Thread.sleep(4000);
			WebDriverWait click_channel = new WebDriverWait(driver, Duration.ofSeconds(30));
			click_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[6]/div/div/a"))).click();
			
			Thread.sleep(4000);
			    
			//load  
			    
			WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(60));
			load2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[1]/div/div/div[1]/button")));
					
			//scroll down
		    JavascriptExecutor js2 = (JavascriptExecutor)driver; 
		    js2.executeScript("window.scrollBy(0,300)");
			
		    Thread.sleep(4000);
		    
			//expert is  
			String expert_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]")).getText();
			System.out.println("expert name is ________________"+expert_name);
			
			//video is  
			String video_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[2]/div/div/div[2]/div/p")).getText();
			System.out.println("expert name is ________________"+video_name);
			
			//coll name is 
			String coll_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[3]/div/div/a[2]/p")).getText();
			System.out.println("expert name is ________________"+coll_name);
			
			//audio name is 
			String audio_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div[4]/div/div/div[2]/div/p")).getText();
			System.out.println("expert name is ________________"+audio_name);
			
			driver.close();
			
			
	}
    
}
