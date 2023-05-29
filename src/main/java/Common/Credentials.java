package Common;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Credentials 
{
	 
	public static ChromeDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	public void CMS_Login() throws IOException, InterruptedException
	{
		String Email="shivrajtech37@gmail.com";
		String Password="Shivraj@1234";
		
		FileInputStream objfile = new FileInputStream("config.properties");									
        prop.load(objfile);		
        
//		System.setProperty("webdriver.chrome.driver", "src" + File.separator + "Browser" + File.separator + "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		driver = new ChromeDriver(options);
	    driver.get("https://admin-portal.us-east-1.dev.mediflix.com");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(4000);
	    
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/p"))).click();
	    
		//user name
		
		WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[1]/div/input"));
		username.sendKeys(Email);
		
		Thread.sleep(2000);
		//password
		
		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/div/input"));
		password.sendKeys(Password);
		
		Thread.sleep(2000);
		
		WebDriverWait submit = new WebDriverWait(driver, Duration.ofSeconds(30));
		submit.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Continue']"))).click();
		
		Thread.sleep(10000);
		
		System.out.println("CMS Admin Login Successfully............");
	}
	
	
	public void Website_Login() throws InterruptedException
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
	
	
	public void Website_Login_SuperUser() throws InterruptedException
	{
		
		String Email="sandhya.karande@techifysolutions.com";
		String Password="@Sandhyakarande00";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/login");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(4000);
	    
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(60));
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
	    
	    
	    //click profile 
	    
	    
	    //click logout
	    
	    
		
	}
	
	
 
}
