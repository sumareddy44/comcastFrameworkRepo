package com.Target.genericUtility.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver; // 
	@FindBy(linkText=" Create Category ")
	private WebElement createCatLink;
	@FindBy(className="menu-icon.icon-paste")
	private WebElement insertProduct;
	@FindBy(linkText="Sub Category ")
	private WebElement subCateLink;
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement adminDpDwn;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement signOutLink;
	 
		public HomePage(WebDriver driver)
		{
			this.driver = driver; //
			PageFactory.initElements(driver, this);  // initialized elements in the class
		}
	public WebElement getCreateCatLink() {
		return createCatLink;
	}
	public WebElement getInsertProduct() {
		return insertProduct;
	}
	public WebElement getSubCateLink() {
		return subCateLink;
		
	}
	
	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
	public WebElement getAdminDpDwn() {
		return adminDpDwn;
	}

	
	
	public void logOutToApp()
	{
		adminDpDwn.click();
		signOutLink.click();
		
	}
	
}
