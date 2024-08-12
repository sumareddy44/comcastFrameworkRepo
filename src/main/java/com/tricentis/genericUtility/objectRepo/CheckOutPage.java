package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

	@FindBy(xpath="//input[@value='Go to cart']")
	private WebElement checkOutBtn;
	@FindBy(xpath="//div[@id='checkout-step-billing']/div/input")
	private WebElement continueBtn;
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	private WebElement firstNameEdt;
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	private WebElement lastNameEdt;
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	private WebElement countryDpDwn;
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	private WebElement cityEdt;
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	private WebElement addressEdt;
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement zipCodeEdt;
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phoneNumEdt;
	
	
	@FindBy(xpath="//div[@id='payment-method-buttons-container']/input")
	private WebElement continueBtnForPayMethod;
	@FindBy(xpath="//div[@id='payment-info-buttons-container']/input")
	private WebElement continueBtnForPayInfo;
	@FindBy(xpath="//div[@id='confirm-order-buttons-container']/input")
	private WebElement continueBtnForConfirmOrder;
	@FindBy(xpath="//div[@class='title']")
	private WebElement title;
	
	WebDriver driver;
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}
	public void navigateToShippingAddressPage()
	{
		firstNameEdt.sendKeys("Suma_");
		lastNameEdt.sendKeys("Reddy");
		Select sel= new Select(countryDpDwn);
		sel.selectByVisibleText("India");
		cityEdt.sendKeys("Bangalore");
		addressEdt.sendKeys("hebbal");
		zipCodeEdt.sendKeys("516016");
		phoneNumEdt.sendKeys("123890099");
		continueBtn.click();
		
	}
	
}
