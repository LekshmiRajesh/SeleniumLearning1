package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.get("https://c2ta.co.in/register/");
		driver.findElement(By.id("reg_username")).sendKeys("chandra");
		driver.findElement(By.id("reg_email")).sendKeys("lekshmirajesh3@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("abcdefghijKl@6004");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	}

}
