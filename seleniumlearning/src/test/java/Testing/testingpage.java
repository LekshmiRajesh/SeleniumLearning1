package Testing;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
public class testingpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("testing");
driver.findElement(By.name("btnK")).click();
String title = driver.getCurrentUrl();
System.out.println(title);
List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println(links.size());
		

	}

}
