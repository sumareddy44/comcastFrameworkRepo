package com.Target.genericUtility.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sub_Category_Info_Page {

	@FindBy(linkText="Well done!")
	private WebElement subCateText;

	public WebElement getSubCateText() {
		return subCateText;
	}
	
}
