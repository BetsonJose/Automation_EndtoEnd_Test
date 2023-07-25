package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page 
{
	public WebDriver d;
	
	public By loginBtn= By.xpath("/html/body/div[6]/div[1]/section/div/div[1]/div[2]/div/div/form/button/span[1]");
	public By logBtn= By.xpath("/html/body/div[4]/store-header/div/div/div/div/a[3]");
	public By regEmail= By.id("customer[email]");
	public By pwd= By.id("customer[password]");
	
	public Login_Page(WebDriver d)
	{
		this.d= d;
	}
	
	public void setValues(By element, String data)
	{
		d.findElement(element).sendKeys(data);
	}
	
	public void btnClick(By element)
	{
		d.findElement(element).click();
	}
}
