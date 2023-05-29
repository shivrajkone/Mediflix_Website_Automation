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

public class Verify_Topics extends Credentials
{	

	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	Credentials C1 =new Credentials();
	
	WebElement name;
	WebElement type;
	
	WebElement slug;
	WebElement banner;
	WebElement desc;
	
	WebElement child;
	
	
	String coll_name2="Organs";
	String coll_slug2="11jh488";
	String coll_desc2="Information related to organs";
	
	String search_video="cure | video";
	String search_expert="cure | expert";
	String search_channel="cure | channel";
	
	String choose_topic="choose a topic";
	
	String child_coll_name1="Cure | Videos";
	String child_coll_videos1="Navin Kumar | S3 E1";
	String child_coll_videos2="Tom Collins | S3 E9";
	
	String child_coll_name2="Cure | Expert";
	String expert_name="MD.Patrick";
	
	String child_coll_name3="Cure | Channel";
	String channel_name="Northwell";
	
	
	
//	@Test (enabled = false)
	@Test (priority=1)
	public void Verify_CMS_Credentials() throws IOException, InterruptedException
	{
		C1.CMS_Login();
	}
	
//	@Test (enabled = false)
	@Test (priority=2)
	public void Create_Child_Collection() throws InterruptedException
	{
		 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		    
		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Create topic video collection ");
		 Reporter.log("Create topic video collection");
		 	 
		 WebElement create_collection_button = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div/button[2]"));
		 create_collection_button.click();
		 
		 WebDriverWait wait_popupload = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_popupload.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div/input"))).click();

		//collection name
		 name= driver.findElement(By.id("collection-name"));
		 name.sendKeys(child_coll_name1);
		 
		 Thread.sleep(2000);
		 // collection type select topics   
		 
		 WebDriverWait coll_type_click = new WebDriverWait(driver, Duration.ofSeconds(30));
		 coll_type_click.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/input"))).click();

		 WebDriverWait coll_type_select = new WebDriverWait(driver, Duration.ofSeconds(30));
		 coll_type_select.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[3]/div/ul/li[4]"))).click();
		
		 WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
				 
	     //click video
		 WebElement click_video = driver.findElement(By.xpath("//input[@id='videos-multi-select-dropdown']"));
		 click_video.sendKeys(child_coll_videos1);
		 
		 //select video
				 
		 WebDriverWait click_select = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_select.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
		 
		 Thread.sleep(3000);
		 
		 //click video 2
		 click_video.sendKeys(child_coll_videos2);
		 
		 //select video
				 
		 WebDriverWait click_select2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_select2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
		 
		 Thread.sleep(2000);
		 
		 WebDriverWait click_ramdom2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
				 
		 Thread.sleep(3000);
		
		 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Save']"))).click();
	
		 Thread.sleep(10000);
		 
		 // -----------------------------------click create collection 
		 
		 WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(60));
		 load3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Create topic expert collection ");
		 Reporter.log("Create topic expert collection");
		 	 
		 WebElement create_collection_button2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div/button[2]"));
		 create_collection_button2.click();
		 
		 WebDriverWait wait_popupload2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_popupload2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div/input"))).click();

		//collection name
		 name= driver.findElement(By.id("collection-name"));
		 name.sendKeys(child_coll_name2);
		 
		 Thread.sleep(2000);
		 // collection type select topics   
		 
		 WebDriverWait coll_type_click2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 coll_type_click2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/input"))).click();

		 Thread.sleep(2000);
		 
		 WebDriverWait coll_type_select2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 coll_type_select2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[3]/div/ul/li[4]"))).click();
		
		 Thread.sleep(3000);
		 
		 WebDriverWait click_ramdom4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
				 
		 //click expert   
		 
		 WebElement click_expert = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[5]/div/div/input"));
		 click_expert.sendKeys(expert_name);
		 
		 Thread.sleep(3000);
		 
		 //select expert
				 
		 WebDriverWait select_expert= new WebDriverWait(driver, Duration.ofSeconds(30));
		 select_expert.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
		 
		 Thread.sleep(2000);
		 
		 WebDriverWait click_ramdom5 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom5.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
				 
		 Thread.sleep(3000);
			
		 WebDriverWait save2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Save']"))).click();
	
		 Thread.sleep(10000);
		 
		 //---------click create channel
		 
		 
		 WebDriverWait load4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Create topic channel collection ");
		 Reporter.log("Create topic channel collection");
		 	 
		 WebElement create_collection_button3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div/button[2]"));
		 create_collection_button3.click();
		 
		 WebDriverWait wait_popupload3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_popupload3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div/input"))).click();

		//collection name
		 name= driver.findElement(By.id("collection-name"));
		 name.sendKeys(child_coll_name3);
		 
		 Thread.sleep(2000);
		 // collection type select topics   
		 
		 WebDriverWait coll_type_click3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 coll_type_click3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/input"))).click();
		
		 Thread.sleep(2000);
		 
		 WebDriverWait coll_type_select3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 coll_type_select3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[3]/div/ul/li[4]"))).click();
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait click_ramdom6 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
				 
		 
		 //click instiution   
		 
		 WebElement click_institution = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[6]/div/div/input"));
		 click_institution.sendKeys(channel_name);
		 
		 //select channel
				 
		 WebDriverWait select_channel= new WebDriverWait(driver, Duration.ofSeconds(30));
		 select_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[7]/div/ul/li"))).click();
		 
		 Thread.sleep(2000);
		 
		 WebDriverWait click_ramdom7 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom7.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div[2]/div[3]/div/h2"))).click();
				 
		 Thread.sleep(5000);
			
		 WebDriverWait save3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Save']"))).click();
		 
		 Thread.sleep(10000);
		 
		 
		 
		 
	}

	
//	@Test (enabled = false)
	@Test (priority=3)
	public void Create_Collection() throws InterruptedException
	{
		 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Collection ->Create New Collection ");
		 Reporter.log("Collection -> Create New Collection ");
		 	 
		 WebElement create_collection_button = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div/button[2]"));
		 create_collection_button.click();
		 
		 WebDriverWait wait_popupload = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_popupload.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div/input"))).click();

		//collection name
		 name= driver.findElement(By.id("collection-name"));
		 name.sendKeys(coll_name2);
		 
		 Thread.sleep(2000);
		 // collection type select topics   
		 
		 WebDriverWait coll_type_click = new WebDriverWait(driver, Duration.ofSeconds(30));
		 coll_type_click.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/input"))).click();

		 WebDriverWait coll_type_select = new WebDriverWait(driver, Duration.ofSeconds(30));
		 coll_type_select.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[3]/div/ul/li[1]"))).click();
		 
		 Thread.sleep(2000);
		 
		 WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
	
		    //slug 
		    slug = driver.findElement(By.xpath("//input[@id='slug']"));
		    slug.sendKeys(coll_slug2);
		    
		    Thread.sleep(2000);
		    
		    //banner 
		    WebDriverWait banner_click = new WebDriverWait(driver, Duration.ofSeconds(30));
		    banner_click.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-vi4dk7'])[3]"))).click();
		    
		    WebDriverWait banner_select = new WebDriverWait(driver, Duration.ofSeconds(30));
		    banner_select.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[7]/div/ul/li[4]"))).click();
		    																		  
		    //description
		    desc = driver.findElement(By.xpath("//textarea[@id='description']"));
		    desc.sendKeys(coll_desc2);

		    //child click 
		    child=driver.findElement(By.xpath("(//input[@id='expert-multi-select-dropdown'])[1]"));
		    child.sendKeys(search_video);
		    
		    Thread.sleep(3000);
		    // select video

		    WebDriverWait child_select = new WebDriverWait(driver, Duration.ofSeconds(30));
		    child_select.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
		    	
		    Thread.sleep(3000);
		    
		    //child click 
		    child=driver.findElement(By.xpath("(//input[@id='expert-multi-select-dropdown'])[1]"));
		    child.sendKeys(search_expert);
		    
		    // select expert

		    WebDriverWait child_select2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		    child_select2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
		    
		    Thread.sleep(3000);
		    //child click 
		    child=driver.findElement(By.xpath("(//input[@id='expert-multi-select-dropdown'])[1]"));
		    child.sendKeys(search_channel);
		    
		    // select channel

		    WebDriverWait child_select3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		    child_select3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
    
		    Thread.sleep(3000);
		    // click ramdom
		    WebDriverWait click_rmadom2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		    click_rmadom2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
    		    
			Thread.sleep(3000);
		    
			 WebDriverWait save_click = new WebDriverWait(driver, Duration.ofSeconds(30));
			 save_click.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
			 
			 Thread.sleep(10000);
	
			 //---------------load and edit the collection choose a topic
			 
			 WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(60));
			 load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
			    
			 System.out.println("Search the 'choose a topic' and add the child collection");
			 Reporter.log("Search the 'choose a topic'and add the child collection");
			 
			 WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
			 coll_searchbox.sendKeys(choose_topic);
			 
			 Thread.sleep(4000);
			    
			 WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
			 wait_edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
				    	
			 Thread.sleep(3000);
			 
			 //click child coll   
			 WebDriverWait click_child_coll = new WebDriverWait(driver, Duration.ofSeconds(30));
			 click_child_coll.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/input"))).click();
			 
			 Thread.sleep(2000);
			 
			 WebElement coll_name = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/input"));
			 coll_name.sendKeys(coll_name2);
			 
			 //select  
			 WebDriverWait click_select = new WebDriverWait(driver, Duration.ofSeconds(30));
			 click_select.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
			 
			 //click ramdom
			 WebDriverWait click_ramdom2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			 click_ramdom2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
			 
			 Thread.sleep(5000);
			 
			 //save  
			 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
			 save.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Save']"))).click();
			 
			 Thread.sleep(8000);
			 
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
	public void Verify_The_Created_Collection_Topic() throws InterruptedException 
	{
				//driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
				WebElement click_browser = driver.findElement(By.xpath("//a[normalize-space()='Browse']"));
				click_browser.click();
				
				driver.manage().window().maximize();
//				 Actions act = new Actions(driver);
				//click search 
		 
				System.out.println("Verify the created collection(topic) and in website********************");
				Reporter.log("Verify the created collection(topic) and in website");
				
				WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(60));
			    load1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/div/a")));
					
			    //scroll down
			    JavascriptExecutor js = (JavascriptExecutor)driver; 
			    js.executeScript("window.scrollBy(0,400)");
			    
			    WebElement click_arrow =driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/button[2]"));
			    click_arrow.click();
			    
			    Thread.sleep(3000);
			    
//			    WebElement click_arrow2 =driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/button[2]"));
//			    click_arrow2.click();
			    
			    Thread.sleep(3000);
			    
			    //it will read the text of 5 element in website
			    String get_title =driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[5]/div/div/div/div[2]/div")).getText();
			    System.out.println("the topic tile is_____________________"+get_title);
			    		
			    
//			    WebElement topic = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[8]/div/div/div/div[2]/div"));
//			    act.moveToElement(topic);
			    
			    //click topic  
			    
			    WebDriverWait click_topic = new WebDriverWait(driver, Duration.ofSeconds(60));
			    click_topic.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[5]/div/div/div/a"))).click();
			    																		
			    //load page  
			    
			    WebDriverWait load_page = new WebDriverWait(driver, Duration.ofSeconds(30));
			    load_page.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/h1")));
			    

			    Thread.sleep(5000);
			    
			    //scroll down
			    JavascriptExecutor js2 = (JavascriptExecutor)driver; 
			    js2.executeScript("window.scrollBy(0,400)");
			    
//			    String banner =driver.findElement(By.xpath("//h1[normalize-space()='PD Avengers']")).getText();
//		    	System.out.println("banner title is __________________"+banner);
			    
			    String video1 =driver.findElement(By.xpath("//p[normalize-space()='Navin Kumar | S3 E1']")).getText();
			    System.out.println("video title is __________________"+video1);
					
			    if(video1.equals(child_coll_videos1))
				{
					System.out.println("Video is same");
					AssertJUnit.assertEquals(video1, child_coll_videos1);
				}
				else
				{
					System.out.println("video is not same");
					AssertJUnit.assertEquals(video1, child_coll_videos1);
					Reporter.log( "[ERROR] -> Browse -> Topic -> Topic page -> Video Is Not Present.");
				}
			    
			    String video2 =driver.findElement(By.xpath("//p[normalize-space()='Tom Collins | S3 E9']")).getText();
			    System.out.println("video2 title is __________________"+video2);
			    
			    if(video2.equals(child_coll_videos2))
				{
					System.out.println("Video is same");
					AssertJUnit.assertEquals(video2, child_coll_videos2);
				}
				else
				{
					System.out.println("video is not same");
					AssertJUnit.assertEquals(video2, child_coll_videos2);
					Reporter.log( "[ERROR] -> Browse -> Topic -> Topic page -> Video Is Not Present.");
				}
			    
			    
			    String expert =driver.findElement(By.xpath("//p[@class='font-semibold leading-120']")).getText();
			    System.out.println("expert name is __________________"+expert);
			    
			    if(expert.equals(expert_name))
				{
					System.out.println("Expert name is same");
					AssertJUnit.assertEquals(expert, expert_name);
				}
				else
				{
					System.out.println("Expert name is not same");
					AssertJUnit.assertEquals(expert, expert_name);
					Reporter.log( "[ERROR] -> Browse -> Topic -> Topic page -> Expert Name Is Not Same.");
				}
			   
			    
			    Thread.sleep(5000);
			    
			    //scroll down
			    JavascriptExecutor js3 = (JavascriptExecutor)driver; 
			    js3.executeScript("window.scrollBy(0,600)");
			    
			    
			    Thread.sleep(7000);
			   //click channel   
				
				WebDriverWait click_channel = new WebDriverWait(driver, Duration.ofSeconds(30));
				click_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[3]/div/div[3]/div/div/div/div/div/a"))).click();
			
				Thread.sleep(3000);
				
				//load  
				
				WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
				load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/span/img")));
				
				//click learn more  
				WebDriverWait learn = new WebDriverWait(driver, Duration.ofSeconds(30));
				learn.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Learn more']"))).click();

				//title   
				String s1 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/div/div/div/div/div[3]/div/div[1]/div[2]/p")).getText();
				System.out.println("the channel title is ________________"+s1);
			    
				int position= s1.indexOf(" ");
				String firstword= s1.substring(0,position);
				System.out.println("substring first word is ________________"+firstword);
				
				if(firstword.equals(channel_name))
				{
					System.out.println("Channel name is same");
					AssertJUnit.assertEquals(firstword, channel_name);
				}
				else
				{
					System.out.println("Channel name is not same");
					AssertJUnit.assertEquals(firstword, channel_name);
					Reporter.log( "[ERROR] -> Browse -> Topic -> Topic page -> Channel Name Is Not Same.");
				}
				
				
			
				
	}
	
	@Test (enabled = false)
//	@Test (priority=6)
	public void Delete_collection() throws InterruptedException
	{
		 driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		    
		 WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		    
		 System.out.println("Delete the created collection ");
		 Reporter.log("Delete the created collection ");
		 
		 //remove from topics
		 
		 WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		 coll_searchbox.sendKeys(choose_topic);
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		 Thread.sleep(3000);
		
		 WebDriverWait click_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_expert.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div"))).click();
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait click_remove = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_remove.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Organs (636)']"))).click();
			    	
		 Thread.sleep(3000);
		 
		 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
			    
		 Thread.sleep(10000);
		 
		 driver.navigate().refresh();
		 
		 WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		 
		 System.out.println("Remove all child collection");
		 Reporter.log("Remove all child collection");
		 
		 // remove all child collection 
		 
		 WebElement coll_searchbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		 coll_searchbox2.sendKeys(coll_name2);
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait wait_edit2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_edit2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		 Thread.sleep(3000);
		
		 WebDriverWait click_child_coll = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_child_coll.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/input"))).click();
			    
		 WebDriverWait click_remove_button = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_remove_button.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div[4]/button[1]"))).click();
			    	
		 Thread.sleep(3000);
		 
		 WebDriverWait save2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
			    
		 Thread.sleep(10000);
		 
		 driver.navigate().refresh();
		 
		 WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
		 
		 System.out.println("Search and delete collection");
		 Reporter.log("Search and delete collection");
		 
		 WebElement coll_searchbox3 = driver.findElement(By.xpath("//input[@type='text']"));
		 coll_searchbox3.sendKeys(child_coll_name1);
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait click_delete_icon = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_delete_icon.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Delete'])[1]"))).click();
			    	
		 Thread.sleep(2000);
		 
		 
		 WebDriverWait delete = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
			    	
		
			
			driver.quit();
		 
		 
	}
	
		
		  
}


