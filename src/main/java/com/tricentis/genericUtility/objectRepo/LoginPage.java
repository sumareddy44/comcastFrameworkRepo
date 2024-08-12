package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailEdt;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement pwdEdt;
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement lgnBtn;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueBtn;
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public WebElement getEmailEdt() {
		return emailEdt;
	}
	public WebElement getPwdEdt() {
		return pwdEdt;
	}
	public WebElement getLgnBtn() {
		return lgnBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public void loginToApp(String EMAIL, String PASSWORD)
	{
		emailEdt.sendKeys(EMAIL);
		pwdEdt.sendKeys(PASSWORD);
		lgnBtn.click();
	}
}
