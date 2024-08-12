package com.Target.genericUtility.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Category_Page {

	@FindBy(name="category")
	private WebElement catName;
	@FindBy(linkText="Create")
	private WebElement createBtn;
	public WebElement getCatName() {
		return catName;
	}
	public WebElement getCreateBtn() {
		return createBtn;
	}
	
	
}
