package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//*[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Welcome to JAVA");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//*[@data-toggle='tab'])[2]")).click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Welcome to JAVA");
		driver.switchTo().defaultContent();
		
		
		
		
		
	

}
}
