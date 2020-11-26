package testngpractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ct2a {
	
	WebDriver driver;
	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://c2ta.co.in/login/");
	}
	@Test
public void loginApp() {
		driver.findElement(By.id("username")).sendKeys("sudharaj");
		driver.findElement(By.id("password")).sendKeys("abcdefghijkL@1986");
		driver.findElement(By.xpath("//button[@type='submit']"));
	}
	@AfterTest
	public void closeApp(){
		driver.close();
	}

}
