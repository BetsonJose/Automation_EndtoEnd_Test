package test;


import base.BaseClass;
import page.Login_Page;

public class Login_Test extends BaseClass
{
	
	public static void login() throws InterruptedException
	{
		Login_Page logobj = new Login_Page(d);
		
		logobj.btnClick(logobj.logBtn);
		Thread.sleep(1000);
		logobj.setValues(logobj.regEmail,"bava@gmail.com");
		Thread.sleep(1000);
		logobj.setValues(logobj.pwd, "bet@123");
		logobj.btnClick(logobj.loginBtn);
		
	}
}
