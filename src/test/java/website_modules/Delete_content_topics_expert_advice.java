package website_modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import access.admin_login_dev;

public class Delete_content_topics_expert_advice extends admin_login_dev
{
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test (priority=1)
//	@Test (enabled = false)
	public void Verify_Delete_Video_Content() throws InterruptedException
	{
		
		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/content-manager");
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
		
		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/collections");
		driver.manage().window().maximize();
		
 	 	
	 	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]"))).click();
	 				
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
		 WebDriverWait click_child_coll = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_child_coll.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/input"))).click();
		 
		 Thread.sleep(2000);
		 
		 WebElement coll_name = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/input"));
		 coll_name.click();
		 coll_name.sendKeys(Keys.BACK_SPACE);
		 
		 //click remove button
		 
		 WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(30));
		 click_ramdom.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
		 
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
		 
		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/experts");
		driver.manage().window().maximize();
		
	 	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]"))).click();
	 				
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
		
		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/advice");
		driver.manage().window().maximize();
		
	 	System.out.println("Advice -> Verifying Delete the Created Advice*****************");
		Reporter.log("Advice ->  Verifying Delete the Created Advice");
	
		WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]"))).click();
	 				
		WebElement coll_searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		coll_searchbox.sendKeys(prop.getProperty("advice_question"));
		
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
		 
		 driver.quit();
	}

}
