package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement cartLink;
	@FindBy(xpath="//a[@class='product-name']")
	private WebElement productName;
	@FindBy(xpath="//tr[@class='cart-item-row']/td[@class='remove-from-cart']")
	private WebElement checkBox;
	@FindBy(xpath="//input[contains(@name,'itemquantity')]")
	private WebElement qtyEdit;
	@FindBy(xpath="//input[contains(@name,'continueshopping')]")
	private WebElement conShopBtn;
	@FindBy(xpath="//span[@class='product-subtotal']")
	private WebElement totalPrice;
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement termsChkBox;
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement ckeckOutBtn;
	@FindBy(xpath="//input[@name='updatecart']")
	private WebElement updateBtn;
	WebDriver driver;
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	
	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getQtyEdit() {
		return qtyEdit;
	}

	public WebElement getConShopBtn() {
		return conShopBtn;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}
	
	public WebElement getUpdateBtn() {
		return updateBtn;
	}
	public void updateCart(String QUANTITY)
	{
		//checkBox.click();
		qtyEdit.clear();
		qtyEdit.sendKeys(QUANTITY);
		updateBtn.click();
		
	}
	public void navigateToCheckOutPage()
	{
		termsChkBox.click();
		ckeckOutBtn.click();
	}
	
	
}
