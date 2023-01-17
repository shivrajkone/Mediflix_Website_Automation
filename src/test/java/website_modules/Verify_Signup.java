package website_modules;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

 
public class Verify_Signup 
{
	ChromeDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	@Test (priority=1)
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
	    driver.manage().window().maximize();
		
	}
	
	@Test (priority=2)
	public void Verify_Signup_Page() throws InterruptedException
	{

	driver.findElement(By.name("name")).sendKeys("Sandhya");
	driver.findElement(By.name("email")).sendKeys("flix4@gmail.com");
	Thread.sleep(2000);

	WebElement country_send = driver.findElement(By.id("country"));
	country_send.sendKeys("India");

	WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
	select_country.until(ExpectedConditions
			.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div/div")))
			.click();

	driver.findElement(By.name("phone")).sendKeys("8788093523");
	driver.findElement(By.name("password")).sendKeys("Sandhya00");
	driver.findElement(By.name("confirmPassword")).sendKeys("Sandhya00");
	driver.findElement(By.name("terms")).click();
	driver.findElement(By.cssSelector("span[class='relative']")).click();
	
	}
	

@Test (priority=3)
public void Email_verification() throws InterruptedException
{
	driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
    driver.manage().window().maximize();
    driver.navigate().refresh();
    
	driver.findElement(By.name("name")).sendKeys("Sandhya");driver.findElement(By.name("email")).sendKeys("flix3gmail.com");
	Thread.sleep(2000);

	WebElement country_send = driver.findElement(By.id("country"));
	country_send.sendKeys("India");

	WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
	select_country.until(ExpectedConditions
			.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div/div")))
			.click();

	driver.findElement(By.name("phone")).sendKeys("8788093523");
	driver.findElement(By.name("password")).sendKeys("Sandhya00");
	driver.findElement(By.name("confirmPassword")).sendKeys("Sandhya00");
	driver.findElement(By.name("terms")).click();
	//driver.findElement(By.cssSelector("span[class='relative']")).click();
	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
	
	/*driver.findElement(By.name("name")).sendKeys("Sandhya");
	String [] emailary = {"sandhya@gmail", "sandhya.gmail.com", "sandhya@gmail.com", "sandhyaatgmail.com"};
	
	for(int i=0; i<emailary.length;i++ )
		
	{
		
	driver.findElement(By.name("email")).sendKeys(emailary[i]);
	driver.findElement(By.name("phone")).click();
	Thread.sleep(2000);
	WebElement country_send = driver.findElement(By.id("country"));
	country_send.sendKeys("India");

	WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
	select_country.until(ExpectedConditions
			.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div/div")))
			.click();

	driver.findElement(By.name("phone")).sendKeys("8788093523");
	driver.findElement(By.name("password")).sendKeys("Sandhya00");
	driver.findElement(By.name("confirmPassword")).sendKeys("Sandhya00");
	driver.findElement(By.name("terms")).click();
	//driver.findElement(By.cssSelector("span[class='relative']")).click();
	
	Thread.sleep(2000);
	
	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
	
	*/
	}

	@Test (priority=4)
	public void Phone_verification() throws InterruptedException
	{
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    
		driver.findElement(By.name("name")).sendKeys("Sandhya");driver.findElement(By.name("email")).sendKeys("flix3@gmail.com");
		Thread.sleep(2000);

		WebElement country_send = driver.findElement(By.id("country"));
		country_send.sendKeys("India");

		WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
		select_country.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div/div")))
				.click();

		driver.findElement(By.name("phone")).sendKeys("878809300523");
		driver.findElement(By.name("password")).sendKeys("Sandhya00");
		driver.findElement(By.name("confirmPassword")).sendKeys("Sandhya00");
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.cssSelector("span[class='relative']")).click();
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
	

	
}
	
	@Test (priority=5)
	void Pswd_verification() throws InterruptedException
	{
		
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    
		driver.findElement(By.name("name")).sendKeys("Sandhya");driver.findElement(By.name("email")).sendKeys("flix3@gmail.com");
		Thread.sleep(2000);

		WebElement country_send = driver.findElement(By.id("country"));
		country_send.sendKeys("India");

		WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
		select_country.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div/div")))
				.click();

		driver.findElement(By.name("phone")).sendKeys("8788093523");
		driver.findElement(By.name("password")).sendKeys("sandhya00");
		driver.findElement(By.name("confirmPassword")).sendKeys("sandhya00");
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.cssSelector("span[class='relative']")).click();
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
	

	
}

	@Test (priority=6)
	public void Cpswd_verification() throws InterruptedException
	{
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    
		driver.findElement(By.name("name")).sendKeys("Sandhya");driver.findElement(By.name("email")).sendKeys("flix3@gmail.com");
		Thread.sleep(2000);

		WebElement country_send = driver.findElement(By.id("country"));
		country_send.sendKeys("India");

		WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
		select_country.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div/div")))
				.click();

		driver.findElement(By.name("phone")).sendKeys("8788093523");
		driver.findElement(By.name("password")).sendKeys("Sandhya00");
		driver.findElement(By.name("confirmPassword")).sendKeys("sandhya00");
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.cssSelector("span[class='relative']")).click();
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
	

	
}

}
