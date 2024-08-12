package com.Target.genericUtility.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Category_Info_Page {

	@FindBy(linkText="Well done!")
	private WebElement cat_text;

	public WebElement getCat_text() {
		return cat_text;
	}
	
	
}
