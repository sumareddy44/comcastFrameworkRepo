package com.Target.Ecomm.GenericUtility.baseClass;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Target.genericUtility.Database.Database_Utility;
import com.Target.genericUtility.File_Utility.Excel_FileUtility;
import com.Target.genericUtility.File_Utility.Property_FileUtility;
import com.Target.genericUtility.ObjectRepo.HomePage;
import com.Target.genericUtility.ObjectRepo.LoginPage;
import com.Target.genericUtility.seleniumUtility.Java_Utility;
import com.Target.genericUtility.seleniumUtility.WebDriver_Utility;



public class BaseClass {

	
	public Database_Utility dLib = new Database_Utility();
	public WebDriver driver;

	public static WebDriver sdriver;
	public Property_FileUtility pLib=new Property_FileUtility();
	public Java_Utility jLib = new Java_Utility();
	public WebDriver_Utility wLib = new WebDriver_Utility();
	public Excel_FileUtility eLib = new Excel_FileUtility();
	@BeforeSuite(groups= {"SmokeSuite","RegressionSuite"})
	public void bsConfig() throws SQLException
	{
		
		dLib.getDbConnection();
		System.out.println("---DB Connection successfull");
	}

	@Parameters("browser")
	@BeforeClass(groups= {"SmokeSuite","RegressionSuite"})
	public void bcConfig(String browser ) throws IOException  
	{
		String URL= pLib.getDataFromPropertiesFile("url");
		//String BROWSER =pLib.getDataFromPropertiesFile("browser");
		String BROWSER=browser;
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
		 sdriver=driver;
		 wLib.maximizeWindow(driver);
		 wLib.waitForPageToLoad(driver);
		driver.get(URL);
		System.out.println("---Browser Launched---");
	}

	@BeforeMethod(groups= {"SmokeSuite","RegressionSuite"})
	
	public void bmConfig() throws IOException
	{
	
		
		
		String URL = pLib.getDataFromPropertiesFile("url");
		 String EMAIL=pLib.getDataFromPropertiesFile("email");
		 String PASSWORD=pLib.getDataFromPropertiesFile("password");
	
		LoginPage lp= new LoginPage(driver);
		lp.loginToApp(EMAIL, PASSWORD);
		System.out.println("---Login Successfull----");
		
	}
	@AfterMethod(groups= {"SmokeSuite","RegressionSuite"})
	
	public void amConfig() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.logOutToApp();
		System.out.println("---LogOut Successfull----");
	}
	

	@AfterClass(groups= {"SmokeSuite","RegressionSuite"})
	
	public void acConfig()
	{
		driver.quit();
		System.out.println("----Browser closed successfully---");
		
	}
	@AfterSuite(groups= {"SmokeSuite","RegressionSuite"})
	
	public void asConfig() throws SQLException
	{
		
		dLib.closeDbConnection();
		System.out.println("----DB closed successfully----");
	}
}
