package website_modules;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Onboarding 
{
	ChromeDriver driver;
	
	@Test (priority=1)
	public  void Signup() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Prasad_aute//Downloads//selenium/108/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // create object
		driver.manage().window().maximize();
		driver.get("https://client-portal.us-east-1.dev.mediflix.com/sign-up");

		driver.findElement(By.name("name")).sendKeys("Sandhya");
		driver.findElement(By.name("email")).sendKeys("flixt57@gmail.com");
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
//		// obj1.check1(driver);
//		obj1.check2(driver);

		// driver.close();
	}

//	@Test (priority=2)
	@Test (enabled = false)
	public void check1(WebDriver driver) throws InterruptedException 
	{
		//Expert Question Answers 
		// Actions act = new Actions(driver);
		String hd = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText();
		System.out.println("Headline:" + hd);
		Thread.sleep(2000);
		System.out.println("Selected Question: "
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[3]")).getText());
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[6]")).click();
		Thread.sleep(4000);
		driver.findElement(By
				.xpath("//button[@class='Button_btn__R8YYU Button_btnLg__KLDWo rounded-lg px-6 bg-purple-2 text-white ring-white Button_btnPrimary__joyb2']"))
				.click();
		Thread.sleep(10000);
		System.out.println("Did you Know? :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());
		driver.findElement(By.xpath("//span[@class='relative']")).click();
		Thread.sleep(10000);
		System.out.println("Topic Selection Screen :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());
		driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))
				.click();
		System.out.println("Selected Topic :" + driver
				.findElement(By
						.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))
				.getText());
		driver.findElement(By.xpath("//span[normalize-space()='Submit my topics (1)']")).click();
		System.out.println("Expert Selection Screen :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());

		/*
		 * WebElement view=driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"
		 * )); act.moveToElement(view); Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/button/span"
		 * )).click(); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[3]/button"
		 * )).click();
		 */

		Thread.sleep(10000);
		System.out.println("Selected Expert :" + driver
				.findElement(By
						.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.getText());
		driver.findElement(By
				.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.click();

		driver.findElement(By.xpath("//span[normalize-space()='Submit my experts (1)']")).click();

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
		driver.findElement(By.xpath("//span[normalize-space()='Submit my collection']")).click();
		Thread.sleep(10000);
		// System.out.println("Appecues:"
		// +driver.findElement(By.xpath("//span[contains(text(),'Welcome to
		// Mediflix!')]")).getText());

	}

//	@Test (priority=3)
	@Test (enabled = false)
	public void check3(WebDriver driver) throws InterruptedException 
	{
		// Instrest in Org
		// Actions act = new Actions(driver);
		String hd = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText();
		System.out.println("Headline:" + hd);
		Thread.sleep(2000);

		System.out.println("Selected Question: "
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[6]")).getText());
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[1]/div[6]")).click();
		Thread.sleep(4000);

		driver.findElement(By
				.xpath("//button[@class='Button_btn__R8YYU Button_btnLg__KLDWo rounded-lg px-6 bg-purple-2 text-white ring-white Button_btnPrimary__joyb2']"))
				.click();
		Thread.sleep(10000);
		System.out.println("Did you Know? :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/button[2]/span")).click();
		Thread.sleep(10000);
		System.out.println("Topic Selection Screen :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());
		driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))
				.click();
		System.out.println("Selected Topic :" + driver
				.findElement(By
						.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))
				.getText());
		driver.findElement(By.xpath("//span[normalize-space()='Submit my topics (1)']")).click();
		System.out.println("Expert Selection Screen :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());

		/*
		 * WebElement view=driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"
		 * )); act.moveToElement(view); Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/button/span"
		 * )).click(); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[3]/button"
		 * )).click();
		 */

		Thread.sleep(10000);
		System.out.println("Selected Expert :" + driver
				.findElement(By
						.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.getText());
		driver.findElement(By
				.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.click();

		driver.findElement(By.xpath("//span[normalize-space()='Submit my experts (1)']")).click();

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
		driver.findElement(By.xpath("//span[normalize-space()='Submit my collection']")).click();
		Thread.sleep(10000);
		// System.out.println("Appecues:"
		// +driver.findElement(By.xpath("//span[contains(text(),'Welcome to
		// Mediflix!')]")).getText());

	}
	
	@Test (priority=2)
	public void check2() throws InterruptedException 
	{
		//Redirect trusted medical institutions 

		String hd = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText();
		System.out.println("Headline:" + hd);
		Thread.sleep(2000);

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
		driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))
				.click();
		System.out.println("Selected Topic :" + driver
				.findElement(By
						.xpath("//body[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]"))
				.getText());
		driver.findElement(By.xpath("//span[normalize-space()='Submit my topics (1)']")).click();
		System.out.println("Expert Selection Screen :"
				+ driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/h2")).getText());

		/*
		 * WebElement view=driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"
		 * )); act.moveToElement(view); Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/button/span"
		 * )).click(); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div[2]/div[2]/div[1]/div[3]/button"
		 * )).click();
		 */

		Thread.sleep(10000);
		System.out.println("Selected Expert :" + driver
				.findElement(By
						.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.getText());
		driver.findElement(By
				.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div/div/div[2]/p[1]"))
				.click();

		driver.findElement(By.xpath("//span[normalize-space()='Submit my experts (1)']")).click();

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
		driver.findElement(By.xpath("//span[normalize-space()='Submit my collection']")).click();
		Thread.sleep(10000);

		System.out.println("Appecues :"
				+ driver.findElement(By.xpath("/html/body/appcues/cue/section/div/div[2]/div/div/div/div/div/div/h1/span/span/span/span/span/span")).getText());
		


	}
	
	

}
