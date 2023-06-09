package org.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {
	static WebDriver driver;
	public static void Webtable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Practices_Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://corona.help/country/india");
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement cases : findElements) {
		System.out.println(cases.getText());		
	}
}
	public static void main(String[] args) {
		Webtable();
	}

}
