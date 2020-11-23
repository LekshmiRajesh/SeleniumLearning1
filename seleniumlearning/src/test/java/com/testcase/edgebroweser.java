package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edgebroweser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
driver.findElement(By.linkText("forgotPasswordLink")).click();
driver.findElement(By.partialLinkText("forgotPasswordLink")).click();
driver.quit();	

	}

}
