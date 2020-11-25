package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown1 {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//*[@id=\'menu-item-807\']/a"));
		driver.get("https://c2ta.co.in/course/practice/lessons/input-learning/");
	    WebElement it=driver.findElement(By.name("dropdown-class-example"));
	    Select obj = new Select(it);
	    obj.selectByValue("option1");
	    obj.selectByVisibleText("Option2");
	}

}
