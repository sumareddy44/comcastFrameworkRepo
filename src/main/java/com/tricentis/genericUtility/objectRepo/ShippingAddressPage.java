package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressPage {

	@FindBy(xpath="//div[@id='shipping-buttons-container']/input")
	private WebElement continueBtnForShipAddress;
	WebDriver driver;
	public ShippingAddressPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public void navigateToShippingMethod()
	{
		continueBtnForShipAddress.click();
	}
}
