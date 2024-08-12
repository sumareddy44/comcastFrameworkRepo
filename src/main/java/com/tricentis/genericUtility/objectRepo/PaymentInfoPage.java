package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInfoPage {

	@FindBy(xpath="//div[@id='payment-info-buttons-container']/input[@value='Continue']")
	private WebElement continueBtnForConfirmOrder;
	
	WebDriver driver;
	public PaymentInfoPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public void navigateToConfirmPage()
	{
		continueBtnForConfirmOrder.click();
	}
}
