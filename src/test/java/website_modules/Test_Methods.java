package website_modules;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class Test_Methods extends Credentials
{
	
	SoftAssert softAssert = new SoftAssert();
	
//	public static Properties prop = new Properties();
//	public static FileReader fr;
	
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

		WebElement inst_input_click = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[6]/div/div/input"));
		inst_input_click.click();
		
		String read_input_type = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[6]/div/div")).getText();
		System.out.println("the input text are "+read_input_type);
		
		
		
		
		
		
		//click the input and remove the institution 
		
//		WebElement inst_input_click = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[6]/div/div/input"));
//		inst_input_click.click();
//		Thread.sleep(2000);
//		inst_input_click.sendKeys(Keys.BACK_SPACE);
		
		//click ramdom  
		
//		WebDriverWait click_ramdom = new WebDriverWait(driver, Duration.ofSeconds(60));
//		click_ramdom.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/h2"))).click();
//			    	
//		Thread.sleep(2000);
//		
//		WebDriverWait save1 = new WebDriverWait(driver, Duration.ofSeconds(30));
//		save1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Save']"))).click();
//		 
//			 driver.quit();
		 
	}

}
