package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(linkText="//label[text()='Gender:']/..")
 // @FindBy(xpath="//label[text()='Gender:']")
	private WebElement genderRdBtn;
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstNmEdt;
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastNmEdt;
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailEdt;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement pwdEdt;
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement confirmPwdEdt;
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement registerBtn;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueBtn;
	WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public WebElement getGenderRdBtn() {
		return genderRdBtn;
	}
	
	public WebElement getFirstNmEdt() {
		return firstNmEdt;
	}
	
	public WebElement getLastNmEdt() {
		return lastNmEdt;
	}
	
	public WebElement getEmailEdt() {
		return emailEdt;
	}
	
	public WebElement getPwdEdt() {
		return pwdEdt;
	}
	
	public WebElement getConfirmPwdEdt() {
		return confirmPwdEdt;
	}
	
	public WebElement getRegisterBtn() {
		return registerBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public void registerToApp(String FIRSTNAME,String LASTNAME,String EMAIL,String PASSWORD,String CONFIRMPASSWORD)
	{
		firstNmEdt.sendKeys(FIRSTNAME);
		lastNmEdt.sendKeys(LASTNAME);
		emailEdt.sendKeys(EMAIL);
		pwdEdt.sendKeys(PASSWORD);
		confirmPwdEdt.sendKeys(CONFIRMPASSWORD);
		registerBtn.click();
		continueBtn.click();
	}
	
}
