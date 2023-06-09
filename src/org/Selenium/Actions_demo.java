package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_demo {
	
	static WebDriver driver;
	public static void mouse() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Practices_Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Slider.html");
		
//		WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		WebElement slider = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		Actions ac = new Actions(driver);
		
//		ac.click(mobiles).build().perform();
//		ac.contextClick(mobiles).build().perform();
		
		ac.clickAndHold(slider).build().perform();
		ac.moveToElement(slider, 200, 0).build().perform();
		ac.release(slider).build().perform();
		
	}	
	public static void main(String[] args) {
		mouse();
	}
}
