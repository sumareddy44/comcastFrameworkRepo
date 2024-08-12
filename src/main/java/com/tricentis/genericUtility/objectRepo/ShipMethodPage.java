package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShipMethodPage {

	@FindBy(xpath="//div[@id='shipping-method-buttons-container']/input[@value='Continue']")
	private WebElement continueBtnForPayMethod;
	WebDriver driver;
	public ShipMethodPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public void navigateToPayMethod()
	{
		continueBtnForPayMethod.click();
	}
}
