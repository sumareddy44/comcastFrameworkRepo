package com.Target.genericUtility.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Insert_Product_Page {

	@FindBy(name="category")
	private WebElement categoryDpDwn;
	@FindBy(name="productName")
	private WebElement prodName;
	@FindBy(id="subcategory")
	private WebElement subCatDpDwn;
	@FindBy(name="productpricebd")
	private WebElement productPriceBD;
	@FindBy(name="productprice")
	private WebElement prodPrice;
	@FindBy(name="productShippingcharge")
	private WebElement shippingCharge;
	@FindBy(name="productAvailability")
	private WebElement prodAvail;
	@FindBy(name="productimage1")
	private WebElement image1;
	@FindBy(name="productimage2")
	private WebElement image2;
	@FindBy(name="productimage3")
	private WebElement image3;
	@FindBy(linkText="submit")
	private WebElement insertBtn;
	public WebElement getCategoryDpDwn() {
		return categoryDpDwn;
	}
	public WebElement getProdName() {
		return prodName;
	}
	public WebElement getSubCatDpDwn() {
		return subCatDpDwn;
	}
	public WebElement getProductPriceBD() {
		return productPriceBD;
	}
	public WebElement getProdPrice() {
		return prodPrice;
	}
	public WebElement getShippingCharge() {
		return shippingCharge;
	}
	public WebElement getProdAvail() {
		return prodAvail;
	}
	public WebElement getImage1() {
		return image1;
	}
	public WebElement getImage2() {
		return image2;
	}
	public WebElement getImage3() {
		return image3;
	}
	public WebElement getInsertBtn() {
		return insertBtn;
	}
	
	
}
