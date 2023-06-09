package org.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_demo {
	static WebDriver driver;
	public static void keyboard() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Practices_Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		a.contextClick(mobiles).build().perform();
		for(int i=0; i<6; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public static void main(String[] args) throws AWTException {
		keyboard();
		
	}
}
