package com.tricentis.genericUtility.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	@FindBy(id="products-orderby")
	private WebElement sortByDpDn;
	@FindBy(id="products-pagesize")
	private WebElement displayDpDn;
	@FindBy(id="products-viewmode")
	private WebElement viewAsDpDn;
	@FindBy(xpath="//div[contains(text(),'smartphone')]/../div/div/input")
	private WebElement product;
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver = driver; //
		PageFactory.initElements(driver, this);  // initialized elements in the class
	}
	public WebElement getSortByDpDn() {
		return sortByDpDn;
	}
	public WebElement getDisplayDpDn() {
		return displayDpDn;
	}
	public WebElement getViewAsDpDn() {
		return viewAsDpDn;
	}
	public WebElement getProduct() {
		return product;
	}
	public void navigateTpProductPage(String SORTBY,String DISPLAY,String VIEWAS)
	{
		sortByDpDn.sendKeys(SORTBY);
		displayDpDn.sendKeys(DISPLAY);
		viewAsDpDn.sendKeys(VIEWAS);
		product.click();	
	}
}
