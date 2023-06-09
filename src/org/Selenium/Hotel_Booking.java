package org.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Booking {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://adactinhotelapp.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = Driver.findElement(By.xpath("//*[@name='username']"));
		username.sendKeys("Sachin10");
		WebElement password = Driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("53MEPC");
		WebElement submit = Driver.findElement(By.xpath("//*[@type='Submit']"));
		submit.click();
		
		WebElement Location = Driver.findElement(By.name("location"));
		Select s = new Select(Location);
		s.selectByIndex(8);
		WebElement hotel = Driver.findElement(By.name("hotels"));
		Select h = new Select(hotel);
		h.selectByIndex(2);
		WebElement room = Driver.findElement(By.id("room_type"));
		Select r = new Select(room);
		r.selectByValue("Deluxe");
		WebElement No_of_rooms = Driver.findElement(By.id("room_nos"));
		Select n = new Select(No_of_rooms);
		n.selectByValue("3");
		WebElement checkin = Driver.findElement(By.id("datepick_in"));
		checkin.clear();
		checkin.sendKeys("29/03/2023");
		WebElement checkout = Driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("30/03/2023");
		WebElement Adults = Driver.findElement(By.xpath("(//*[@class='search_combobox'])[5]"));
		Select a = new Select(Adults);
		a.selectByVisibleText("2 - Two");
		WebElement Child = Driver.findElement(By.name("child_room"));
		Select c = new Select(Child);
		c.selectByValue("1");
		WebElement Submit = Driver.findElement(By.xpath("(//*[@class='reg_button'])[1]"));
		Submit.click();
		
		WebElement list = Driver.findElement(By.xpath("//*[@type='radio']"));
		list.click();
		WebElement finish = Driver.findElement(By.id("continue"));
		finish.click();
		
		WebElement firstname = Driver.findElement(By.xpath("//*[@name='first_name']"));
		firstname.sendKeys("Sachin");
		WebElement lastname = Driver.findElement(By.xpath("//*[@name='last_name']"));
		lastname.sendKeys("Tendulkar");
		WebElement address = Driver.findElement(By.xpath("//*[@class='txtarea']"));
		address.sendKeys("#8, Vivekanandar street, dubai main road, dubai cross road, dubai");
		WebElement CardNumber = Driver.findElement(By.xpath("(//*[@class='reg_input'])[3]"));
		CardNumber.sendKeys("1234567891012134");
		WebElement Cardtype = Driver.findElement(By.name("cc_type"));
		Select t = new Select(Cardtype);
		t.selectByIndex(2);
		WebElement Expirymonth = Driver.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
		Select Ed = new Select(Expirymonth);
		Ed.selectByVisibleText("December");
		WebElement Expiryyear = Driver.findElement(By.name("cc_exp_year"));
		Select Ey = new Select(Expiryyear);
		Ey.selectByVisibleText("2022");
		WebElement cvv = Driver.findElement(By.xpath("(//*[@class='reg_input'])[4]"));
		cvv.sendKeys("666");
		WebElement booknow = Driver.findElement(By.id("book_now"));
		booknow.click();
		
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		Driver.findElement(By.id("logout"));
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(6000);
		TakesScreenshot ss = (TakesScreenshot)Driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		File F = new File("C:\\Users\\Karthik\\eclipse-workspace\\Selenium\\ScreenShot\\HotelBooking.png");
		FileHandler.copy(screenshotAs, F);
			
			
		
		
	}

}
