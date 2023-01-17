package website_modules;
 
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
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

public class Verify_Search_In_WebSite extends Credentials
{
	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	Credentials C1 =new Credentials();
	
	String topic="Global Health";
	String video="Planet";
	String expert="Ray Dorsey, MD";
	String channel="cdn";
	String advice="What type of health care do I need?";
       
	@Test (priority=1)
	public void Verify_WebSite_Login() throws InterruptedException
	{
		
		C1.Website_Login();
		
	}
	
	@Test (priority=4)
	public void Verify_Search_Working() throws InterruptedException
	{
//				driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
//				driver.manage().window().maximize();
				//click search 
		
		 System.out.println("Verify the search in Website*********************");
		 Reporter.log("Verify the search in Website");
				WebElement click_search = driver.findElement(By.xpath("//a[@href='/search']"));
				click_search.click();
				
				Thread.sleep(3000);
				
				WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
			    load3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
			   
		 System.out.println("Verify the topic search*********************");		
		 Reporter.log("Verify the topic search");
			    WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
				search.sendKeys(topic);
				
				Thread.sleep(3000);
				// submit
				
				WebElement click_submit = driver.findElement(By.xpath("//button[@type='submit']"));
				click_submit.click();
				System.out.println("Click For Search _________________");
				
				//load 
								
				WebDriverWait load4 = new WebDriverWait(driver, Duration.ofSeconds(60));
			    load4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='font-bold text-xl leading-160 whitespace-normal break-words overflow-hidden flex-1']")));
					
				//verify the search   
				
				String s1= driver.findElement(By.xpath("//div[contains(text(),'Global health')]")).getText();
				System.out.println("topic is_________________________"+s1);
				
				Thread.sleep(3000);
				
			System.out.println("Verify the video search*********************");	
			Reporter.log("Verify the video search");
				WebElement search2 =driver.findElement(By.xpath("//input[@type='text']"));
				search2.clear();
				search2.sendKeys(video);
				
				WebElement click_submit2 = driver.findElement(By.xpath("//button[@type='submit']"));
				click_submit2.click();
				 
				//load 
				WebDriverWait load_video = new WebDriverWait(driver, Duration.ofSeconds(60));
				load_video.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='font-bold text-xl leading-160 whitespace-normal break-words overflow-hidden flex-1']")));
									
				//verify the search   
				WebDriverWait load_video2 = new WebDriverWait(driver, Duration.ofSeconds(60));
				load_video2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flex-1 pt-8 max-w-full whitespace-normal truncate basis-60']")));
				
				String s2= driver.findElement(By.xpath("//p[text()='Planet']")).getText();
				System.out.println("video is_________________________"+s2);
				
				Thread.sleep(3000);
				
			System.out.println("Verify the expert search*********************");	
			Reporter.log("Verify the expert search");
				WebElement search3 =driver.findElement(By.xpath("//input[@type='text']"));
				search3.clear();
				search3.sendKeys(expert);
				
				WebElement click_submit3 = driver.findElement(By.xpath("//button[@type='submit']"));
				click_submit3.click();
				 
				//load 
				WebDriverWait load_expert = new WebDriverWait(driver, Duration.ofSeconds(60));
				load_expert.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='font-bold text-xl leading-160 whitespace-normal break-words overflow-hidden flex-1']")));
				
				//verify the search   
				WebDriverWait load_expert2 = new WebDriverWait(driver, Duration.ofSeconds(60));
				load_expert2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[3]/div[2]/div/div[3]/div/div/div/div/div/div[1]")));
				
				String s3= driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[3]/div[2]/div/div[3]/div/div/div/div/div/div[2]")).getText();
				System.out.println("expert is_________________________"+s3);
				
				Thread.sleep(3000);
				

		 System.out.println("Verify the advice search*********************");	
		 Reporter.log("Verify the advice search");
				WebElement search5 =driver.findElement(By.xpath("//input[@type='text']"));
				search5.clear();
				search5.sendKeys(advice);
				
				WebElement click_submit5 = driver.findElement(By.xpath("//button[@type='submit']"));
				click_submit5.click();
				 
				//load 
				WebDriverWait load_advice = new WebDriverWait(driver, Duration.ofSeconds(60));
				load_advice.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='font-bold text-xl leading-160 whitespace-normal break-words overflow-hidden flex-1']")));
									
				//verify the search   
				WebDriverWait load_advice2 = new WebDriverWait(driver, Duration.ofSeconds(60));
				load_advice2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div[2]/button/div[1]")));
							
				String s5= driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div[2]/button/div[1]/span")).getText();
				System.out.println("advice is_________________________"+s5);
				
				Thread.sleep(3000);
				
		 System.out.println("Verify the channel search*********************");	
		 Reporter.log("Verify the channel search");
				WebElement search4 =driver.findElement(By.xpath("//input[@type='text']"));
				search4.clear();
				search4.sendKeys(channel);
				
				WebElement click_submit4 = driver.findElement(By.xpath("//button[@type='submit']"));
				click_submit4.click();
				 
				//load 
				WebDriverWait load_channel = new WebDriverWait(driver, Duration.ofSeconds(60));
				load_channel.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='font-bold text-xl leading-160 whitespace-normal break-words overflow-hidden flex-1']")));
										
				//click on channel
			    WebDriverWait click_channel_icon= new WebDriverWait(driver, Duration.ofSeconds(30));
			    click_channel_icon.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='absolute w-full h-full']"))).click();
			
			    //click learn more
			    WebDriverWait learn_more= new WebDriverWait(driver, Duration.ofSeconds(30));
			    learn_more.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Learn more']"))).click();
			    
			    Thread.sleep(3000);
			    	    
			    //get channel name
			    String channel_verify = driver.findElement(By.xpath("//p[@class='text-lg']")).getText();
			    System.out.println("channel is_________________"+channel_verify);
			    
			    driver.quit();
				
				
				
	}
	
}
