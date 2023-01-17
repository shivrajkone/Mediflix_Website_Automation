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
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Credentials;

public class Verify_listed extends Credentials
{
	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	Credentials C1 =new Credentials();
	
	WebElement name;
	WebElement desc;
	    
	String name_1="Flucoril";
	String desc_1="listed";
	String name_2="Booster";
	String desc_2="Unlisted";
	
	 
//	@Test (enabled = false)
	@Test (priority=1)
	public void Verify_CMS_Credentials() throws IOException
	{
		C1.CMS_Login();
	}
	
//	@Test (enabled = false)
	@Test (priority=2)
	public void Create_Video_Content_For_Listed() throws InterruptedException
	{
		driver.navigate().to("https://admin-portal.us-east-1.dev.mediflix.com/content-manager");
		driver.manage().window().maximize();
 
	 	WebDriverWait load = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	load.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]"))).click();
	 	
	 	System.out.println("Content -> Verifying Create New Content With All Information*****************");
		Reporter.log("Content -> Verifying Create New Content With All Information");
		 
	 	WebDriverWait create_click = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	create_click.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div[2]/button[2]"))).click();
	 	 
	 	Thread.sleep(3000);
	 	 
	 	name = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/div/div[1]/div/textarea[1]"));
		name.sendKeys(name_1);
	 	
		Thread.sleep(3000);
		
	 	desc = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/div/div[2]/div/textarea[1]"));
	 	desc.sendKeys(desc_1);
	 	
	 	Thread.sleep(5000);
		// save changes button
		 
		WebDriverWait save_changes = new WebDriverWait(driver, Duration.ofSeconds(30));
		save_changes.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Create']"))).click();
		 
		Thread.sleep(10000);
		
		//second
		
		WebDriverWait create_click2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	create_click2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/div[1]/div[2]/button[2]"))).click();
	 	
	 	Thread.sleep(3000);
	 	 
	 	name = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/div/div[1]/div/textarea[1]"));
		name.sendKeys(name_2);
	 	
		Thread.sleep(3000);
		
	 	desc = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/div/div[2]/div/textarea[1]"));
	 	desc.sendKeys(desc_2);
	 	 
	 	Thread.sleep(3000);
	 	
	 	WebElement click_listed = driver.findElement(By.xpath("//input[@id='tag-listed']"));
	 	click_listed.click();
	 	
	 	Thread.sleep(5000);
		// save changes button
		 
		WebDriverWait save_changes2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		save_changes2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Create']"))).click();
		 
		Thread.sleep(10000);
		
		driver.quit();
		
	 	 
	}
	
	
	@Test (priority=3)
	public void Verify_WebSite_Login() throws InterruptedException
	{
		
		C1.Website_Login();
	    
		
	}
	
	@Test (priority=4)
	public void Verify_The_Created_Videos_Content_For_Listed() throws InterruptedException
	{
//				driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
//				driver.manage().window().maximize();
				//click search 
		
				System.out.println("Verify the created content in website by search*********************");
				Reporter.log("Verify the created content in website by search");
				WebElement click_search = driver.findElement(By.xpath("//a[@href='/search']"));
				click_search.click();
				
				Thread.sleep(3000);
				
				WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
			    load3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
					
				WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
				search.sendKeys(name_1);
				
				Thread.sleep(3000);
				// submit
				
				WebElement click_submit = driver.findElement(By.xpath("//button[@type='submit']"));
				click_submit.click();
				System.out.println("Click For Search _________________");
				
				Thread.sleep(5000);
				//load 
								
				WebDriverWait load4 = new WebDriverWait(driver, Duration.ofSeconds(60));
			    load4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flex-1 pt-8 max-w-full whitespace-normal truncate basis-60']")));
					
				//verify the search   
				
				String s1= driver.findElement(By.xpath("//p[@class='font-bold text-xl leading-120 mb-7']")).getText();
				System.out.println("result string is_________________________"+s1);
				
				Thread.sleep(5000);
				
				WebElement search2 =driver.findElement(By.xpath("//input[@type='text']"));
				search2.clear();
				search2.sendKeys(name_2);
				
				WebElement click_submit2 = driver.findElement(By.xpath("//button[@type='submit']"));
				click_submit2.click();
				driver.quit();
				 
				
	}
	
	
	
	
	
	
}
