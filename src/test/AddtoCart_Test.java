package test;

import java.awt.AWTException;

import base.BaseClass;
import page.AddtoCart_Page;

public class AddtoCart_Test extends BaseClass
{
	public static void addtoCart() throws AWTException, InterruptedException
	{
		AddtoCart_Page obj= new AddtoCart_Page(d);
		
		obj.btnClick(obj.qty);
		obj.moveto(obj.upload);
		obj.fileUpload("C:\\Users\\hp\\Downloads\\photo_gift.jpg");
		Thread.sleep(2000);
		obj.btnClick(obj.gwrapToggle);
		obj.btnClick(obj.gwrap);
		obj.btnClick(obj.gmsgToggle);
		obj.btnClick(obj.gmsgTo);
		obj.setValues(obj.gmsgTo, "Dayana");
		obj.btnClick(obj.gmsgFrom);
		obj.setValues(obj.gmsgFrom, "Naveen");
		obj.btnClick(obj.gmsgMsg);
		obj.setValues(obj.gmsgMsg, "Happy Birthday");
		obj.btnClick(obj.gcardToggle);
		obj.btnClick(obj.gcard);
		obj.btnClick(obj.buyBtn);
		obj.alerts();
		obj.btnClick(obj.addtocartBtn);
	}
	
}
