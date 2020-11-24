package com.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testsnap2 {

	public static void main(String[] args) throws IOException
	
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.get(("https://c2ta.co.in/login/"));
		driver.findElement(By.id("username")).sendKeys(("sudharaj"));
		driver.findElement(By.id("password")).sendKeys(("abcdefghijkL@1986"));
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(("src/test/resources/screenshot3/ct2a.png")));

		
	}

}
