package com.testcase;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
String title=driver.getTitle();
System.out.println(title);

	}

}
