package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_Using_PropertyFile_Test {

	@Test
	public void loginTest() throws IOException
	{
		FileInputStream fis= new FileInputStream(".//src/test/resources/CommonData.properties");
		 Properties p = new Properties();
		 p.load(fis);
		 String BROWSER = p.getProperty("browser");
		 String URL = p.getProperty("url");
		 String USERNAME = p.getProperty("username");
		 String PASSWORD = p.getProperty("password");
		 WebDriver driver =null;
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
