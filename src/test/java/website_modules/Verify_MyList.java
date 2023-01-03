package website_modules;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import access.login;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
 
public class Verify_MyList 
{
	ChromeDriver driver; 
	SoftAssert softAssert = new SoftAssert();
	String topic_name;
	String video_name;
	String expert_name;
	String channel_name;

	
	
	@Test (priority=1)
	public void Verify_WebSite_Login() throws InterruptedException
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
//	 @Test (enabled = false)
    public void Follow_Topics_Video_Expert_Channel() throws InterruptedException 
	{
		
		driver.manage().window().maximize();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/browse");
	    Actions act = new Actions(driver);

	    
	    Thread.sleep(5000);
	    
	    WebDriverWait load1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		load1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class,'leading-180 whitespace-pre-line text-lg md:text-xl')]"))).click();
	
		System.out.println("Website -> Click and Follow Topics, Videos, Expert, Channel**************");
	
		 Thread.sleep(5000);
	    
	    WebDriverWait load_page = new WebDriverWait(driver, Duration.ofSeconds(60));
	    load_page.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Obesity + Weight')]")));
	    
    
	    
	    WebElement topic = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/div/a"));
	    act.moveToElement(topic);
	    
	    topic_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/div/div[2]")).getText();
	    System.out.println("topic is _________________"+topic_name);
	    
	    Thread.sleep(3000);
	    WebDriverWait click_follow = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_follow.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/div/div[3]/button"))).click();
	
	    System.out.println("click on follow topics");
	    
	    Thread.sleep(5000);
  	    
	    video_name=driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[8]/div/div[3]/div/div/div[3]/div/div/div[2]/div/p")).getText();
	    System.out.println("video for selection_________________"+video_name);
	    
	  
	    //click video  
	    
	    WebDriverWait click_video = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_video.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[8]/div/div[3]/div/div/div[2]/div/div/div[2]/div/button"))).click();
	
	    //click add to watch list  
	    
	    WebDriverWait click_watchlist= new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_watchlist.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div/button[2]"))).click();
	    
	    System.out.println("click on add to watchlist");
	    
	    Thread.sleep(5000);
	    
	    //go to advice page
	    
	    WebDriverWait click_advice= new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_advice.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Advice']"))).click();
	
	    //load 
	    WebDriverWait load_advice= new WebDriverWait(driver, Duration.ofSeconds(60));
	    load_advice.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='slick-slide slick-active slick-current']//div//div[@class='absolute bottom-0 right-0 px-4 py-3 hidden md:block']")));
	
	    Thread.sleep(3000);
	    
	    WebElement expert = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[1]/div/div/div[1]/button"));
	    act.moveToElement(expert);
	   
	    Thread.sleep(3000);
	    WebDriverWait click_follow_expert = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_follow_expert.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[1]/div/div/div[1]/div[3]/button"))).click();
	
	    System.out.println("click on follow expert");
	    
	    expert_name = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]")).getText();
	    System.out.println("expert is _________________"+expert_name);
	    
	    //second advice
	    //click advice
	    
	    WebDriverWait click_advice2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_advice2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div[3]/div/div/div[2]/div/div/div[1]/button"))).click();
	
	    WebDriverWait click_follow2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_follow2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"))).click();
	    
	    // click cancel icon   
	     
	    WebDriverWait click_cancel = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_cancel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/button"))).click();
	    
	    Thread.sleep(5000);
	    
	    //go to channel
	    WebDriverWait click_channel= new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Channels']"))).click();
	
	    Thread.sleep(5000);
	    
	    //load 
	    WebDriverWait load_channel= new WebDriverWait(driver, Duration.ofSeconds(60));
	    load_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[normalize-space()='Meet our Institutions']"))).click();
	    	   
	    //click on channel
	    WebDriverWait click_channel_icon= new WebDriverWait(driver, Duration.ofSeconds(60));
	    click_channel_icon.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[3]/div/div/div[1]/div/div/a"))).click();
	
	    Thread.sleep(3000);
	   
	    //click learn more
	    WebDriverWait learn_more= new WebDriverWait(driver, Duration.ofSeconds(30));
	    learn_more.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Learn more']"))).click();
	    
	    Thread.sleep(3000);
	    //get channel name
	    channel_name = driver.findElement(By.xpath("//p[@class='text-lg']")).getText();
	    System.out.println("channel name is_____________"+channel_name);
	    
	    Thread.sleep(3000);
	    //click cancel
	    WebDriverWait cancel= new WebDriverWait(driver, Duration.ofSeconds(30));
	    cancel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[2]"))).click();
	    
	    Thread.sleep(3000);
	    
	    //click follow
	    WebDriverWait click_channel_follow= new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_channel_follow.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='relative w-full group bg-denim dark']//button[2]"))).click();
	
	    Thread.sleep(5000);

	
	}  
	
	 @Test (priority=3)
//	 @Test (enabled = false)
	public void Verify_The_Following_Topics_Expert_Videos_Channel() throws InterruptedException
	{
		
		driver.manage().window().maximize();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/journey");
	    driver.navigate().refresh();
	    
	    
	    //load
	    Thread.sleep(7000);
	    
	    System.out.println("Website -> Verifying MyList From User Profile**************");
		
		 //click profile icon 
	    WebDriverWait click_profile_icon2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_profile_icon2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class,'relative')])[1]"))).click();
	
	    //click mylist  
	    WebDriverWait click_mylist2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_mylist2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='My List']"))).click();
	   
	    Thread.sleep(10000);
	    
	    //load 
	    WebDriverWait load4 = new WebDriverWait(driver, Duration.ofSeconds(60));
	    load4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Your List']")));
	
	    Thread.sleep(5000);
	    
	    System.out.println("Verify MyList and following of topics************************");
	    
	    String topic_verify = driver.findElement(By.xpath("//div[contains(text(),'Obesity + Weight')]")).getText();
	   	    
	    System.out.println("topic is _________________"+topic_verify);
	    
	    if(topic_name.equals(topic_verify))
	    {
			System.out.println("Followed topic is matching");
			AssertJUnit.assertEquals(topic_name, topic_verify);
		}
		else
		{
			System.out.println("Followed topic is not matching");
			AssertJUnit.assertEquals(topic_name, topic_verify);
			Reporter.log( "[ERROR] -> Website -> MyList -> Followed Topic Is Not Matching.");
		}
	    
	    
	    //scroll
	    JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(3000);
	    
	    System.out.println("Verify MyList and verify video watchlist************************");
	    
	    String video_name_verify =driver.findElement(By.xpath("//p[@class='grow font-semibold text-lg leading-160 whitespace-pre-line overflow-hidden cursor-pointer']")).getText();
	    
	    System.out.println("video for selection_________________"+video_name_verify);
	    
	    if(video_name.equals(video_name_verify))
	    {
	    	System.out.println("Video Watchlist is matching");
			AssertJUnit.assertEquals(video_name, video_name_verify);
	    	
	    }
	    else
	    {
	    	System.out.println("Video Watchlist is not matching");
			AssertJUnit.assertEquals(video_name, video_name_verify);
			Reporter.log( "[ERROR] -> Website -> MyList -> Video Not Added In WatchList.");
	    }
	    
	    JavascriptExecutor js2 = (JavascriptExecutor)driver; 
	    js2.executeScript("window.scrollBy(0,500)");
	    
	    System.out.println("Verify MyList and follow channel ************************");
	    
	    //click on channel
	    WebDriverWait click_channel_icon= new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_channel_icon.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/channels/cleveland-clinic']"))).click();
	
	    //click learn more
	    WebDriverWait learn_more= new WebDriverWait(driver, Duration.ofSeconds(30));
	    learn_more.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Learn more']"))).click();
	    
	    Thread.sleep(3000);
	    	    
	    //get channel name
	    String channel_verify = driver.findElement(By.xpath("//p[@class='text-lg']")).getText();
	    System.out.println("Following channel is_________________"+channel_verify);
	   
	    //click cancel
	    WebDriverWait cancel= new WebDriverWait(driver, Duration.ofSeconds(30));
	    cancel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[2]"))).click();
	    
	    Thread.sleep(3000);
	   
	    //go back  
	    WebDriverWait go_back= new WebDriverWait(driver, Duration.ofSeconds(30));
	    go_back.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Go Back']"))).click();

	    Thread.sleep(5000);
	    
	    if(channel_name.equals(channel_verify))
	    {
	    	System.out.println("Followed channel is matching");
			AssertJUnit.assertEquals(channel_name, channel_verify);
	    	
	    }
	    else
	    {
	    	System.out.println("Followed channel is not matching");
			AssertJUnit.assertEquals(channel_name, channel_verify);
			Reporter.log( "[ERROR] -> Website -> MyList -> Followed channel is not matching.");
	    }
	    
	    Thread.sleep(3000);
	    
	    System.out.println("Verify MyList and follow expert ************************");
	    
	    String expert_verify =driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[4]/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]")).getText();
	    
	    System.out.println("Following expert is_________________"+expert_verify);
	    
	    if(expert_name.equals(expert_verify))
	    {
	    	System.out.println("Followed expert is matching");
			AssertJUnit.assertEquals(expert_name, expert_verify);
	    	
	    }
	    else
	    {
	    	System.out.println("Followed expert is not matching");
			AssertJUnit.assertEquals(expert_name, expert_verify);
			Reporter.log( "[ERROR] -> Website -> MyList -> Followed expert is not matching.");
	    }

	    Thread.sleep(5000);
	    
	    System.out.println("Verify MyList and second expert ************************");
	    
	    String expert_verify2 =driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[4]/div/div[3]/div/div/div[2]/div/div/div[2]/p[1]")).getText();
	    
	    System.out.println("Following expert is_________________"+expert_verify2);
	    
	    //click expert   
	    
	    WebDriverWait click_expert3= new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_expert3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div/div[4]/div/div[3]/div/div/div[2]/div/div/div[1]/button"))).click();
	    
	    Thread.sleep(3000);
	    
	    //verify image /html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/span/img
	    
	    //verify name  
	    String expert_name =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
	    if(expert_name.equals(expert_name))
		{
			System.out.println("expert name is present");
			AssertJUnit.assertEquals(expert_name, expert_name);
		}
		else
		{
			System.out.println("expert name is not present");
			AssertJUnit.assertEquals(expert_name, expert_name);
			Reporter.log( "[ERROR] -> Website -> Advice -> Expert -> Expert Name Is Not Present.");
		}
	    
	    // verify tags  
	    String tags=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[2]")).getText();
	    if(tags.equals(tags))
		{
			System.out.println("expert tags is present");
			AssertJUnit.assertEquals(tags, tags);
		}
		else
		{
			System.out.println("expert tags is not present");
			AssertJUnit.assertEquals(tags, tags);
			Reporter.log( "[ERROR] -> Website -> Advice -> Expert -> Expert tags Is Not Present.");
		}
	    
	    //verify bio 
	    String bio =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[2]")).getText();
	    if(bio.equals(bio))
		{
			System.out.println("expert bio is present");
			AssertJUnit.assertEquals(bio, bio);
		}
		else
		{
			System.out.println("expert bio is not present");
			AssertJUnit.assertEquals(bio, bio);
			Reporter.log( "[ERROR] -> Website -> Advice -> Expert -> Expert Bio Is Not Present.");
		}
		
	}

	
	 @Test (priority=4)
//	 @Test (enabled = false)
	public void Unfollow_Topics_Videos_Expert_channel() throws InterruptedException
	{
		driver.manage().window().maximize();
	    driver.get("https://client-portal.us-east-1.dev.mediflix.com/journey");
	    Actions act = new Actions(driver);
	    //load
	    Thread.sleep(7000);
	    
	    System.out.println("Website -> Verifying MyList From User Profile To Unfollow**************");
	    	    
	    //click profile icon 
	    WebDriverWait click_profile_icon2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_profile_icon2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class,'relative')])[1]"))).click();
	
	    //click mylist  
	    WebDriverWait click_mylist2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_mylist2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='My List']"))).click();
	   
	    Thread.sleep(10000);
	    
	    
	    
	    //topic unfollow
	    WebDriverWait load_page = new WebDriverWait(driver, Duration.ofSeconds(60));
	    load_page.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Obesity + Weight')]")));

	    WebElement topic = driver.findElement(By.xpath("//div[contains(text(),'Obesity + Weight')]"));
	    act.moveToElement(topic);
	    
	    Thread.sleep(3000);
	    WebDriverWait click_follow = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_follow.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/div[3]/button"))).click();
	
	    System.out.println("Unfollow the topics");
	    Thread.sleep(5000);
	    
	    // expert unfollow
	    
	    WebElement expert = driver.findElement(By.xpath("//div[@class='slick-slide slick-active slick-current']//div//div[@class='absolute bottom-0 right-0 px-4 py-3 hidden md:block']"));
	    act.moveToElement(expert);
	   
	    Thread.sleep(3000);
	    WebDriverWait click_follow_expert = new WebDriverWait(driver, Duration.ofSeconds(60));
	    click_follow_expert.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div/div[4]/div/div[3]/div/div/div[1]/div/div/div[1]/div[3]/button"))).click();
	
	    System.out.println("Unfollow the expert");
	    Thread.sleep(5000);
	    
	    //channel unfollow
	     
	    //click channel   
	    WebDriverWait click_channel = new WebDriverWait(driver, Duration.ofSeconds(60));
	    click_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='absolute w-full h-full']"))).click();
	   
	    Thread.sleep(3000);
	   
	    //click follow   
	    WebDriverWait click_follow_channel = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_follow_channel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Following']"))).click();
	    
	    System.out.println("Unfollow the channel");
	    Thread.sleep(3000);
	    
	    //click go back  
	    WebDriverWait click_goback = new WebDriverWait(driver, Duration.ofSeconds(30));
	    click_goback.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[1]/button"))).click();
	    
	    
	}

}
