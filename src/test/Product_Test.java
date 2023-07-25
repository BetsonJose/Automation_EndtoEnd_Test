package test;

import base.BaseClass;
import page.Product_Page;

public class Product_Test extends BaseClass
{
	
	public static void product() throws InterruptedException
	{
		Product_Page obj= new Product_Page(d);
		
		obj.btnClick(obj.shopBtn);
		obj.moveto(obj.menu);
		obj.btnClick(obj.KeyBtn);
		obj.btnClick(obj.product);
	}
}
