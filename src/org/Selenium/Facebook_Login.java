package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		login.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("raj");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("kiran");
		WebElement email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		email.sendKeys("rajkiran@gmail.com");
		WebElement email1 = driver.findElement(By.xpath("(//*[@data-type='text'])[4]"));
		email1.sendKeys("rajkiran@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("12345");
		WebElement day = driver.findElement(By.xpath("//*[@title='Day']"));
		Select d = new Select(day);
		d.selectByIndex(7);
		WebElement month = driver.findElement(By.xpath("//*[@title='Month']"));
		Select m = new Select(month);
		m.selectByValue("7");
		WebElement year = driver.findElement(By.xpath("//*[@title='Year']"));
		Select y = new Select(year);
		y.selectByVisibleText("1995");
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
		WebElement signup = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
		signup.click();
	
	
	
	
	}	
}
