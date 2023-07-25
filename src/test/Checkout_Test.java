package test;

import java.awt.AWTException;


import base.BaseClass;
import page.Checkout_Page;

public class Checkout_Test extends BaseClass
{
	public static void checkout() throws InterruptedException, AWTException
	{
		Checkout_Page obj= new Checkout_Page(d);
		
		obj.btnClick(obj.checkoutBtn);
		obj.dropDown(obj.addrdropDown, "1");
		obj.setValues(obj.fname, "Abin");
		obj.setValues(obj.lname, "Raju");
		obj.setValues(obj.address, "Erumeli P.O");
		obj.setValues(obj.aptmntno, "12B");
		obj.setValues(obj.city, "Kottayam");
		obj.dropDown(obj.state, "KL");
		obj.setValues(obj.pincode, "686507");
		obj.setValues(obj.phone, "9447600265");
		obj.btnClick(obj.shipBtn);
		
		obj.btnClick(obj.shipmethod);
		obj.btnClick(obj.paymentBtn);
		obj.btnClick(obj.billaddr);
		obj.btnClick(obj.completeBtn);
		Thread.sleep(20000);
		obj.btnClick(obj.continueBtn);
	}
}
