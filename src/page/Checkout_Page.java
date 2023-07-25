package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Checkout_Page 
{
	public WebDriver d;
	
	public By checkoutBtn= By.xpath("/html/body/div[5]/div[1]/section/div/div[2]/form/div[2]/safe-sticky/div/button");
	public By addrdropDown= By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div/div/div[1]/div[1]/div/div/select");
	public By fname= By.name("firstName");
	public By lname= By.name("lastName");
	public By address= By.name("address1");
	public By aptmntno= By.name("address2");
	public By city= By.name("city");
	public By state= By.name("zone");
	public By pincode= By.name("postalCode");
	public By phone= By.name("phone");
	public By shipBtn= By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[2]/div[1]/button");
	public By shipmethod= By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div/div[1]/section/div/div[2]/fieldset/div[2]/div[2]/label/div/div[2]/div[1]/p[2]");
	public By paymentBtn= By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div/div[2]/div[1]/button");
	public By billaddr= By.name("billing_address_selector");
	public By completeBtn= By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/div/form/div[1]/div/div[2]/div[1]/button");
	public By continueBtn= By.xpath("/html/body/div[1]/div/div/main/div[1]/div[2]/a/span");
	
	public void setValues(By element, String data)
	{
		d.findElement(element).sendKeys(data);
	}
	
	public void btnClick(By element)
	{
		d.findElement(element).click();
	}
	
	public Checkout_Page(WebDriver d)
	{
		this.d= d;
	}
	
	public void dropDown(By element, String value)
	{
		WebElement addr= d.findElement(element);
		Select s= new Select(addr);
		s.selectByValue(value);
	}
}
