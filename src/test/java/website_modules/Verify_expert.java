package website_modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_expert 
{

	ChromeDriver driver; 
	SoftAssert softAssert = new SoftAssert();
	 
	
	
	@Test (priority=1)
	public void website_login() throws InterruptedException
	{
		
		String Email="kashinath112@mailinator.com";
		String Password="Shivraj@12345";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/login");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(4000);
	    
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[normalize-space()='Log In']"))).click();
	    
	    WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
	    email.sendKeys(Email);
	    
	    Thread.sleep(2000);
	    
	    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    password.sendKeys(Password);
	    
	    Thread.sleep(2000);
	    
	    WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	    submit.click();
	    
	    Thread.sleep(3000);
	    
	    WebDriverWait load2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    load2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='container max-w-[1200px] mx-auto wrapper']")));
	
	    // get data
	    String get_title = driver.findElement(By.xpath("//div[@class='container max-w-[1200px] mx-auto wrapper']")).getText();
	    System.out.println("the login title of user is_________________"+get_title);
	    
		
	}
	

	@Test (priority=2)
	public void verify_the_created_content() throws InterruptedException
	{
				driver.get("https://client-portal.us-east-1.dev.mediflix.com/advice");
				driver.manage().window().maximize();
				
				//load
				Thread.sleep(4000);
				
				
				
				System.out.println("Verify the expert in website*********************");
				
				
				//scroll
			    JavascriptExecutor js = (JavascriptExecutor)driver; 
			    js.executeScript("window.scrollBy(0,400)");
				
			    Thread.sleep(3000);
				//click expert  
			    
			    WebDriverWait click_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
			    click_expert.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[1]/div/div/div[1]/button"))).click();
			
			    Thread.sleep(5000);
			    
				//verify expert
				
				// name   
			    
			    WebDriverWait expert_name = new WebDriverWait(driver, Duration.ofSeconds(30));
			    expert_name.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]"))).getText();
			    
			    String s1 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
			    System.out.println("expert name is_____________________"+s1);
			    
			    // tags   
			    
			    WebDriverWait tags = new WebDriverWait(driver, Duration.ofSeconds(30));
			    tags.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[2]")));
			    
			    String s2 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[2]")).getText();
			    System.out.println("expert tags is_____________________"+s2);
			    
			    //bio  
			    
			    WebDriverWait bio = new WebDriverWait(driver, Duration.ofSeconds(30));
			    bio.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/p[2]")));
			    
			    String s3 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/p[2]")).getText();
			    System.out.println("expert bio is_____________________"+s3);
			   
			    //questions   
			    
			    WebDriverWait questions = new WebDriverWait(driver, Duration.ofSeconds(30));
			    questions.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]"))).click();
			    
			    String s4 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div")).getText();
			    System.out.println("expert questions is_____________________"+s4);
				
			    
			    //follow and unfollow working or not
			    
			    WebDriverWait follow = new WebDriverWait(driver, Duration.ofSeconds(30));
			    follow.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"))).click();
			    
			    String s5 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).getText();
			    System.out.println("click is_____________________"+s5);
			    
			    Thread.sleep(4000);
			    
			    WebDriverWait unfollow = new WebDriverWait(driver, Duration.ofSeconds(30));
			    unfollow.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"))).click();
			    
			    String s6 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).getText();
			    System.out.println("click is_____________________"+s6);
			    
	}
	
	
}
