package website_modules;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
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
	
	String uname = "MediflixUser";
	String password ="@Sandhya00";
	String invalid_password = "sandhya";
	String phone = "8788093523";
	String invalidphone ="908765432112";
	String email;
	

	
	@Test (priority=1)
	public void Setup() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		driver = new ChromeDriver(options); 
	
	}
	
	@Test (priority=2)
	public void Verify_Signup_Page() throws InterruptedException
	{
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
		String random =RandomStringUtils.randomAlphanumeric(4).toLowerCase();
		String a= "@gmail.com";
		
		email = random+a;
				
		
	driver.findElement(By.name("name")).sendKeys(uname);
	driver.findElement(By.name("email")).sendKeys(email);
	Thread.sleep(2000);

	WebElement country_send = driver.findElement(By.id("country"));
	country_send.sendKeys("India");
	//country_send.click();

	WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
	select_country.until(ExpectedConditions
			.presenceOfElementLocated(By.xpath("//div[@class='country-select-item country-select-item-option country-select-item-option-active']//div[@class='country-select-item-option-content']")))
			.click();
	
/*	WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
	select_country.until(ExpectedConditions
			.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div/div/div[2]/div/text()")))
			.click();*/

	driver.findElement(By.name("phone")).sendKeys(phone);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("confirmPassword")).sendKeys(password);
	driver.findElement(By.name("terms")).click();
	driver.findElement(By.cssSelector("span[class='relative']")).click();
	Thread.sleep(5000);
	System.out.println("signup done");
	WebDriverWait msg = new WebDriverWait(driver, Duration.ofSeconds(30));
	String msg1 = msg.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/div/h1"))).getText();
	System.out.println(msg1);
	
	WebDriverWait signin = new WebDriverWait(driver, Duration.ofSeconds(10));
	signin.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(@class,'rounded-full border h-8 w-8 text-xs text-white ml-3 cursor-pointer')]"))).click();
	System.out.println("Logout");
	driver.findElement(By.xpath("//button[contains(@class,'Button_btn__R8YYU h-8 rounded-lg text-sm px-8 py-5 mx-auto text-purple-2 ring-purple-2 active:text-purple-2-dark dark:text-purple-2-dark Button_btnSecondary__Q9fGc')]")).click();
	System.out.println("Sign Up Successfull");
	
	}
	

@Test (priority=3)
public void Email_verification() throws InterruptedException
{
	Thread.sleep(2000);
	driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
    driver.manage().window().maximize();
    //driver.navigate().refresh();
    
	driver.findElement(By.name("name")).sendKeys(uname);
	driver.findElement(By.name("email")).sendKeys("sandhya.karandetechifysolutions.com");
	Thread.sleep(2000);

	WebElement country_send = driver.findElement(By.id("country"));
	country_send.sendKeys("India");

	WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
	select_country.until(ExpectedConditions
			.presenceOfElementLocated(By.xpath("//div[@class='country-select-item country-select-item-option country-select-item-option-active']//div[@class='country-select-item-option-content']")))
			.click();

	driver.findElement(By.name("phone")).sendKeys(phone);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("confirmPassword")).sendKeys(password);
	driver.findElement(By.name("terms")).click();
	//driver.findElement(By.cssSelector("span[class='relative']")).click();
	System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
	Thread.sleep(3000);
	System.out.println("On entering invalid/ existing email Id----> Successfuly shows an error message");
	
	}

	@Test (priority=4)
	public void Phone_verification() throws InterruptedException
	{
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    
		driver.findElement(By.name("name")).sendKeys(uname);
		driver.findElement(By.name("email")).sendKeys("flix3@gmail.com");
		Thread.sleep(2000);

		WebElement country_send = driver.findElement(By.id("country"));
		country_send.sendKeys("India");

		WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
		select_country.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='country-select-item country-select-item-option country-select-item-option-active']//div[@class='country-select-item-option-content']")))
				.click();

		driver.findElement(By.name("phone")).sendKeys(invalidphone);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.cssSelector("span[class='relative']")).click();
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
		Thread.sleep(3000);
		System.out.println("On entering invalid Phone number----> Successfuly shows an error message");

	
}
	
	@Test (priority=5)
	void Pswd_verification() throws InterruptedException
	{
		
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    
		driver.findElement(By.name("name")).sendKeys(uname);
		driver.findElement(By.name("email")).sendKeys("flix3@gmail.com");
		Thread.sleep(2000);

		WebElement country_send = driver.findElement(By.id("country"));
		country_send.sendKeys("India");

		WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
		select_country.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='country-select-item country-select-item-option country-select-item-option-active']//div[@class='country-select-item-option-content']")))
				.click();

		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("password")).sendKeys(invalid_password);
		driver.findElement(By.name("confirmPassword")).sendKeys(invalid_password);
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.cssSelector("span[class='relative']")).click();
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
		Thread.sleep(3000);
		System.out.println("On entering password with invalid criteria ----> Successfuly shows an error message");

	
}

	@Test (priority=6)
	public void Cpswd_verification() throws InterruptedException
	{
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    
		driver.findElement(By.name("name")).sendKeys(uname);
		driver.findElement(By.name("email")).sendKeys(email);
		Thread.sleep(2000);

		WebElement country_send = driver.findElement(By.id("country"));
		country_send.sendKeys("India");

		WebDriverWait select_country = new WebDriverWait(driver, Duration.ofSeconds(30));
		select_country.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='country-select-item country-select-item-option country-select-item-option-active']//div[@class='country-select-item-option-content']")))
				.click();

		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(invalid_password);
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.cssSelector("span[class='relative']")).click();
		
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")).getText());
		Thread.sleep(3000);
		System.out.println("On entering inorrect password ----> Successfuly shows an error message");

	
}

}
