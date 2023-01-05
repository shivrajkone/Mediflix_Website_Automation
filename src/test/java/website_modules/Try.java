package website_modules;

import java.io.FileInputStream;
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
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Credentials;

public class Try extends Credentials

{
	
//	ChromeDriver driver; 
	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	Credentials l1 =new Credentials();
	
	String content_name2="Zinc Tab";
	
//	@Test (enabled = false)
	@Test (priority=1)
	public void Admin_Login() throws IOException
	{
	
		
		l1.CMS_Login();
		
	}
	
	
	
//	@Test (enabled = false)
	@Test (priority=2)
	public void Create_Video_Content() throws InterruptedException
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
	 	 
	 	 WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div[1]/div/div/div[1]/div/textarea[1]"));
		 name.sendKeys(content_name2);
		 
		 Thread.sleep(5000);
			// save changes button
			 
			 WebDriverWait save_changes = new WebDriverWait(driver, Duration.ofSeconds(30));
			 save_changes.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/header/div/button[2]"))).click();
			 
			 Thread.sleep(10000);
			 
			 driver.quit();
		 
	}
	
//	@Test (enabled = false)
	@Test (priority=3)
	public void WebSite_Login() throws InterruptedException
	{
			l1.Website_Login();
		
	}
	
//	@Test (enabled = false)
	@Test (priority=4)
	public void Verify_The_Created_Video_Content() throws InterruptedException
	{
//			driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
			WebElement click_browser = driver.findElement(By.xpath("//a[normalize-space()='Browse']"));
			click_browser.click();
			driver.manage().window().maximize();
			//click search 
		
			System.out.println("Verify the created content in website by search*********************");
			Reporter.log("Verify the created content in website by search");
				
			WebElement click_search = driver.findElement(By.xpath("//a[@href='/search']"));
			click_search.click();
				
			Thread.sleep(3000);
				
			WebDriverWait load3 = new WebDriverWait(driver, Duration.ofSeconds(30));
			load3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
					
			WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
			search.sendKeys(content_name2);
				
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

		    if(s1.equals(content_name2))
		    {
		        	System.out.println("Search Key is matching");
					AssertJUnit.assertEquals(s1, content_name2);
		    }
			else
			{
					System.out.println("Saerch key is not matching");
					AssertJUnit.assertEquals(s1, content_name2);
					
			}
	}
	

}
