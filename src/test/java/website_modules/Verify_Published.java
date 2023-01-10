package website_modules;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Credentials;

public class Verify_Published extends Credentials
{
	
	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	Credentials C1 =new Credentials();
	
	String advice_question="Do vaccinations cause autism?";
	String advice_question_location="MH";
	String advice_slug="dshf";
	 
	WebElement question;
	WebElement question_location;
	WebElement slug;
	WebElement tags;
	
	WebElement expert;
	WebElement answer;
	WebElement video;
	String expert_answer="Vaccines do not cause autism.";
	      
	
//	@Test (enabled = false)
	@Test (priority=1)
	public void Verify_CMS_Credentials() throws IOException
	{
		C1.CMS_Login();
		
	}
	
//	@Test (enabled = false)
	@Test (priority=2)
	public void Create_Advice() throws InterruptedException
	{
//		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/advice");
		WebElement click_advice = driver.findElement(By.xpath("//button[@aria-label='Advice']"));
		click_advice.click();
		
		driver.manage().window().maximize();
		
		 Thread.sleep(10000);
 
//	 	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(60));
//	 	load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]"))).click();
//	 	
	 	System.out.println("Content -> Verifying Create New Advice With All Information*****************");
		Reporter.log("Content -> Verifying Create New Advice With All Information");
		 
		WebElement create_advice_button = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div/button"));
		 create_advice_button.click();
		 
		 Thread.sleep(5000);
		 
		//advice question 
		 question = driver.findElement(By.id("tag-category"));
		 question.sendKeys(advice_question);
		 //location 
		 question_location = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[3]/div/input"));
		 question_location.sendKeys(advice_question_location);
			 	 
		 //slug
		 slug = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[4]/div/input"));
		 slug.sendKeys(advice_slug);
		 
		 //tags
		 Thread.sleep(3000);
		 
		 	WebDriverWait tab_button = new WebDriverWait(driver, Duration.ofSeconds(30));
		 	tab_button.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[5]/div/button"))).click();
		 	 
		 	Thread.sleep(3000);
		 	
		 	 WebDriverWait tab_topic = new WebDriverWait(driver, Duration.ofSeconds(30));
		 	tab_topic.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div[6]/div[1]/div[1]/label"))).click();
		 	
		 	Thread.sleep(3000);
		 	
		 	 WebDriverWait select = new WebDriverWait(driver, Duration.ofSeconds(30));
		 	select.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/button[2]"))).click();
		 	 
		 	Thread.sleep(3000);
		
			 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
			 save.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/button[2]"))).click();
			 	
			 Thread.sleep(3000);
			 
			//add answer press yes
			 WebDriverWait wait_click_yes = new WebDriverWait(driver, Duration.ofSeconds(30));
			 wait_click_yes.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"))).click();
			 
			 Thread.sleep(3000);
			 
			 WebElement ans_expert_click=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div[2]/div/div/div/input"));
			 ans_expert_click.click();
			 
			 WebElement ans_expert_select=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div[2]/div[2]/div/ul/li[2]"));
			 ans_expert_select.click();					               
			 
			 Thread.sleep(2000);
			 
			 answer = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div[3]/div/textarea[1]"));
			 answer.sendKeys(expert_answer);
			 
			 Thread.sleep(2000);
			 
			 WebElement video_click=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div[4]/div/div/input"));
			 video_click.click();
			 
			 WebElement video_select=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div[5]/div/ul/li[3]"));
			 video_select.click();
			 
			 //click published   
			 
			 WebElement published=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div[5]/div/label[1]"));
			 published.click();
			 
			 Thread.sleep(2000);
			 
			 WebElement save_button=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/div/button[2]"));
			 save_button.click();
			 Thread.sleep(5000);
			 
			 //cancel click
			 		
			 WebDriverWait wait_click_cancel = new WebDriverWait(driver, Duration.ofSeconds(30));
			 wait_click_cancel.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]"))).click();
			 
			 Thread.sleep(10000);
			 driver.quit();
	}
	
//	@Test (enabled = false)
	@Test (priority=3)
	public void Verify_WebSite_Login() throws InterruptedException
	{
		
		C1.Website_Login();
	    
		
	}
	
	
//	@Test (enabled = false)
	@Test (priority=4)
	public void Verify_The_Created_Advice_WebSite() throws InterruptedException
	{
				
		
				System.out.println("Verify the created advice in website by search*********************");
				Reporter.log("Verify the created advice in website by search");
				
				WebElement click_search = driver.findElement(By.xpath("//a[@href='/search']"));
				click_search.click();
				
				Thread.sleep(3000);
				
				WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
			    load3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
					
				WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
				search.sendKeys(advice_question);
				
				Thread.sleep(3000);
				// submit
				
				WebElement click_submit = driver.findElement(By.xpath("//button[@type='submit']"));
				click_submit.click();
				System.out.println("Click For Search _________________");
				
				Thread.sleep(5000);
				//load 
								
				WebDriverWait load4 = new WebDriverWait(driver, Duration.ofSeconds(60));
			    load4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Advice']")));
					
				//verify the search   
				
				String s1= driver.findElement(By.xpath("//span[@class='grow basis-64 text-lg leading-160 whitespace-normal break-words overflow-hidden']")).getText();
				System.out.println("Avice Question is_________________________"+s1);
				
				if(advice_question.equals(s1))
			    {
			    	System.out.println("Advice question is matching");
					AssertJUnit.assertEquals(advice_question, s1);
			    	
			    }
			    else
			    {
			    	System.out.println("Advice question is not matching");
					AssertJUnit.assertEquals(advice_question, s1);
					Reporter.log( "[ERROR] -> Website -> Search -> Advice question Not Displayed.");
			    }
				
				
				Thread.sleep(5000);
				driver.quit();
				
				 
				
	}

}
