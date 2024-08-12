package com.tricentis.systemtesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tricentis.genericUtility.baseClass.BaseClass;
import com.tricentis.genericUtility.objectRepo.CheckOutPage;
import com.tricentis.genericUtility.objectRepo.ConfirmOrderPage;
import com.tricentis.genericUtility.objectRepo.HomePage;
import com.tricentis.genericUtility.objectRepo.PaymentInfoPage;
import com.tricentis.genericUtility.objectRepo.PaymentMethodPage;
import com.tricentis.genericUtility.objectRepo.ProductPage;
import com.tricentis.genericUtility.objectRepo.RegisterPage;
import com.tricentis.genericUtility.objectRepo.SearchPage;
import com.tricentis.genericUtility.objectRepo.ShipMethodPage;
import com.tricentis.genericUtility.objectRepo.ShippingAddressPage;
import com.tricentis.genericUtility.objectRepo.ShoppingCartPage;



public class EndToEnd_Test extends BaseClass{

	@Test
	public void end_To_End_Test() throws EncryptedDocumentException, IOException, InterruptedException
	{
	
		
		HomePage hp = new HomePage(driver);
		hp.navigateToSearchPage();
		SearchPage sp= new SearchPage(driver);
		String SORTBY=eLib.getDataFromExcel("EndScenario", 1, 7);
		String DISPLAY=eLib.getDataFromExcel("EndScenario", 1, 8);
		String VIEWAS=eLib.getDataFromExcel("EndScenario", 1, 9);
		sp.navigateTpProductPage(SORTBY,DISPLAY,VIEWAS);
		ProductPage pp= new ProductPage(driver);
		pp.navigateToCartPage();
		ShoppingCartPage shp= new ShoppingCartPage(driver);
		//validating
		Thread.sleep(2000);
		String productText = shp.getProductName().getText();
		Assert.assertTrue(productText.contains("Smartphone"));
		System.out.println("productName verified======PASS");
		Thread.sleep(2000);
		String QUANTITY=eLib.getDataFromExcel("EndScenario", 1, 6);
		shp.updateCart(QUANTITY);
		
		Thread.sleep(2000);
		String price = shp.getTotalPrice().getText();
		Assert.assertTrue(price.contains("200"));
		System.out.println("productPrice verified======PASS");
		Thread.sleep(2000);
		shp.navigateToCheckOutPage();
		CheckOutPage ckp=new CheckOutPage(driver);
		ckp.navigateToShippingAddressPage();
		ShippingAddressPage sap= new ShippingAddressPage(driver);
		sap.navigateToShippingMethod();
		ShipMethodPage smp=new ShipMethodPage(driver);
		smp.navigateToPayMethod();
        Thread.sleep(2000);
		PaymentMethodPage pmp=new PaymentMethodPage(driver);
		pmp.navigateToPayInfo();
		Thread.sleep(2000);
		  		PaymentInfoPage pip = new PaymentInfoPage(driver);
		pip.navigateToConfirmPage();
		  Thread.sleep(2000);
		ConfirmOrderPage cop=new ConfirmOrderPage(driver);
		cop.confirmOrder();
		//validate
		Thread.sleep(2000);
		String text = cop.getTitle().getText();
		Assert.assertTrue(text.contains("successfully"));
		System.out.println("Order Placed Successfully");
		
	}
}
