package com.Ecomm.BaseClass;

import org.testng.annotations.Test;

import com.Target.Ecomm.GenericUtility.baseClass.BaseClass;

public class Create_Sub_Category_Test extends BaseClass {

	@Test(groups="SmokeSuite")
	public void create_Sub_Cat_Test()
	{
		System.out.println("created Sub Category===PASS");
	}
	@Test
	public void edit_Sub_Cat_Test()
	{
		System.out.println("edited Sub Category===PASS");
	}
	public void delete_Sub_Cat_Test()
	{
		System.out.println("deleted Sub Category===PASS");
	}
}
