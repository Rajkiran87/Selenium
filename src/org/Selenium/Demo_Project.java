package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Project {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("grrajkiran@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("123456");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		
		
	}

}
