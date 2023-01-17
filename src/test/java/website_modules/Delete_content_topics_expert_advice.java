package website_modules;
 
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Credentials;
import access.admin_login_dev;

public class Delete_content_topics_expert_advice extends Credentials
{
	
	SoftAssert softAssert = new SoftAssert();
	
//	public static Properties prop = new Properties();
//	public static FileReader fr;
	
	Credentials C1 =new Credentials();
	

	@BeforeTest 
	public void Verify_CMS_Credentials() throws IOException
	{
		C1.CMS_Login();
	}
	
	
	@Test (priority=1)
//	@Test (enabled = false)
	public void Verify_Delete_Video_Content() throws InterruptedException
	{
		
//		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/content-manager");
		WebElement click_content = driver.findElement(By.xpath("//button[@aria-label='Content']"));
		click_content.click();	
		driver.manage().window().maximize();
 	 	
	 	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]"))).click();
	 	
	 	System.out.println("Content -> Verifying Delete the Created Content*****************");
		Reporter.log("Content -> Verifying Delete the Created Content");
	    
		WebElement advice_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		advice_searchbox.sendKeys(prop.getProperty("content_name"));
		
		WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	load2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]")));
	 	
	 	Thread.sleep(3000);
	 	
	 	//logic for verify the no rows in result
	 	String norow = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]")).getText();
	 	System.out.println("result is __"+norow);
	 	
	 		 	
//	 	if(norow.equals(norow)) 
//		{
//			System.out.println("no result");
//			AssertJUnit.assertEquals(norow, norow);
//		}
//		else
//		{
//			System.out.println("matching find");
//			AssertJUnit.assertEquals(norow, norow);
			
			Thread.sleep(3000);
			
		 	WebDriverWait delete = new WebDriverWait(driver, Duration.ofSeconds(30));
			delete.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div[12]/button[5]"))).click();
			
			Thread.sleep(3000);
			
			WebDriverWait delete1 = new WebDriverWait(driver, Duration.ofSeconds(30));
			delete1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
			
			Thread.sleep(10000);
		
	 
	 	
	 	
		
		// search for name_1
		WebElement advice_searchbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		advice_searchbox2.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		advice_searchbox2.sendKeys(prop.getProperty("name_1"));
		
		WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	load3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]")));
	 	
	 	Thread.sleep(3000);
		
	 	WebDriverWait delete_name1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	delete_name1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div[12]/button[5]"))).click();
		
		Thread.sleep(3000);
		
		WebDriverWait delete_n1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		delete_n1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
		
		Thread.sleep(10000);
		
		// search for name_2
		WebElement advice_searchbox3 = driver.findElement(By.xpath("//input[@type='text']"));
		advice_searchbox3.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		advice_searchbox3.sendKeys(prop.getProperty("name_2"));
				
		WebDriverWait load4 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	load4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]")));
			 	
	 	Thread.sleep(3000);
				
	 	WebDriverWait delete_name2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	delete_name2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div[12]/button[5]"))).click();
				
		Thread.sleep(3000);
				
		WebDriverWait delete_n2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		delete_n2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
				
		Thread.sleep(10000);
				
				
		
		
	}
	
	@Test (priority=2)
//	@Test (enabled = false)
	public void Verify_Delete_Collection() throws InterruptedException
	{
		
//		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
		WebElement click_collection = driver.findElement(By.xpath("//button[@aria-label='Collections']"));
		click_collection.click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
 	 	
	 	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	load.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-colindex='0']"))).click();
	 				
	 	System.out.println("Collection -> Verifying Delete the Created Collection and Child Collection*****************");
		Reporter.log("Collection -> Verifying Delete the Created Collection and Child Collection");
	    
		//choose a topic
		
		WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		coll_searchbox.sendKeys(prop.getProperty("coll_topics"));
		
		WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	load2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]")));
	 	
	 	Thread.sleep(5000);
	 			
	 	 WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		 Thread.sleep(3000);
		 
		 //click child coll    
		 WebElement click_child_coll = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/input"));
		 click_child_coll.click();                                  
		 
		 Thread.sleep(2000);

		 WebDriverWait click_cross_icon = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_cross_icon.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@title='Clear'])[2]"))).click();
		
		 Thread.sleep(2000);
			//add all child collections
			
		 	click_child_coll.sendKeys("Parkinson's Disease (121)");
			WebDriverWait click1 = new WebDriverWait(driver, Duration.ofSeconds(30));
			click1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
				   
			click_child_coll.sendKeys("Heart Health (114)");
			WebDriverWait click2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			click2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
				   
			click_child_coll.sendKeys("Obesity + Weight (124)");
			WebDriverWait click3 = new WebDriverWait(driver, Duration.ofSeconds(30));
			click3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();
			
			click_child_coll.sendKeys("Brain Health (110)");
			WebDriverWait click4 = new WebDriverWait(driver, Duration.ofSeconds(30));
			click4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li"))).click();

		 //click remove button
		 
		 WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
		 
		 Thread.sleep(5000);
		 
		 //save  
		 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Save']"))).click();
		 System.out.println("removed the child collection organs from collection choose a topic");
		 Thread.sleep(10000);
		 
		 //remove child coll from organs
		 
		 WebElement child_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		 child_searchbox.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		 child_searchbox.sendKeys(prop.getProperty("coll_name2"));
			
		 WebDriverWait load5 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]")));
		 	
		 Thread.sleep(7000);
		 			
		 WebDriverWait wait_edit2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait_edit2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
				    	
		 Thread.sleep(8000);
		 
		 WebDriverWait click_input = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_input.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/input"))).click();
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait click_cross = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_cross.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div[4]/button[1]"))).click();
		 
	 	 //click ramdom 
		 
		 WebDriverWait click_ramdom2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
		 
		 Thread.sleep(5000);
		 
		 //save  
		 WebDriverWait save2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 save2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Save']"))).click();
		 
		 System.out.println("Removed the child collection videos,expert,channels from collection organs");
		 Thread.sleep(10000);
		 
		 //delete organs
		 
		 WebElement searchbox1 = driver.findElement(By.xpath("//input[@type='text']"));
		 searchbox1.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		 searchbox1.sendKeys(prop.getProperty("coll_name2"));
			
		 WebDriverWait load6 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]")));
		 	
		 Thread.sleep(7000);
		 
		 WebDriverWait delete_icon1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_icon1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//Button[@aria-label='Delete'])[1]"))).click();
			
		 Thread.sleep(3000);
			
		 WebDriverWait delete_button1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_button1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
		 System.out.println("Deleted the oragan collection");
		 Thread.sleep(7000);
			
		 //delete child coll 1
		 
		 WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		 searchbox.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		 searchbox.sendKeys(prop.getProperty("child_coll_name1"));
			
		 WebDriverWait load7 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load7.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]")));
		 	
		 Thread.sleep(7000);
		 
		 WebDriverWait delete_icon2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_icon2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//Button[@aria-label='Delete'])[1]"))).click();
			
		 Thread.sleep(3000);
			
		 WebDriverWait delete_button2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_button2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
		 System.out.println("Deleted the child collection 1");
		 Thread.sleep(8000);
		 
		 //delete child coll 2
		 
		 WebElement searchbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		 searchbox2.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		 searchbox2.sendKeys(prop.getProperty("child_coll_name2"));
			
		 WebDriverWait load8 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load8.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]")));
		 	
		 Thread.sleep(8000);
		 
		 WebDriverWait delete_icon3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_icon3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//Button[@aria-label='Delete'])[1]"))).click();
			
		 Thread.sleep(3000);
			
		 WebDriverWait delete_button3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_button3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
		 System.out.println("Deleted the child collection 2");
		 Thread.sleep(8000);
		 
		 //delete child coll 3
		 
		 WebElement searchbox3 = driver.findElement(By.xpath("//input[@type='text']"));
		 searchbox3.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		 searchbox3.sendKeys(prop.getProperty("child_coll_name3"));
			
		 WebDriverWait load9 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 load9.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]")));
		 	
		 Thread.sleep(8000);
		 
		 WebDriverWait delete_icon4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_icon4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//Button[@aria-label='Delete'])[1]"))).click();
			
		 Thread.sleep(3000);
			
		 WebDriverWait delete_button4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_button4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
		 System.out.println("Deleted the child collection 3");												
		 Thread.sleep(10000);
		 
	}
	
	
	@Test (priority=3)
//	@Test (enabled = false)
	public void Verify_Delete_Expert() throws InterruptedException
	{
		 
//		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/experts");
		WebElement click_expert = driver.findElement(By.xpath("//button[@aria-label='Experts']"));
		click_expert.click();
		driver.manage().window().maximize();
		
	 	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
	 				
	 	System.out.println("Expert -> Verifying Delete the Created Expert*****************");
		Reporter.log("Expert -> Verifying Delete the Created Expert");
	
		
		WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		coll_searchbox.sendKeys(prop.getProperty("expert_name2"));
		
		WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]"))).click();
    	
		 Thread.sleep(7000);
		 
		 WebDriverWait delete_icon2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_icon2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//Button[@aria-label='Delete'])[1]"))).click();
			
		 Thread.sleep(3000);
			
		 WebDriverWait delete_button2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_button2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
		 System.out.println("Deleted the expert");
		 Thread.sleep(8000);

		
	}
	
	
	@Test (priority=4)
//	@Test (enabled = false)
	public void Verify_Delete_Advice() throws InterruptedException
	{
	
//		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/advice");
	
		WebElement click_advice = driver.findElement(By.xpath("//button[@aria-label='Advice']"));
		click_advice.click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	 	System.out.println("Advice -> Verifying Delete the Created Advice*****************");
		Reporter.log("Advice ->  Verifying Delete the Created Advice");
	
		WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
		load.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]"))).click();		
		
		WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		coll_searchbox.sendKeys(prop.getProperty("advice_question"));
		
		Thread.sleep(5000);
		
		WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait_edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		Thread.sleep(5000);
		
		//answer delete	
		WebElement ans_delete = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[6]/div[2]/div/div[2]/div[2]/div/div/div/div/div[3]/span/button[2]"));		
		ans_delete.click();
		
		Thread.sleep(5000);
		
		// delete button
				
		WebElement delete_button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"));		
		delete_button.click();		
										
		//save button from edit popup
		WebDriverWait save_edit_popup = new WebDriverWait(driver, Duration.ofSeconds(30));
		save_edit_popup.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/button[2]"))).click();
					 
		Thread.sleep(10000);
		 
		WebDriverWait delete_icon2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_icon2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//Button[@aria-label='Delete'])[1]"))).click();
			
		 Thread.sleep(3000);
			
		 WebDriverWait delete_button2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 delete_button2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
		 System.out.println("Deleted the advice");
		 Thread.sleep(8000);
		 
		 
	}
	
	@Test (priority=5)
//	@Test (enabled = false)
	public void Verify_Delete_Institution() throws InterruptedException
	{
		
//		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
		WebElement click_coll = driver.findElement(By.xpath("//button[@aria-label='Collections']"));
		click_coll.click();
		driver.manage().window().maximize();
		
		
		WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-colindex='0']"))).click();
	 																	
	 	System.out.println("Institution -> Verifying Delete the Created Institution*****************");
		Reporter.log("Institution ->  Verifying Delete the Created Institution");
	
		// remove the institution from collection
		
		System.out.println("Institution -> Verifying remove the institution from collection*****************");
		Reporter.log("Institution ->  Verifying Remove The Tnstitution From Collection");
		
//		WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(60));
//	 	load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]"))).click();
	 																	
		WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		coll_searchbox.sendKeys(prop.getProperty("inst_coll"));
		
		Thread.sleep(5000);
		
		WebDriverWait wait_edit = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait_edit.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//Button[@aria-label='Edit'])[1]"))).click();
			    	
		Thread.sleep(4000);

		//click the input and remove the institution 
		
		WebElement inst_input_click = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[6]/div/div/input"));
		inst_input_click.click();
		Thread.sleep(2000);
//		inst_input_click.sendKeys(Keys.BACK_SPACE);
		
		
		WebDriverWait click_cross_icon = new WebDriverWait(driver, Duration.ofSeconds(60));
		click_cross_icon.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[6]/div/div/div[7]/button[1]"))).click();
			   
		//add all institution again
		
		inst_input_click.sendKeys("Cleveland Clinic");
		WebDriverWait click1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		click1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[7]/div/ul/li"))).click();
			   
		inst_input_click.sendKeys("Yale Medicine");
		WebDriverWait click2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		click2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[7]/div/ul/li"))).click();
			   
		inst_input_click.sendKeys("Northwell");
		WebDriverWait click3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		click3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[7]/div/ul/li"))).click();
		
		inst_input_click.sendKeys("Parkinson's TV");
		WebDriverWait click4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		click4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[7]/div/ul/li"))).click();
		
		inst_input_click.sendKeys("CDN");
		WebDriverWait click5 = new WebDriverWait(driver, Duration.ofSeconds(30));
		click5.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[7]/div/ul/li"))).click();
		
			
		//click ramdom  
		
		WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(60));
		click_ramdom.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
			    	
		Thread.sleep(2000);
		
		WebDriverWait save1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		save1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Save']"))).click();
		 
		Thread.sleep(10000);
		
		//delete the institution
		
		WebElement click_institution = driver.findElement(By.xpath("//button[@aria-label='Institutions']"));
		click_institution.click();
		
		Thread.sleep(10000);
		
		System.out.println("Institution -> Verifying Delete the institution*****************");
		Reporter.log("Institution ->  Verifying Delete The Institution");
		
		WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	load3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]"))).click();
	 																	
		WebElement inst_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		inst_searchbox.sendKeys(prop.getProperty("inst_name2"));
		
		Thread.sleep(5000);
		
		WebDriverWait delete_icon = new WebDriverWait(driver, Duration.ofSeconds(30));
		delete_icon.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@aria-label='Delete'])[1]"))).click();
		
		Thread.sleep(3000);
		
		WebDriverWait delete_button = new WebDriverWait(driver, Duration.ofSeconds(30));
		delete_button.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
		
		Thread.sleep(10000);
		
		driver.close();
		
	}
	

}
