package website_modules;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import access.login;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class Verify_Edit_Profile extends login
{
	
	SoftAssert softAssert = new SoftAssert();
	
	String name="shivraj kone";
	String zip="50031";
	String birth_year="2000";
	 
	
	 @Test (priority=1)
//	 @Test (enabled = false)
     public void Edit() throws InterruptedException 
	 {
		driver.manage().window().maximize();
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
		
	    Thread.sleep(5000);
	    
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class,'leading-180 whitespace-pre-line text-lg md:text-xl')]"))).click();
	
		System.out.println("Website ->Verify Edit Profile**************");
		
		//click profile icon 
	    WebDriverWait click_profile_icon2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_profile_icon2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class,'relative')])[1]"))).click();
	
	    //click edit profile  
	    WebDriverWait click_edit = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_edit.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='View/Edit Profile']"))).click();
	   
	    Thread.sleep(5000);
	    // name  
	    
	    WebElement user_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[2]/div/div/input"));
 
	    user_name.clear();
	    
	    user_name.sendKeys(name);
	    
	    Thread.sleep(2000);
	    
	    WebElement zip_code = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[3]/div/div/input"));
	   
	    zip_code.sendKeys(zip);
	    
	    Thread.sleep(2000);
	    
	    WebElement birthyear = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[6]/div/div/div[1]/div/input"));
	    birthyear.click();
	    
	    WebElement select=driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div/div[6]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]"));
	    select.click();
	    
	    
	    Thread.sleep(2000);
	   	    
	    WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(30));
	    save.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Save']"))).click();
	   
	    Thread.sleep(4000);
	    
	 }

}
