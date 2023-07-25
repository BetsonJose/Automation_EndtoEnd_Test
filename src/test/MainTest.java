package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.BaseClass;

public class MainTest extends BaseClass
{
	@Test
	
	public void endtoendTest() throws InterruptedException, AWTException
	{
		Reg_Test.registration();
		Login_Test.login();
		Product_Test.product();
		AddtoCart_Test.addtoCart();
		Checkout_Test.checkout();
	}
}
