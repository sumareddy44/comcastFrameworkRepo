package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement cartBtn;
	WebDriver driver;
	public ProductPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public WebElement getCartBtn() {
		return cartBtn;
	}
	public void navigateToCartPage()
	{
		cartBtn.click();
	}
	
}
