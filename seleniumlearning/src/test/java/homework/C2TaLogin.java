package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C2TaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://c2ta.co.in/");
String title=driver.getTitle();
System.out.println(title);
driver.get(("https://c2ta.co.in/login/"));
driver.findElement(By.id("username")).sendKeys(("sudharaj"));
//driver.findElement(By.id("password")).sendKeys(("abcdefghijkL@1986"));
//driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
driver.findElement(By.linkText("Lost your password?")).click();
driver.findElement(By.partialLinkText("Lost your password?")).click();
	}

}
