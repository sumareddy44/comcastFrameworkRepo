package DDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_Using_Maven_RunTime {

	@Test
	public void login()
	{
		 String BROWSER = System.getProperty("browser");
		 String URL = System.getProperty("url");
		 String USERNAME=System.getProperty("username");  
		 String PASSWORD= System.getProperty("password");
			WebDriver	 driver =null;
		 if(BROWSER.equals("chrome"))
		 {
			 driver = new ChromeDriver();
		 }
		 else if(BROWSER.equals("Firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 else if(BROWSER.equals("edge"))
		 {
			 driver = new EdgeDriver();
		 }
		 else
		 {
			 driver = new EdgeDriver();  //by default
		 }
		 driver.get(URL);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("inputEmail")).sendKeys(USERNAME);
		 driver.findElement(By.id("inputPassword")).sendKeys(PASSWORD);
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		 driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
         driver.quit();
	}
}
