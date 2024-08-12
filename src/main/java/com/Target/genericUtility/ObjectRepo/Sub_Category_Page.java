package com.Target.genericUtility.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sub_Category_Page {

	@FindBy(name="category")
	private WebElement createDpDwn;
	@FindBy(name="subcategory")
	private WebElement subCate;
	@FindBy(linkText="Create")
	private WebElement createBtn;
	public WebElement getCreateDpDwn() {
		return createDpDwn;
	}
	public WebElement getSubCate() {
		return subCate;
	}
	public WebElement getCreateBtn() {
		return createBtn;
	}
	
}

