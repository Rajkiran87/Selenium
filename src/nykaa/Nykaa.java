package nykaa;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	static WebDriver driver;
	
	public static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_Practices\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public static void createaccount() {
		driver.findElement(By.xpath("//button[@kind='primary']")).click();
		driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("8015308683");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement verify = driver.findElement(By.xpath("//input[@type='number']"));
		verify.click();		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your OTP");
		String otp = s.next();
		verify.sendKeys(otp);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	public static void selection() throws Throwable  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//li[@class='CustomCl-Padding'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Topwear'])[1]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@role='checkbox'])[1]")).click();
		
		Actions a = new Actions(driver);
		
		WebElement category = driver.findElement(By.xpath("(//button[@aria-label='Scroll handle'])[1]"));
		a.clickAndHold(category).build().perform();
		a.moveToElement(category, 0, 100).build().perform();
		a.release(category).build().perform();
		driver.findElement(By.xpath("(//div[@role='checkbox'])[10]")).click();
		
//		WebElement brand = driver.findElement(By.xpath("(//button[@aria-label='Scroll handle'])[2]"));
//		a.clickAndHold(brand).build().perform();
//		a.moveToElement(brand, 0, 25).build().perform();
//		a.release(brand).build().perform();

	//	driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("Blackberrys");
	//	driver.findElement(By.xpath("(//div[@aria-label='checkbox'])[13]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Brand']//parent::div//parent::div//child::div[3]//descendant::div[4]//child::div[22]//child::div[2]")).click();
	
		WebElement slider = driver.findElement(By.xpath("//div[@class='rc-slider']//child::div[4]"));
		a.clickAndHold(slider).build().perform();
		a.moveToElement(slider, 70, 0).build().perform();
		a.release(slider).build().perform();
		
//		WebElement size = driver.findElement(By.xpath("(//button[@aria-label='Scroll handle'])[3]"));
//		a.clickAndHold(size).build().perform();
//		a.moveToElement(size, 0, 60).build().perform();
//		a.release(size).build().perform();
//		driver.findElement(By.xpath("//span[text()='Size']//parent::div//following-sibling::div//descendant::div[4]//child::div[11]")).click();
		
		driver.findElement(By.xpath("//article[@class='css-orn4tg']//descendant::div[8]//child::div//child::span[1]")).click();
	}
	public static void checkout() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String window : windowHandles) {
			WebDriver title = driver.switchTo().window(window);
			System.out.println(title);
		}
		
		driver.findElement(By.xpath("//button[@label='42']")).click();
		driver.findElement(By.xpath("//button[text()='Add to Bag']")).click();
		WebElement pincode = driver.findElement(By.xpath("//input[@type='number']"));
		pincode.click();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your pincode");
		String code = s.next();
		pincode.sendKeys(code);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		driver.findElement(By.xpath("//div[@role='button']")).click();
		
		WebElement cart = driver.findElement(By.xpath("//iframe[@title='Nykaa Fashion Cart']"));
		driver.switchTo().frame(cart);
		
		driver.findElement(By.xpath("//button[@data-at='continue-to-checkout']")).click();
		WebElement number = driver.findElement(By.xpath("//input[@aria-label='Mobile number']"));
		number.click();
		System.out.println("Enter Your Mobile Number");
		String mobile = s.next();
		number.sendKeys(mobile);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		WebElement otp1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		otp1.click();
//		WebElement otp2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		otp2.click();
//		WebElement otp3 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//		otp3.click();
//		WebElement otp4 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
//		otp4.click();
//		WebElement otp5 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
//		otp5.click();
//		WebElement otp6 = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
//		otp6.click();
		
//		System.out.println("Enter Your OTP");
//		String otpa = s.next();
//		otp1.sendKeys(otpa);
//		Thread.sleep(10000);
//		String otpb = s.next();
//		otp2.sendKeys(otpb);
//		Thread.sleep(10000);
//		String otpc = s.next();
//		otp3.sendKeys(otpc);
//		Thread.sleep(10000);
//		String otpd = s.next();
//		otp4.sendKeys(otpd);
//		Thread.sleep(10000);
//		String otpe = s.next();
//		otp5.sendKeys(otpe);
//		Thread.sleep(10000);
//		String otpf = s.next();
//		otp6.sendKeys(otpf);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	public static void main(String[] args) throws Throwable  {
		
		browserlaunch();
		//createaccount();
		selection();
		checkout();
	}
}
