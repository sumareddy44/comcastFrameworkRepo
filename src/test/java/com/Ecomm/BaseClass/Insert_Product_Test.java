package com.Ecomm.BaseClass;

import org.testng.annotations.Test;

import com.Target.Ecomm.GenericUtility.baseClass.BaseClass;

public class Insert_Product_Test extends BaseClass {

	@Test(groups="SmokeSuite")
	public void insert_Product_Test()
	{
		System.out.println("Product inserted===PASS");
	}
	@Test
	public void edit_Product_Test()
	{
		System.out.println("Product Edited===PASS");
	}
	@Test
	public void delete_Product_Test()
	{
		System.out.println("Product deleted===PASS");
	}
}
