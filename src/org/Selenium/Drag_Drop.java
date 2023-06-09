package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	static WebDriver driver;
	public static void draganddrop() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Practices_Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		Actions ac = new Actions(driver);
		WebElement drop = driver.findElement(By.id("form:drop"));
		WebElement drag = driver.findElement(By.id("form:drag"));
		
		ac.clickAndHold(drag).build().perform();
		ac.dragAndDrop(drag, drop).build().perform();

	}
	public static void main(String[] args) {
		draganddrop();
	}
}
