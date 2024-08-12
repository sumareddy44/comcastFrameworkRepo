package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage {
	@FindBy(xpath="//div[@id='payment-method-buttons-container']/input[@value='Continue']")
	private WebElement continueBtnForPayInfo;
	WebDriver driver;
	public PaymentMethodPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public void navigateToPayInfo()
	
	{
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		continueBtnForPayInfo.click();
	}
}
