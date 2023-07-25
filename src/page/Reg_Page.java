package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reg_Page 
{
	public WebDriver d;
	
	public By logBtn= By.xpath("/html/body/div[4]/store-header/div/div/div/div/a[3]");
	public By regBtn= By.xpath("/html/body/div[6]/div[1]/section/div/div[1]/div[2]/div/div/form/span/a");
	public By fname= By.id("customer[first_name]");
	public By lname= By.id("customer[last_name]");
	public By regEmail= By.id("customer[email]");
	public By pwd= By.id("customer[password]");
	public By ctaccBtn= By.xpath("/html/body/div[6]/div[1]/section/div/div[2]/div/div/form/button/span[1]");
	public By logout= By.xpath("/html/body/div[6]/div[1]/section/div[1]/div/div/ul/li[3]/a");
	
	public Reg_Page(WebDriver d) 
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
