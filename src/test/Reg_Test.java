package test;


import base.BaseClass;
import page.Reg_Page;

public class Reg_Test extends BaseClass
{
	public static void registration() throws InterruptedException
	{
		Reg_Page obj= new Reg_Page(d);
		
		obj.btnClick(obj.logBtn);
		obj.btnClick(obj.regBtn);
		obj.setValues(obj.fname, "Betson");
		obj.setValues(obj.lname, "Jose");
		obj.setValues(obj.regEmail, "bava@gmail.com");
		obj.setValues(obj.pwd, "bet@123");
		obj.btnClick(obj.ctaccBtn);
		Thread.sleep(5000);
		obj.btnClick(obj.logBtn);
		obj.btnClick(obj.logout);
	}
}
