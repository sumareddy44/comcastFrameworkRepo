package com.Target.genericUtility.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="inputEmail")
	private WebElement unEdt;
	@FindBy(id="inputPassword")
	private WebElement pwdEdt;
	@FindBy(name="submit")
	private WebElement lgnBtn;
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	 // Rule 4: Utilization	
	public WebElement getUnEdt() {
		return unEdt;
	}
	public WebElement getPwdEdt() {
		return pwdEdt;
	}
	public WebElement getLgnBtn() {
		return lgnBtn;
	}
  // Rule 5	:Business Library
	public void loginToApp(String USERNAME,String PASSWORD)
	{
		driver.manage().window().maximize();
		unEdt.sendKeys(USERNAME);
		pwdEdt.sendKeys(PASSWORD);
		lgnBtn.click();
	}
}
