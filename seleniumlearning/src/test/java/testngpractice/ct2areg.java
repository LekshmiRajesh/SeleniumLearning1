package testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ct2areg {
	WebDriver driver;
	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://c2ta.co.in/register");
		
	}

	@Test
	public void RegisterApp() {
		driver.findElement(By.id("reg_username")).sendKeys("unnimukundan");
		driver.findElement(By.id("reg_email")).sendKeys("unniraj@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("abcdefghijkL@1988");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	}
@AfterTest
public void closeApp() {
	driver.close();
}
}
