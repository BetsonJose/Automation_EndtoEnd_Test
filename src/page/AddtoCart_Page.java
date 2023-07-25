package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AddtoCart_Page 
{
	public WebDriver d;
	
	public By qty= By.xpath("/html/body/div[6]/div[1]/section/div/div/div/div[1]/span/div/span/quantity-selector/button[2]");
	public By upload= By.id("file-1");
	public By gwrapToggle= By.xpath("/html/body/div[6]/div[1]/section/div/div/div/div[1]/div/form/div[1]/div/div[2]/div[1]/label");
	public By gwrap= By.xpath("/html/body/div[6]/div[1]/section/div/div/div/div[1]/div/form/div[1]/div/div[4]/div[1]/div[5]/label/span/span");
	public By gmsgToggle= By.xpath("/html/body/div[6]/div[1]/section/div/div/div/div[1]/div/form/div[1]/div/div[3]/div[1]/label");
	public By gmsgTo= By.name("To");
	public By gmsgFrom= By.name("From");
	public By gmsgMsg= By.name("Message");
	public By gcardToggle= By.xpath("/html/body/div[6]/div[1]/section/div/div/div/div[1]/div/form/div[1]/div/div[8]/div[1]/label");
	public By gcard= By.xpath("/html/body/div[6]/div[1]/section/div/div/div/div[1]/div/form/div[1]/div/div[9]/div[1]/div[5]/label/span/span");
	public By buyBtn= By.xpath("/html/body/div[6]/div[1]/section/div/div/div/div[1]/div/form/product-payment-container/div[1]/div/div/div/button[1]");
	public By addtocartBtn= By.xpath("/html/body/div[6]/div[1]/section/div/div/div/div[1]/div/form/product-payment-container/button[1]/span[1]/span[1]");
	
	public AddtoCart_Page(WebDriver d) 
	{
		this.d=d;
	}

	public void setValues(By element, String data)
	{
		d.findElement(element).sendKeys(data);
	}
	
	public void btnClick(By element)
	{
		d.findElement(element).click();
	}
	
	public void fileUpload(String path) throws AWTException
	{
		StringSelection select= new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		Robot rob= new Robot();
		rob.delay(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void alerts()
	{
		Alert a= d.switchTo().alert();
		a.accept();
	}
	
	public void moveto(By element)
	{
		Actions act= new Actions(d);
		act.moveToElement(d.findElement(element)).click().perform();
	}

}
