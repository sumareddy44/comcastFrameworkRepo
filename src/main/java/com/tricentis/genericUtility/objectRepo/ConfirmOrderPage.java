package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage {

	@FindBy(xpath="//div[@id='confirm-order-buttons-container']/input")
	private WebElement confirmOrderBtn;
	@FindBy(xpath="//div[@class='title']")
	private WebElement title;
	WebDriver driver;
	
	public WebElement geConfirmOrderBtn() {
		return confirmOrderBtn;
	}
	public WebElement getTitle() {
		return title;
	}
	public ConfirmOrderPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public void confirmOrder()
	{
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		confirmOrderBtn.click();	
	}
}
