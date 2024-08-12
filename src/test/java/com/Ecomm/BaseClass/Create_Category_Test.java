package com.Ecomm.BaseClass;

import org.testng.annotations.Test;

import com.Target.Ecomm.GenericUtility.baseClass.BaseClass;

public class Create_Category_Test extends BaseClass {

	@Test(groups="SmokeSuite")
	public void create_Cat_Test()
	{
		System.out.println("created Category===PASS");
	}
	@Test
	public void edit_Cat_Test()
	{
		System.out.println("editedCategory===PASS");
	}
	@Test
	public void delete_Cat_Test()
	{
		System.out.println("deleted Category===PASS");
	}
}
