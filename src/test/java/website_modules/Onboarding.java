package website_modules;
 
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.Random;
import java.util.Arrays;
import java.util.Properties;

public class Onboarding 
{
	
	ChromeDriver driver; 
	SoftAssert softAssert = new SoftAssert();
	
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	
//	@Test (enabled = false)
	@Test (priority=1)
	public void Sign_up() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object
		driver.manage().window().maximize();
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");
		
		Random r1 = new Random();
		
		String name = "MediPlus";
		int no = r1.nextInt(99);   
	    String domain = "@gmail.com";
	
	    String emailid = name + no + domain;
//	    System.out.println("the newly created emailid is___________"+emailid);

		driver.findElement(By.name("name")).sendKeys("Sandhya");
		driver.findElement(By.name("email")).sendKeys(emailid);
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
		Thread.sleep(10000);

//		Onboarding obj1 = new Onboarding();
		// obj1.check1(driver);
//		obj1.check2(driver);

		// driver.close();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	 	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2"))).click();
	 	
		
		String hd = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText();
		System.out.println("Headline:" + hd);
		Thread.sleep(10000);

		System.out.println("Selected Questions: "
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[1]")).getText());
		System.out.println("Selected Questions: "
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[2]")).getText());
		System.out.println("Selected Questions: "
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[4]")).getText());
		System.out.println("Selected Questions: "
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[5]")).getText());
		System.out.println("Selected Questions: "
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[7]")).getText());
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[4]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[5]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[7]")).click();
		Thread.sleep(4000);

		driver.findElement(By
				.xpath("//button[@class='Button_btn__R8YYU Button_btnLg__KLDWo rounded-lg px-6 bg-purple-2 text-white ring-white Button_btnPrimary__joyb2']"))
				.click();
		Thread.sleep(10000);
		System.out.println("Did you Know? :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/button/span")).click();
		Thread.sleep(10000);
		System.out.println("Topic Selection Screen :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());
		
		//wait for topics selection 
		
		WebDriverWait wait_topic = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait_topic.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))).click();
	 	
		
//		driver.findElement(
//				By.xpath("/html/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))
//				.click();
		
		System.out.println("Selected Topic :" + driver
				.findElement(By
						.xpath("/html/body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))
				.getText());
		
		
	//	driver.findElement(By.xpath("//span[normalize-space()='Submit my topics (1)']")).click();
		//scroll
	    JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,500)");
	    
	    WebDriverWait wait_submit = new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait_submit.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[4]/button"))).click();
	 	
		
		
		
		System.out.println("Expert Selection Screen :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());

	
		
		
		Thread.sleep(10000);
		System.out.println("Selected Expert :" + driver
				.findElement(By
						.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.getText());
		driver.findElement(By
				.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.click();
		
		

	    driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[4]/button[2]")).click();

		
		
		System.out.println("Care Package Selection Screen :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());
		Thread.sleep(10000);
		System.out.println("Selected Care Package :" + driver
				.findElement(By
						.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.getText());
		driver.findElement(By
				.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.click();
		// driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/button/span")).click();
		// driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[4]/button[2]")).click();
		Thread.sleep(10000);

//		System.out.println("Appecues :"
//				+ driver.findElement(By.xpath("/html/body/appcues/cue/section/div/div[2]/div/div/div/div/div/div/h1/span/span/span/span/span/span")).getText());
		
		
		
		
	
		
	}

	

}
