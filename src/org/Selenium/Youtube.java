package org.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
		static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void search() throws InterruptedException  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("The Lonely Shepherd");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		WebElement song = driver.findElement(By.xpath("//*[@title='André Rieu ft. Gheorghe Zamfir - The Lonely Shepherd']"));
		//WebElement song = driver.findElement(By.xpath("//*[@class='yt-simple-endpoint style-scope yt-formatted-string']//preceding::*[@title='André Rieu ft. Gheorghe Zamfir - The Lonely Shepherd']"));
		song.click();
	}
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		search();
	}

}
