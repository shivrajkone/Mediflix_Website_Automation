package website_modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import access.login;

public class Verify_sharelink extends login
{

//	ChromeDriver driver; 
	SoftAssert softAssert = new SoftAssert();
	  
	@Test (priority=1)
	public void verify_topic_sharelink() throws InterruptedException
	{
		driver.manage().window().maximize();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
	    
	    //load
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class,'leading-180 whitespace-pre-line text-lg md:text-xl')]")));
	
		System.out.println("Website -> Verify the share link in topic**************");
	
		// click topic
		
		WebDriverWait click_topic = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_topic.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/div/a"))).click();
	
		//load   
		
		WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/h1")));
	
		Thread.sleep(3000);
		
		String s1 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/h1")).getText();
		System.out.println("the topic title is ________________"+s1);
			    
		//click share  
		
		WebDriverWait click_share = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_share.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Share']"))).click();
	
		
		Thread.sleep(4000);
		
		//click copy link   
		
		WebDriverWait click_copy_link = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_copy_link.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/div/div/div/div/div[3]/div[2]/button"))).click();
		
		Thread.sleep(4000);
		
		String url = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/div/div/div/div/div[3]/div[2]/input")).getAttribute("value");
		System.out.println("url is __________"+url);
		
		Thread.sleep(5000);
		
		//open browser with link
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get(url);
		
		//load   
		
	    WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/h1")));
		
		String s2 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/h1")).getText();
		System.out.println("New tab copied url topic title is ________________"+s2);
	
		if(s1.equals(s2))
		{
		System.out.println("Copied url is same");
		AssertJUnit.assertEquals(s1, s2);
		}
		else
		{
		System.out.println("Copied url is not same");
		AssertJUnit.assertEquals(s1, s2);
		Reporter.log( "[ERROR] -> Topic -> Share_Copy_Link -> Copied Url Is Not Same.");
		}
		Thread.sleep(10000);
	    
	}
	
	
	@Test (priority=2)
	public void verify_advice_sharelink() throws InterruptedException
	{
		driver.manage().window().maximize();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
	    
	    //load
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class,'leading-180 whitespace-pre-line text-lg md:text-xl')]")));
	
		System.out.println("Website -> Verify the share link in advice**************");
		
		Thread.sleep(5000);
	
		// click advice
		
		WebDriverWait click_video = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_video.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div/div[1]/div[3]"))).click();
	
		//load   
		
		WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/p[1]")));
	
		String s1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/p[1]")).getText();
		System.out.println("the advice question is ________________"+s1);
		
		Thread.sleep(4000);
		
		//click share  
		
		WebDriverWait click_share = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_share.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Share']"))).click();
			
				
		Thread.sleep(4000);
				
		//click copy link   
				
		WebDriverWait click_copy_link = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_copy_link.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Copy link']"))).click();
				
		Thread.sleep(4000);
		
		String url = driver.findElement(By.xpath("//input[@value='https://client-portal.us-east-1.dev.mediflix.com/browse/question/67']")).getAttribute("value");
		System.out.println("url is __________"+url);
				
		Thread.sleep(5000);
				
		//open browser with link
				
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get(url);
				
		//load   
				
		WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/h1")));
				
		String s2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/p[1]")).getText();
		System.out.println("New tab copied url advice question is ________________"+s2);
			
		if(s1.equals(s2))
		{
			System.out.println("Copied url is same");
			AssertJUnit.assertEquals(s1, s2);
		}
		else
		{
			System.out.println("Copied url is not same");
			AssertJUnit.assertEquals(s1, s2);
			Reporter.log( "[ERROR] -> Videos -> Share_Copy_Link -> Copied Url Is Not Same.");
		}
		Thread.sleep(10000);
		
	}
	
	
	@Test (priority=3)
	public void verify_expert_sharelink() throws InterruptedException
	{
		driver.manage().window().maximize();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/advice");
	    
	    //load
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class,'leading-180 whitespace-pre-line text-lg md:text-xl')]")));
	
		System.out.println("Website -> Verify the share link in expert**************");
	
		//scroll
	    JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,400)");
		
	    Thread.sleep(5000);
		//click expert  
	        
	    WebDriverWait click_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_expert.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[1]/div/div/div[1]/button"))).click();
	
	    Thread.sleep(5000);
	    
	    String s1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
		System.out.println("the expert name is ________________"+s1);
		    
		Thread.sleep(4000);
		// click share   
	    WebDriverWait click_share = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_share.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='space-x-3 hidden md:flex']//span[@class='relative'][normalize-space()='Share']")));
	
	    
	    Thread.sleep(4000);
		
	       //click copy link   
		
	  		WebDriverWait click_copy_link = new WebDriverWait(driver, Duration.ofSeconds(30));
	  		click_copy_link.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]"))).click();
	  				
	  		Thread.sleep(4000);
	  		
	  		String url = driver.findElement(By.xpath("//input[@value='https://client-portal.us-east-1.dev.mediflix.com/advice/expert/64']")).getAttribute("value");
	  		System.out.println("url is __________"+url);
	  				
	  		Thread.sleep(3000);
	  				
	  		//open browser with link
	  				
	  		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
	  		driver.get(url);
	  				
	  		//load   
	  				
	  		WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
	  		load3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/h1")));
	  				
	  		String s2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
			System.out.println("New copied URl Expert Name Is ________________"+s2);
			    
	  			
	  		if(s1.equals(s2))
	  		{
	  			System.out.println("Copied url is same");
	  			AssertJUnit.assertEquals(s1, s2);
	  		}
	  		else
	  		{
	  			System.out.println("Copied url is not same");
	  			AssertJUnit.assertEquals(s1, s2);
	  			Reporter.log( "[ERROR] -> Videos -> Share_Copy_Link -> Copied Url Is Not Same.");
	  		}
	  		Thread.sleep(10000);
		
	}
	
	
	@Test (priority=4)
	public void verify_channel_sharelink() throws InterruptedException
	{
		driver.manage().window().maximize();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/channels");
	    
	    //load
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='leading-180 whitespace-pre-line text-lg md:text-xl']")));
	
		System.out.println("Website -> Verify the share link in channel**************");
		Thread.sleep(5000);
		//click channel   
		
		WebDriverWait click_channel = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/a"))).click();
	
		//load  
		
		WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/span/img")));
		
		
		//click learn more  
		WebDriverWait learn = new WebDriverWait(driver, Duration.ofSeconds(30));
		learn.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Learn more']"))).click();
		
		//title   
		String s1 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/div/div/div/div/div[3]/div/div[1]/div[2]/p")).getText();
		System.out.println("the channel title is ________________"+s1);
		
		//click cancel 
		WebDriverWait cancel = new WebDriverWait(driver, Duration.ofSeconds(30));
		cancel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/div/div/div/div/div[3]/div/div[3]/div/button[1]/span"))).click();
		
		
		//click share  
		
		WebDriverWait click_share = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_share.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Share']"))).click();
			
		Thread.sleep(4000);
				
		//click copy link   
				
		WebDriverWait click_copy_link = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_copy_link.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Copy link']"))).click();
				
		Thread.sleep(4000);
		
		String url = driver.findElement(By.xpath("//input[@value='https://client-portal.us-east-1.dev.mediflix.com/channels/cleveland-clinic']")).getAttribute("value");
		System.out.println("url is __________"+url);
				
		Thread.sleep(3000);
				
		//open browser with link
				
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get(url);
				
		//load   
		WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='leading-180 whitespace-pre-line text-lg md:text-xl']")));
			
		//click learn more  
		WebDriverWait learn2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		learn2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Learn more']"))).click();
				
		//title   
		String s2 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/div/div/div/div/div[3]/div/div[1]/div[2]/p")).getText();
		System.out.println("Copied URl Channel title is ________________"+s2);
				
		//click cancel 
		WebDriverWait cancel2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		cancel2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div[4]/div/div/div/div/div[3]/div/div[3]/div/button[1]/span"))).click();
				
	
			
		if(s1.equals(s2))
		{
			System.out.println("Copied url is same");
			AssertJUnit.assertEquals(s1, s2);
		}
		else
		{
			System.out.println("Copied url is not same");
			AssertJUnit.assertEquals(s1, s2);
			Reporter.log( "[ERROR] -> Videos -> Share_Copy_Link -> Copied Url Is Not Same.");
		}
	
		Thread.sleep(10000);
		
		
	}
	
	@Test (priority=5)
	public void verify_videos_sharelink() throws InterruptedException
	{
		driver.manage().window().maximize();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
	    
	    //load
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class,'leading-180 whitespace-pre-line text-lg md:text-xl')]")));
	
		System.out.println("Website -> Verify the share link in videos**************");
	
		// click video
		
		WebDriverWait click_video = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_video.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[3]/div/div[3]/div/div/div[3]/div/div/div[1]/div[4]"))).click();
																			   
		//load   
		
		WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[2]")));
	
		String s1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[2]/p")).getText();
		System.out.println("the video title is ________________"+s1);
		
		Thread.sleep(4000);
		
		//click share  
		
		WebDriverWait click_share = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_share.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Share']"))).click();
			
		Thread.sleep(4000);
				
		//click copy link   
				
		WebDriverWait click_copy_link = new WebDriverWait(driver, Duration.ofSeconds(30));
		click_copy_link.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Copy link']"))).click();
				
		Thread.sleep(4000);
		
		String url = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div[2]/input")).getAttribute("value");
		System.out.println("url is __________"+url);
				
		Thread.sleep(3000);
				
		//open browser with link
				
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		Thread.sleep(3000);
		driver.get(url);
				
		//load   
				
		WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[2]")));
				
		String s2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[2]/p")).getText();
		System.out.println("New tab copied url topic title is ________________"+s2);
			
		if(s1.equals(s2))
		{
			System.out.println("Copied url is same");
			AssertJUnit.assertEquals(s1, s2);
		}
		else
		{
			System.out.println("Copied url is not same");
			AssertJUnit.assertEquals(s1, s2);
			Reporter.log( "[ERROR] -> Videos -> Share_Copy_Link -> Copied Url Is Not Same.");
		}
		Thread.sleep(5000);
		
	}
	
	
	
	
}
