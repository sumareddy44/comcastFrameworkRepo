package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//input[@id='small-searchterms']")
	private WebElement searchEdt;
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchBtn;
	@FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	private WebElement eleDrDwn;
	@FindBy(xpath="(//a[contains(text(),'Cell phones')])[1]")
	private WebElement cellPhones;
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement lgoutBtn;
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public WebElement getSearchEdt() {
		return searchEdt;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public void navigateToSearchPage()
	{
		Actions act = new Actions(driver);
		act.moveToElement(eleDrDwn).perform();
		cellPhones.click();
	}
	public void logOutToApp()
	{
		lgoutBtn.click();
	}
	
}
