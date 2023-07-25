package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Product_Page 
{
	WebDriver d;
	
	public By shopBtn= By.xpath("/html/body/div[6]/div[1]/section/div[3]/div/div[1]/div/div/a");
	public By menu= By.xpath("//*[@id=\"shopify-section-header\"]/store-header/div/div/nav/desktop-navigation/ul/li[4]/a");
	public By KeyBtn= By.xpath("//*[@id=\"desktop-menu-4\"]/div/div/div/div[18]/a");
	public By product= By.xpath("//*[@id=\"facet-main\"]/product-list/div/product-item[4]/div[2]/div/a");

	

	public Product_Page(WebDriver d) {
		this.d= d;
	}

	public void moveto(By element)
	{
		Actions act= new Actions(d);
		act.moveToElement(d.findElement(element)).perform();
	}
	
	public void btnClick(By element)
	{
		d.findElement(element).click();
	}
}
